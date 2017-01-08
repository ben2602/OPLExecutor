package org.imf.oplexecutor.resources;

//XML Reading
import java.io.File;
import org.jdom2.Document;
import org.jdom2.Element;
//import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.util.ArrayList;
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
import org.imf.oplexecutor.macro.AssetMapReader;
import org.imf.oplexecutor.macro.CPLFinder;
import org.imf.oplexecutor.macro.OPLReader;
import org.imf.oplexecutor.model.Opl;
//Internal Classes
import org.imf.oplexecutor.model.Task;
import org.imf.oplexecutor.service.TaskService;

@Path("/opls")
public class OplResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Opl> getAllOpls() {
		List<Opl> ls = new ArrayList<Opl>();
		MySQLAccess DB = new MySQLAccess();
		DB.connect();
		ls = DB.getAllOpls();
		return ls;
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Opl postnewOpl(Opl opl) {
		
		//Starting OPLReader
		OPLReader oplreader = new OPLReader();
		oplreader.getOPLData(opl.getOplPath());
		
		//Writing OPL Data in OPL Resource
		opl.setOplId(oplreader.getOplId());
		opl.setAnnotation(oplreader.getAnnotation());
		opl.setIssueDate(oplreader.getIssueDate());
		opl.setCplId(oplreader.getCplId());
		
		//Starting AssetMapFinder
		File f = new File(opl.getOplPath());
		AssetMapFinder amf = new AssetMapFinder(f.getParent());
		String ampath = amf.find();
		
		//Starting AssetMapReader
		AssetMapReader amr = new AssetMapReader(ampath);
		amr.getCplFileName(opl.getCplId());
		
		//Writing cplPath to OPL Resource
		opl.setCplPath(amr.getCplPath());
		
		MySQLAccess DB = new MySQLAccess();
		opl.setResponse(DB.post_opl(opl));
	 	
		return opl;

	}

}
