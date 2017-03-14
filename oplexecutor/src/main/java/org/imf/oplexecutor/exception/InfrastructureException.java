package org.imf.oplexecutor.exception;

import org.imf.oplexecutor.fims.bms.ErrorCodeType;

public class InfrastructureException extends RuntimeException {

	private static final long serialVersionUID = 2255453043217849549L;

	private ErrorCodeType err;
	private String description;
	private String detail;
	
	public InfrastructureException(ErrorCodeType err, String description, String detail)
	{
		this.err = err;
		this.description = description;
		this.detail = detail;
	}
	

	public ErrorCodeType getErr() {
		return err;
	}

	public void setErr(ErrorCodeType err) {
		this.err = err;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}




	
	
}
