package org.imf.oplexecutor;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.imf.oplexecutor.database.AccessManager;
import org.imf.oplexecutor.model.Job;

//Starts Jobs and Creates JobQueue
@WebListener
public class JobManager implements ServletContextListener{

	private ScheduledExecutorService scheduler;


	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		scheduler = Executors.newSingleThreadScheduledExecutor();
		scheduler.scheduleAtFixedRate(new JobRunner(), 0, 30, TimeUnit.SECONDS);	
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		scheduler.shutdownNow();
	}
	
}
