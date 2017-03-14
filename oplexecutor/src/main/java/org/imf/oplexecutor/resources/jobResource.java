package org.imf.oplexecutor.resources;
/*
//XML Reading
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.validation.Valid;
//RESTful Webservice
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.imf.oplexecutor.database.AccessManager;
import org.imf.oplexecutor.database.MySQLAccess;
import org.imf.oplexecutor.exception.DataNotFoundException;
import org.imf.oplexecutor.macro.AssetMapFinder;
import org.imf.oplexecutor.macro.AssetMapReader;
import org.imf.oplexecutor.macro.OPLReader;
import org.imf.oplexecutor.messages.ObjectFactory;
import org.imf.oplexecutor.messages.TransformAck;
import org.imf.oplexecutor.messages.TransformRequest;
import org.imf.oplexecutor.messages.queryJob.ObjectFactoryQueryJob;
import org.imf.oplexecutor.messages.queryJob.QueryJobResponse;
import org.imf.oplexecutor.model.Job;
import org.imf.oplexecutor.model.Opl;

@Path("/jobs")
public class jobResource {
	
	@POST 
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Response transform(TransformRequest tR) {
		
		Calendar myCalendar = new GregorianCalendar();
		String resourceCreationDate = myCalendar.getTime().toString();
		
			
			/*
			//Reading post
			String resourceID = tR.getTransformJob().getResourceID().getValue();
			String location = tR.getTransformJob().
			String operationName = tR.getTransformJob().getOperationName().getValue();
			String destination = tR.getTransformJob().getProfiles().getTransformProfile().getTransferAtom().getDestination().getValue();
			
			//Starting OPLReader
			OPLReader oplreader = new OPLReader();
			oplreader.getOPLData(location);
			
					
			//Starting AssetMapFinder
			File f = new File(location);
			AssetMapFinder amf = new AssetMapFinder(f.getParent());
			String ampath = amf.find();
			
			//Starting AssetMapReader
			AssetMapReader amr = new AssetMapReader(ampath);
			amr.getCplFileName(oplreader.getCplId());
			
			//Create Job
			Job job = new Job(resourceID, location, operationName, oplreader.getOplId(), oplreader.getCplId(), destination, resourceCreationDate, "queued");
			
			//Writing Job to Database
			//MySQLAccess DB = new MySQLAccess();
			//DB.insert(job);
			
		
		//Create Response:
			
			TransformAck tA = new TransformAck();
			//add status and creationDate
			ObjectFactory of = new ObjectFactory();
			TransformRequest.TransformJob.ResourceCreationDate tRdate = of.createTransformRequestTransformJobResourceCreationDate();
			TransformRequest.TransformJob.Status tRstatus = of.createTransformRequestTransformJobStatus();
			tR.getTransformJob().setResourceCreationDate(tRdate);
			tR.getTransformJob().setStatus(tRstatus);
			//add TransformJob of Request to Acknowledgement
			tA.setTransformJob(tR.getTransformJob());
			tA.getTransformJob().getResourceCreationDate().setValue(resourceCreationDate);
			tA.getTransformJob().getStatus().setValue("created");
				
			*/		
			//return tA and code201;
			//return Response.status(201).entity(tR).build();
		//}	
	
/*	
	@GET
	@Path("/{jobId}")
	@Produces(MediaType.APPLICATION_XML)
	public QueryJobResponse queryJob(@PathParam("jobId") String id) throws DataNotFoundException {
		String jobs = null;
		ArrayList<Job> jobList = new ArrayList<Job>();
		QueryJobResponse qJR = new QueryJobResponse();
		try {
			jobList = new AccessManager().getSingleJob(id);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		ObjectFactoryQueryJob of = new ObjectFactoryQueryJob();
		
		QueryJobResponse.Jobs qJobs = of.createQueryJobResponseJobs();
		qJR.setJobs(qJobs);
		
		for (Job j: jobList)
		{
			QueryJobResponse.Jobs.Job qJob = of.createQueryJobResponseJobsJob();
			qJob.setResourceID(j.getResourceID());
			qJob.setStatus(j.getStatus());
			qJob.setOperationName(j.getOperationName());
			qJobs.getJob().add(qJob);	
		}
		if (jobList.size()==0) {
			throw new DataNotFoundException("Rersource not found");
		}
		return qJR;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public QueryJobResponse queryJobs() {
		String jobs = null;
		ArrayList<Job> jobList = new ArrayList<Job>();
		QueryJobResponse qJR = new QueryJobResponse();
		try {
			jobList = new AccessManager().getAllJobs();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		ObjectFactoryQueryJob of = new ObjectFactoryQueryJob();
		
		QueryJobResponse.Jobs qJobs = of.createQueryJobResponseJobs();
		qJR.setJobs(qJobs);
		
		for (Job j: jobList)
		{
			QueryJobResponse.Jobs.Job qJob = of.createQueryJobResponseJobsJob();
			qJob.setResourceID(j.getResourceID());
			qJob.setStatus(j.getStatus());
			qJob.setOperationName(j.getOperationName());
			qJobs.getJob().add(qJob);
		}
		return qJR;	
	}
}*/
