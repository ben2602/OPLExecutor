package org.imf.oplexecutor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.imf.oplexecutor.database.AccessManager;
import org.imf.oplexecutor.fims.bms.JobStatusType;
import org.imf.oplexecutor.fims.bms.PriorityType;
import org.imf.oplexecutor.model.Job;

public class JobQueue {

	public Job getNextJob() {
		
		ArrayList<Job> jobList = new ArrayList<Job>();
		AccessManager am = new AccessManager();
		jobList = am.getAllJobs();
		//Job nextJob = new Job();
		
		ArrayList<Job> immediateList = new ArrayList<Job> ();
		ArrayList<Job> urgentList = new ArrayList<Job> ();
		ArrayList<Job> highList = new ArrayList<Job> ();
		ArrayList<Job> mediumList = new ArrayList<Job> ();
		ArrayList<Job> lowList = new ArrayList<Job> ();
		
		for(Job j: jobList) {
			if(j.getPriority() == PriorityType.IMMEDIATE && j.getStatus() == JobStatusType.QUEUED) {
				immediateList.add(j);
			}	
			if(j.getPriority() == PriorityType.URGENT && j.getStatus() == JobStatusType.QUEUED) {
				urgentList.add(j);
			}	
			if(j.getPriority() == PriorityType.HIGH && j.getStatus() == JobStatusType.QUEUED) {
				highList.add(j);
			}	
			if(j.getPriority() == PriorityType.MEDIUM && j.getStatus() == JobStatusType.QUEUED) {
				mediumList.add(j);
			}	
			if(j.getPriority() == PriorityType.LOW && j.getStatus() == JobStatusType.QUEUED) {
				lowList.add(j);
			}	
		}
			
		if(immediateList.size() != 0) {
			Collections.sort(immediateList, new Comparator<Job>() {
				@Override
				public int compare(Job j1, Job j2) {
					return j1.getResourceCreationDate().compare(j2.getResourceCreationDate());
				}
			});
			return immediateList.get(0);
		}
		if(urgentList.size() != 0) {
			Collections.sort(urgentList, new Comparator<Job>() {
				@Override
				public int compare(Job j1, Job j2) {
					return j1.getResourceCreationDate().compare(j2.getResourceCreationDate());
				}
			});
			return urgentList.get(0);
		}
		if(highList.size() != 0) {
			Collections.sort(highList, new Comparator<Job>() {
				@Override
				public int compare(Job j1, Job j2) {
					return j1.getResourceCreationDate().compare(j2.getResourceCreationDate());
				}
			});
			return highList.get(0);
		}
		if(mediumList.size() != 0) {
			Collections.sort(mediumList, new Comparator<Job>() {
				@Override
				public int compare(Job j1, Job j2) {
					return j1.getResourceCreationDate().compare(j2.getResourceCreationDate());
				}
			});
			return mediumList.get(0);
		}
		if(lowList.size() != 0) {
			Collections.sort(lowList, new Comparator<Job>() {
				@Override
				public int compare(Job j1, Job j2) {
					return j1.getResourceCreationDate().compare(j2.getResourceCreationDate());
				}
			});
			return lowList.get(0);
		}
		else {
			return null;
		}

	}
}
