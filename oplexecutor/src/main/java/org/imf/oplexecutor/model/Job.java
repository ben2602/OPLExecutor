package org.imf.oplexecutor.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

import org.imf.oplexecutor.fims.bms.JobStatusType;
import org.imf.oplexecutor.fims.bms.PriorityType;

public class Job {
	
	private String resourceID;
	private PriorityType priority;
	private JobStatusType status;
	private XMLGregorianCalendar resourceCreationDate;
	private XMLGregorianCalendar jobStartedTime;
	private XMLGregorianCalendar jobCompletedTime;
	private String resourceIDtP; 
	private String location;
	private String destination;
	private String outputFileNamePattern;
	private String notifyReply;
	private String notifyFault;
	private Opl opl;
	
	public Job() {}

	public Job(String resourceID, PriorityType priority, JobStatusType status,
			XMLGregorianCalendar resourceCreationDate, XMLGregorianCalendar jobStartedTime,
			XMLGregorianCalendar jobCompletedTime, String resourceIDtP, String location, String destination,
			String outputFileNamePattern, String notifyReply, String notifyFault, Opl opl) {
		this.resourceID = resourceID;
		this.priority = priority;
		this.status = status;
		this.resourceCreationDate = resourceCreationDate;
		this.jobStartedTime = jobStartedTime;
		this.jobCompletedTime = jobCompletedTime;
		this.resourceIDtP = resourceIDtP;
		this.location = location;
		this.destination = destination;
		this.outputFileNamePattern = outputFileNamePattern;
		this.notifyReply = notifyReply;
		this.notifyFault = notifyFault;
		this.opl = opl;
	}

	public String getResourceID() {
		return resourceID;
	}

	public void setResourceID(String resourceID) {
		this.resourceID = resourceID;
	}

	public PriorityType getPriority() {
		return priority;
	}

	public void setPriority(PriorityType priority) {
		this.priority = priority;
	}

	public JobStatusType getStatus() {
		return status;
	}

	public void setStatus(JobStatusType status) {
		this.status = status;
	}

	public XMLGregorianCalendar getResourceCreationDate() {
		return resourceCreationDate;
	}

	public void setResourceCreationDate(XMLGregorianCalendar resourceCreationDate) {
		this.resourceCreationDate = resourceCreationDate;
	}

	public XMLGregorianCalendar getJobStartedTime() {
		return jobStartedTime;
	}

	public void setJobStartedTime(XMLGregorianCalendar jobStartedTime) {
		this.jobStartedTime = jobStartedTime;
	}

	public XMLGregorianCalendar getJobCompletedTime() {
		return jobCompletedTime;
	}

	public void setJobCompletedTime(XMLGregorianCalendar jobCompletedTime) {
		this.jobCompletedTime = jobCompletedTime;
	}

	public String getResourceIDtP() {
		return resourceIDtP;
	}

	public void setResourceIDtP(String resourceIDtP) {
		this.resourceIDtP = resourceIDtP;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getOutputFileNamePattern() {
		return outputFileNamePattern;
	}

	public void setOutputFileNamePattern(String outputFileNamePattern) {
		this.outputFileNamePattern = outputFileNamePattern;
	}

	public String getNotifyReply() {
		return notifyReply;
	}

	public void setNotifyReply(String notifyReply) {
		this.notifyReply = notifyReply;
	}

	public String getNotifyFault() {
		return notifyFault;
	}

	public void setNotifyFault(String notifyFault) {
		this.notifyFault = notifyFault;
	}

	public Opl getOpl() {
		return opl;
	}

	public void setOpl(Opl opl) {
		this.opl = opl;
	}	
}	

