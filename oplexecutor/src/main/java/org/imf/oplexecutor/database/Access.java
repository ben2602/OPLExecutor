package org.imf.oplexecutor.database;

import java.util.ArrayList;

import javax.xml.datatype.XMLGregorianCalendar;

import java.sql.*;

import org.imf.oplexecutor.exception.InfrastructureException;
import org.imf.oplexecutor.fims.bms.ErrorCodeType;
import org.imf.oplexecutor.fims.bms.JobStatusType;
import org.imf.oplexecutor.fims.bms.PriorityType;
import org.imf.oplexecutor.model.Job;
import org.imf.oplexecutor.validator.TransformRequestValidator;


public class Access {

	//Write TransformRequest to Database
	public void insert(Connection con, Job j)
	{
		String resourceID = j.getResourceID();
		String priority = j.getPriority().toString();
		String status = j.getStatus().toString();
		String resourceCreationDate = j.getResourceCreationDate().toString();
						
		String resourceIDtP = j.getResourceIDtP();
		String location = j.getLocation();
		String destination = j.getDestination();
		String outputFileNamePattern = j.getOutputFileNamePattern();
		String oplId = j.getOpl().getOplId();
		String notifyReply = j.getNotifyReply();
		String notifyFault = j.getNotifyFault();
		
		try {
			PreparedStatement posted = con.prepareStatement("INSERT INTO job(resourceID,"
					+ "priority,status,resourceCreationDate,resourceIDtP,"
					+ "location,destination,outputFileNamePattern, "
					+ "oplId, notifyReply, notifyFault) "
					+ "VALUES('"+resourceID+"','"+priority+"','"+status+"',"
							+ "'"+resourceCreationDate+"','"+resourceIDtP+"',"
											+ "'"+location+"','"+destination+"','"+outputFileNamePattern+"',"
													+ "'"+oplId+"','"+notifyReply+"','"+notifyFault+"')");
			
			posted.executeUpdate();
						
		} catch(Exception e) {
			System.out.println("Insertfailure" + e.getMessage());
		}
	}
	
	//Returns a List of all Job Resources
	public ArrayList<Job> getJobs(Connection con) {
		ArrayList<Job> jobList = new ArrayList<Job>();
		
		try {
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM TransformDatabase.job");
		ResultSet rs = stmt.executeQuery();
		
			while(rs.next()) {
				Job j = new Job();
				j.setResourceID(rs.getString("resourceID"));
				j.setLocation(rs.getString("location"));
				String resCreationDate = (rs.getString("resourceCreationDate"));
				j.setResourceCreationDate(new TransformRequestValidator().setXMLGregorianCalendarFromString(resCreationDate));
				String stat = (rs.getString("status"));
				j.setStatus(JobStatusType.valueOf(stat));
				String prio = (rs.getString("priority"));
				j.setPriority(PriorityType.valueOf(prio));
				String jobStartedTime = (rs.getString("jobStartedTime"));
				if (jobStartedTime != null) {
					j.setJobStartedTime(new TransformRequestValidator().setXMLGregorianCalendarFromString(jobStartedTime));}
				String jobCompletedTime = (rs.getString("jobCompletedTime"));
				if (jobCompletedTime != null) {
					j.setJobCompletedTime(new TransformRequestValidator().setXMLGregorianCalendarFromString(jobCompletedTime));}
				
				jobList.add(j);
			}
		}
		catch (SQLException e)
		{
			throw new InfrastructureException(ErrorCodeType.DAT_S_00_0004, "Unable to connect to the database. REST Status: 500 Internal Server Error", e.getMessage());
		}
				
		return jobList;
	}
	
	//Returns a specific Job Resource
	public ArrayList<Job> getJob(Connection con, String id)
	{
		ArrayList<Job> jobList = new ArrayList<Job>();
		try {
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM TransformDatabase.job WHERE resourceID = '"+ id + "';");
		ResultSet rs = stmt.executeQuery();

			while(rs.next()) {
				Job j = new Job();
				j.setResourceID(rs.getString("resourceID"));
				j.setLocation(rs.getString("location"));
				String resCreationDate = (rs.getString("resourceCreationDate"));
				j.setResourceCreationDate(new TransformRequestValidator().setXMLGregorianCalendarFromString(resCreationDate));
				String stat = (rs.getString("status"));
				j.setStatus(JobStatusType.valueOf(stat));
				String prio = (rs.getString("priority"));
				j.setPriority(PriorityType.valueOf(prio));
				
				String jobStartedTime = (rs.getString("jobStartedTime"));
				if (jobStartedTime != null) {
					j.setJobStartedTime(new TransformRequestValidator().setXMLGregorianCalendarFromString(jobStartedTime));}
				String jobCompletedTime = (rs.getString("jobCompletedTime"));
				if (jobCompletedTime != null) {
					j.setJobCompletedTime(new TransformRequestValidator().setXMLGregorianCalendarFromString(jobCompletedTime));}
				
				jobList.add(j);
			}
		}
		catch (SQLException e)
		{
			throw new InfrastructureException(ErrorCodeType.DAT_S_00_0004, "Unable to connect to the database. REST Status: 500 Internal Server Error", e.getMessage());

		}
			
		return jobList;
	}
}
