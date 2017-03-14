package org.imf.oplexecutor.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import org.imf.oplexecutor.fims.bms.ErrorCodeType;
import org.imf.oplexecutor.fims.tfms.TransformFaultType;

public class ServiceExceptionMapper implements ExceptionMapper<ServiceException> {

	@Override
	public Response toResponse(ServiceException ex) {
		TransformFaultType tF = new TransformFaultType();
		tF.setCode(ErrorCodeType.DAT_S_00_0001);
		tF.setDescription("BadRequest");
		return Response.status(Status.BAD_REQUEST)
				.entity(tF)
				.build();
	}


}
