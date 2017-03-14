package org.imf.oplexecutor.database;

import java.sql.*;
import java.util.ArrayList;

import org.imf.oplexecutor.exception.DataException;
import org.imf.oplexecutor.exception.InfrastructureException;
import org.imf.oplexecutor.fims.bms.ErrorCodeType;
import org.imf.oplexecutor.model.Job;

//Creates Database for Connection and Creates Access for Query and returns List of Database Entries
public class AccessManager {
	
	private ErrorCodeType err;
	
	public AccessManager() {}
	
	public void writeToDB(Job j) {
		
		Database db = new Database();
		try {
			Connection con = db.getConnection();
			Access access = new Access();
			access.insert(con, j);
		} catch (Exception e) {
			throw new InfrastructureException(err.INF_S_00_0004, "Unable to connect to the database ", "REST Status: 500 Internal Server Error");
		}
	}

	public ArrayList<Job> getAllJobs()
	{
		ArrayList<Job> jobList = new ArrayList<Job>();
		Database db = new Database();
		try {
			Connection con = db.getConnection(); 
			Access access = new Access();
			jobList = access.getJobs(con);
		} catch (Exception e) {
			throw new InfrastructureException(err.INF_S_00_0004, "Unable to connect to the database. REST Status: 500 Internal Server Error", e.getMessage());
		}
		return jobList;
	}
	
	public ArrayList<Job> getSingleJob(String id)
	{
		ArrayList<Job> jobList = new ArrayList<Job>();
		Database db = new Database();
		try {
			Connection con = db.getConnection();
			Access access = new Access();
			jobList = access.getJob(con, id);
		} catch (Exception e) {
			throw new InfrastructureException(err.INF_S_00_0004, "Unable to connect to the database. REST Status: 500 Internal Server Error", e.getMessage());
		}
			
		return jobList;
	}
}
