package org.imf.oplexecutor.macro;

import java.io.File;

import org.imf.oplexecutor.exception.DataException;
import org.imf.oplexecutor.fims.bms.ErrorCodeType;
import org.imf.oplexecutor.model.Opl;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

//Reads OPL-File, Connects to DB and Starts AssetMapFinder and AssetMapReader
public class OPLReader {
	
	private String oplId;
	private String annotation;
	private String issueDate;
	private String cplId;
		
	public OPLReader() {}
	
	public Opl getOPLData(String oplpath) {
		
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
					oplId = OutputProfileList.getChildText("Id", null);
					annotation = OutputProfileList.getChildText("Annotation", null);
					issueDate = OutputProfileList.getChildText("IssueDate", null);
					cplId = OutputProfileList.getChildText("CompositionPlaylistId", null);
										
					Opl o = new Opl(oplId, oplpath, annotation, issueDate, cplId);
					return o;
					
		} 
		catch (Exception e) {
				e.printStackTrace();
				throw new DataException(ErrorCodeType.DAT_S_00_0004, "Missing required service metadata in request.", e.getMessage());
		}

	}

	public String getOplId() {
		return oplId;
	}

	public void setOplId(String oplId) {
		this.oplId = oplId;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getCplId() {
		return cplId;
	}

	public void setCplId(String cplId) {
		this.cplId = cplId;
	}

}
