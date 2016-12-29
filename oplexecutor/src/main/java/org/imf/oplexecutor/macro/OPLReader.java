package org.imf.oplexecutor.macro;

import java.io.File;

import org.imf.oplexecutor.database.MySQLAccess;
import org.imf.oplexecutor.model.Opl;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

//Reads OPL-File and Starts AssetMapFinder and AssetMapReader
public class OPLReader {
	
	private String cplId;
	
	public OPLReader() {}
	
	public void getOPLData(String oplpath) {
		
		Document doc = null;
		
		File f = new File(oplpath);
		
		//Starting AssetMapFinder
		AssetMapFinder amf = new AssetMapFinder(f.getParent());
		String ampath = amf.find();
		System.out.println("Pfad: " + ampath);
		
		//Reading OPL and setting values
		try {
				SAXBuilder builder = new SAXBuilder();
				doc = builder.build(f);
				
				//Extract Root Element
				Element OutputProfileList = doc.getRootElement();
				
				//Reading OPL Header
					String oplId = OutputProfileList.getChildText("Id", null);
					String annotation = OutputProfileList.getChildText("Annotation", null);
					String issueDate = OutputProfileList.getChildText("IssueDate", null);
					cplId = OutputProfileList.getChildText("CompositionPlaylistId", null);
					
					//System.out.println(oplId + annotation + issueDate + cplId);
					
					Opl o = new Opl(oplId, annotation, issueDate, cplId);
					
					//Writing Data to Database into opl table
					MySQLAccess DB = new MySQLAccess();
					DB.post_opl(o);
					
				
				//Get Child Element "MacroList"
				/*
					Element MacroList = element.getChild("MacroList", null);
				
				//Get Macro Elements in MacroList
				
					List<Element> MacroLs = MacroList.getChildren();
					for (Element k: MacroLs) {
						//String Mname = k.getChildText("Name", null);
						//Task t = new Task(3, Mname);
						//taskService.addTask(t);
						Opl o = new Opl(oplId, annotation, issueDate, cplId);
				}*/
		} 
		catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		//Starting AssetMapReader
		AssetMapReader amr = new AssetMapReader(ampath);
		amr.getCplFileName(cplId);
	}

}
