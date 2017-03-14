package org.imf.oplexecutor.model;

import javax.xml.bind.annotation.XmlRootElement;

public class Opl {

	private String oplId;
	private String oplPath;
	private String annotation;
	private String issueDate;
	private String cplId;
	private String cplPath;
	
	public Opl() {}

	public Opl(String oplId, String oplPath, String annotation, String issueDate, String cplId)
	{
		this.oplId = oplId;
		this.oplPath = oplPath;
		this.annotation = annotation;
		this.issueDate = issueDate;
		this.cplId = cplId;
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
