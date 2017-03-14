package org.imf.oplexecutor.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.imf.oplexecutor.fims.bms.ErrorCodeType;
import org.imf.oplexecutor.fims.bms.FaultType;
import org.imf.oplexecutor.fims.tfms.TransformFaultType;

@Provider
public class DataExceptionMapper implements ExceptionMapper<DataException> {

	private ErrorCodeType err;
	private FaultType description;
	private FaultType details;
	private Status stat;
	
	@Override
	public Response toResponse(DataException ex) {
		
		System.out.print("dataexception");
		TransformFaultType tF = new TransformFaultType();
		tF.setCode(ex.getErr());
		tF.setDescription(ex.getDescription().toString());
		tF.setDetail(ex.getDetail().toString());
		return Response.status(Status.BAD_REQUEST)
				.entity(tF)
				.build();
	}


}
