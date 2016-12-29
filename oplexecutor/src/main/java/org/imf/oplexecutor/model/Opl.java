package org.imf.oplexecutor.model;

public class Opl {

	private String oplId;
	private String annotation;
	private String issueDate;
	private String cplId;
	
	public Opl() {}

	public Opl(String oplId, String annotation, String issueDate, String cplId)
	{
		this.oplId = oplId;
		this.annotation = annotation;
		this.issueDate = issueDate;
		this.cplId = cplId;
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
