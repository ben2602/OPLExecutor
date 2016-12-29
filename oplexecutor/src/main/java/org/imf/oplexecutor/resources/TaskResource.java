package org.imf.oplexecutor.resources;

//XML Reading
import java.io.File;
import org.jdom2.Document;
import org.jdom2.Element;
//import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.util.List;
//RESTful Webservice
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.imf.oplexecutor.database.MySQLAccess;
import org.imf.oplexecutor.macro.AssetMapFinder;
import org.imf.oplexecutor.macro.OPLReader;
import org.imf.oplexecutor.model.Opl;
//Internal Classes
import org.imf.oplexecutor.model.Task;
import org.imf.oplexecutor.service.TaskService;

@Path("/tasks")
public class TaskResource {

	private String taskId;
	private String oplId;
	private String annotation;
	private String issueDate;
	private String cplId;
	
	
	TaskService taskService = new TaskService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Task> getTasks() {
		return taskService.getAllTasks();
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public void addTask(Task task) {
		
		OPLReader oplreader = new OPLReader();
		oplreader.getOPLData(task.getLink_opl());
		
		
		//MySQLAccess DB = new MySQLAccess();
	}

}
