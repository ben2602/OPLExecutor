package org.imf.oplexecutor.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.imf.oplexecutor.database.AccessManager;
import org.imf.oplexecutor.exception.DataException;
import org.imf.oplexecutor.fims.bms.ErrorCodeType;
import org.imf.oplexecutor.fims.bms.JobCommandType;
import org.imf.oplexecutor.fims.bms.JobStatusType;
import org.imf.oplexecutor.fims.bms.JobType;
import org.imf.oplexecutor.fims.bms.JobsType;
import org.imf.oplexecutor.fims.bms.ManageJobRequestType;
import org.imf.oplexecutor.fims.bms.ManageJobResponseType;
import org.imf.oplexecutor.fims.bms.PriorityType;
import org.imf.oplexecutor.fims.bms.QueryJobResponseType;
import org.imf.oplexecutor.fims.tfms.TransformJobType;
import org.imf.oplexecutor.fims.tfms.TransformRequestType;
import org.imf.oplexecutor.fims.tfms.TransformResponseType;
import org.imf.oplexecutor.macro.AssetMapFinder;
import org.imf.oplexecutor.macro.AssetMapReader;
import org.imf.oplexecutor.macro.OPLReader;
import org.imf.oplexecutor.macro.UUIDGenerator;
import org.imf.oplexecutor.model.Job;
import org.imf.oplexecutor.model.Opl;
import org.imf.oplexecutor.validator.TransformRequestValidator;


@Path("/job")
public class JobService {

	@POST 
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Response transform(TransformRequestType tRt) {
				
		TransformRequestValidator tRv = new TransformRequestValidator();
		tRv.validate(tRt);
		TransformResponseType tA = tRv.create(tRt);
		tA.getTransformJob().setResourceCreationDate(tRv.getXMLGregorianCalendarNow());
		
		OPLReader oplreader = new OPLReader();
		Opl opl = new Opl();
		opl = oplreader.getOPLData(tA.getTransformJob().getProfiles().getTransformProfile().get(0).getLocation());
		
	
		File f = new File(tA.getTransformJob().getProfiles().getTransformProfile().get(0).getLocation());
		AssetMapFinder amf = new AssetMapFinder(f.getParent());
		String ampath = amf.find();
		
		AssetMapReader amr = new AssetMapReader(ampath);
		amr.getCplFileName(oplreader.getCplId());
		
		opl.setOplId(oplreader.getOplId());
		opl.setAnnotation(oplreader.getAnnotation());
		opl.setCplPath(amr.getCplPath());
		opl.setIssueDate(oplreader.getIssueDate());
		opl.setCplId(oplreader.getCplId());
		opl.setOplPath(tRt.getTransformJob().getProfiles().getTransformProfile().get(0).getLocation());
		
		Job job = new Job();
		job.setResourceID(tRt.getTransformJob().getResourceID());
		job.setLocation(tRt.getTransformJob().getProfiles().getTransformProfile().get(0).getLocation());
		job.setDestination(tRt.getTransformJob().getProfiles().getTransformProfile().get(0).getTransferAtom().get(0).getDestination());
		job.setResourceIDtP(tRt.getTransformJob().getProfiles().getTransformProfile().get(0).getResourceID());
		job.setResourceCreationDate(tRv.getXMLGregorianCalendarNow());
		job.setOutputFileNamePattern(tRt.getTransformJob().getProfiles().getTransformProfile().get(0).getOutputFileNamePattern());
		job.setStatus(JobStatusType.QUEUED);
		job.setPriority(tA.getTransformJob().getPriority());
		job.setOpl(opl);
		if(tRt.getTransformJob().getProfiles().getTransformProfile().get(0).getNotifyAt() != null) {
			job.setNotifyReply(tRt.getTransformJob().getProfiles().getTransformProfile().get(0).getNotifyAt().getReplyTo());
			job.setNotifyFault(tRt.getTransformJob().getProfiles().getTransformProfile().get(0).getNotifyAt().getFaultTo());
		}
			
		AccessManager accessManager = new AccessManager();
		accessManager.writeToDB(job);
		
		return Response.status(201).entity(tA).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public QueryJobResponseType queryJobAll(@QueryParam("jobId") List<String> jobId, 
											@QueryParam("status") String status, 
											@QueryParam("priority") String priority)
	
	{
		//Gets all Jobs from the database
		ArrayList<Job> jobList = new ArrayList<Job>();
		
		try {
			jobList = new AccessManager().getAllJobs();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		//Checking for QueryParams for Filtering
		ArrayList<Job> jobResultList = new ArrayList<Job>();
		
		try {
			if(!jobId.isEmpty()) {
				for(String s: jobId) {
					new UUIDGenerator().check(s);
					for(Job j: jobList) {
						if(j.getResourceID().matches(s)) {
							jobResultList.add(j);
						}
					}
				}
			} else if(status != null) {
				JobStatusType stat = JobStatusType.valueOf(status);
				for(Job j:jobList) {
					if(j.getStatus() == stat) {
						jobResultList.add(j);
					}
				}
			} else if(priority != null) {
				PriorityType prio = PriorityType.valueOf(priority);
				for(Job j:jobList) {
					if(j.getPriority() == prio) {
						jobResultList.add(j);
					}
				}
			}else {
				jobResultList = jobList;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DataException(ErrorCodeType.DAT_S_00_0006,"Invalid request parameters","BadRequest");
		}
		
		
		//Create Response
		QueryJobResponseType qJR = new QueryJobResponseType();
		JobsType jobsType = new JobsType();
		org.imf.oplexecutor.fims.bms.ObjectFactory factory = new org.imf.oplexecutor.fims.bms.ObjectFactory();
		
		for (Job j: jobResultList)
		{
			TransformJobType tJt = new TransformJobType();
			JAXBElement<JobType> jT = factory.createJob(tJt);
			tJt.setResourceID(j.getResourceID());
			tJt.setLocation(j.getLocation());
			tJt.setResourceCreationDate(j.getResourceCreationDate());
			tJt.setJobStartedTime(j.getJobStartedTime());
			tJt.setJobCompletedTime(j.getJobCompletedTime());
			tJt.setStatus(j.getStatus());
			tJt.setPriority(j.getPriority());

			jobsType.getAny().add(jT);
		}
		
		qJR.setJobs(jobsType);
		return qJR;	
	}
	
	@GET
	@Path("/{jobId}")
	@Produces(MediaType.APPLICATION_XML)
	public QueryJobResponseType queryJobSingle(@PathParam("jobId") String id){
		
		ArrayList<Job> jobList = new ArrayList<Job>();
		
		try {
			jobList = new AccessManager().getSingleJob(id);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		QueryJobResponseType qJR = new QueryJobResponseType();
		JobsType jobsType = new JobsType();
		org.imf.oplexecutor.fims.bms.ObjectFactory factory = new org.imf.oplexecutor.fims.bms.ObjectFactory();
		
		for (Job j: jobList)
		{
			TransformJobType tJt = new TransformJobType();
			JAXBElement<JobType> jT = factory.createJob(tJt);
			tJt.setResourceID(j.getResourceID());
			tJt.setLocation(j.getLocation());
			tJt.setResourceCreationDate(j.getResourceCreationDate());
			tJt.setJobStartedTime(j.getJobStartedTime());
			tJt.setJobCompletedTime(j.getJobCompletedTime());
			tJt.setStatus(j.getStatus());
			tJt.setPriority(j.getPriority());
			jobsType.getAny().add(jT);
		}
		
		qJR.setJobs(jobsType);
		return qJR;	
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{jobId}/manage")
	public Response manage(@PathParam("jobId") String jobId, ManageJobRequestType mJRequest) {
		
		if (!jobId.contentEquals(mJRequest.getJobID()) || jobId == null || mJRequest.getJobID() == null) {
			throw new DataException(ErrorCodeType.DAT_S_00_0006,"Invalid request paramenters","jobID's must be equal");
		}
		
		ArrayList<Job> jobList = new ArrayList<Job>();
		
		try {
			jobList = new AccessManager().getSingleJob(jobId);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		switch (mJRequest.getJobCommand()) {
		
			case CANCEL: 	jobList.get(0).setStatus(JobStatusType.CANCELED);
							break;
							
			case PAUSE:		jobList.get(0).setStatus(JobStatusType.PAUSED);
							break;
							
			case RESUME:	jobList.get(0).setStatus(JobStatusType.QUEUED);
							break;
							
			case RESTART:	jobList.get(0).setStatus(JobStatusType.QUEUED);
							jobList.get(0).setJobStartedTime(null);
							jobList.get(0).setJobCompletedTime(null);
							break;
							
			case STOP:		jobList.get(0).setStatus(JobStatusType.STOPPED);
							break;
							
			case CLEANUP: throw new DataException(ErrorCodeType.DAT_S_00_0007,"Job Command not supported, yet","Non supported Job Command");
							
			case MODIFY_PRIORITY:
							jobList.get(0).setPriority(mJRequest.getPriority());
				
			default:
				throw new DataException(ErrorCodeType.DAT_S_00_0007, "Job Command not valid", "Try cancel, pause, resume, restart or stop");
		}
		
		Job job = new Job();
		job = jobList.get(0);
		AccessManager am = new AccessManager();
		am.updateJobStatus(job);
		
		ManageJobResponseType mJResponse = new ManageJobResponseType();
		
		for (Job j: jobList)
		{
			TransformJobType tJt = new TransformJobType();
			tJt.setResourceID(j.getResourceID());
			tJt.setLocation(j.getLocation());
			tJt.setResourceCreationDate(j.getResourceCreationDate());
			tJt.setJobStartedTime(j.getJobStartedTime());
			tJt.setJobCompletedTime(j.getJobCompletedTime());
			tJt.setStatus(j.getStatus());
			tJt.setPriority(j.getPriority());
			mJResponse.setJob(tJt);
		}
		
		return Response.status(Status.OK).entity(mJResponse).build();
		
	}
}
