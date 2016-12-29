package org.imf.oplexecutor.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Task {

	private long taskId;
	private String link_opl;
	private String status;
	private Date created;
	private Map<Long, Opl> opls = new HashMap<>();
	
	public Task() {}
	
	public Task(long id, String link_opl) {
		this.taskId = id;
		this.link_opl = link_opl;
		this.created = new Date();
		this.status = "queued";
	}
	
	public long getTaskId() {
		return taskId;
	}
	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}
	public String getLink_opl() {
		return link_opl;
	}
	public void setLink_opl(String link_opl) {
		this.link_opl = link_opl;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	@XmlTransient
	public Map<Long,Opl> getOpls() {
		return opls;
	}
	
	public void setOpls(Map<Long, Opl> opls) {
		this.opls = opls;
	}
}
