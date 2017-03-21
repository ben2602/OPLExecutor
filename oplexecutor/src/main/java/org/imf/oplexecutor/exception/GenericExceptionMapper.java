package org.imf.oplexecutor.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.imf.oplexecutor.fims.bms.ErrorCodeType;
import org.imf.oplexecutor.fims.bms.FaultType;
import org.imf.oplexecutor.fims.tfms.TransformFaultType;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	private ErrorCodeType err;
	private String description;
	private Status stat;
	
	@Override
	public Response toResponse(Throwable ex) {
	
		switch (ex.getMessage()) {
		case "HTTP 405 Method Not Allowed":
			
			err = ErrorCodeType.DAT_S_00_0015;
			description = "Feature not supported. REST Status: 403 Forbidden";
			stat = Status.FORBIDDEN;
			break;
			
		case "HTTP 400 Bad Request":
			err = ErrorCodeType.DAT_S_00_0001;
			description = "Invalid request, XML format. REST Status: 400 Bad Request";
			stat = Status.BAD_REQUEST;
			break;
			
		case "HTTP 415 Unsupported Media Type":
			err = ErrorCodeType.DAT_S_00_0021;
			description = "Unsupported Media Type";
			stat = Status.UNSUPPORTED_MEDIA_TYPE;
			
		default: 
			err = ErrorCodeType.DAT_S_00_0003;
			description = ex.getMessage();
			stat = Status.INTERNAL_SERVER_ERROR;
			break;
		}
		
		TransformFaultType tF = new TransformFaultType();
		tF.setCode(err);
		tF.setDescription(description);
		tF.setDetail(ex.getMessage());
		
		return Response.status(stat)
				.entity(tF)
				.type(MediaType.APPLICATION_XML)
				.build();
	}
}