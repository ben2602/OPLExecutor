package org.imf.oplexecutor;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.inject.Singleton;
import javax.ws.rs.Path;

import org.imf.oplexecutor.database.AccessManager;
import org.imf.oplexecutor.fims.bms.JobStatusType;
import org.imf.oplexecutor.model.Job;
import org.imf.oplexecutor.validator.TransformRequestValidator;

//Runs a queued job
@Singleton
public class JobRunner implements Runnable{

	@Override
	public void run() {
		
		JobQueue jobQueue = new JobQueue();
		Job j = new Job();
		j = jobQueue.getNextJob();
		AccessManager am = new AccessManager();
		
		if(j != null) {
				j.setStatus(JobStatusType.RUNNING);
				j.setJobStartedTime(new TransformRequestValidator().getXMLGregorianCalendarNow());
				am.updateJobStatus(j);
				
				//send notification if possible
				if(j.getNotifyReply() != null) {
					System.out.println("drin");
					new JobNotificator().notify(j);
				}
				
				
				//wait 60 seconds
				try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				j.setStatus(JobStatusType.COMPLETED);
				j.setJobCompletedTime(new TransformRequestValidator().getXMLGregorianCalendarNow());
				am.updateJobStatus(j);
				
				//send notification if possible
				if(j.getNotifyReply() != null) {
					new JobNotificator().notify(j);
				}
				
				String destination = j.getDestination();
				String filename = j.getOutputFileNamePattern();
				String destPath = destination +"/"+filename+".txt";
				System.out.println(destPath);
				try {
					File f = new File(destPath);
					if(!f.createNewFile()) {
						destPath = destination + "/" + j.getResourceCreationDate().toString() + ".txt";
						File f2 = new File(destPath);
						f2.createNewFile();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
}
