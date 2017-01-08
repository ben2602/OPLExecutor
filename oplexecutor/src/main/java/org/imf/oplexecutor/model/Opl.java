package org.imf.oplexecutor.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Opl {

	private int id;
	private String oplId;
	private String oplPath;
	private String annotation;
	private String issueDate;
	private String cplId;
	private String cplPath;
	private String response;
	
	public Opl() {}

	public Opl(int id, String oplId, String oplPath, String annotation, String issueDate, String cplId, String cplPath)
	{
		this.id = id;
		this.oplId = oplId;
		this.oplPath = oplPath;
		this.annotation = annotation;
		this.issueDate = issueDate;
		this.cplId = cplId;
		this.cplPath = cplPath;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOplPath() {
		return oplPath;
	}

	public void setOplPath(String oplPath) {
		this.oplPath = oplPath;
	}

	public String getCplPath() {
		return cplPath;
	}

	public void setCplPath(String cplPath) {
		this.cplPath = cplPath;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
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
