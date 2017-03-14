package org.imf.oplexecutor.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.imf.oplexecutor.fims.tfms.TransformFaultType;

@Provider
public class InfrastructureExceptionMapper implements ExceptionMapper<InfrastructureException>{

	@Override
	public Response toResponse(InfrastructureException ex) {
		TransformFaultType tF = new TransformFaultType();
		tF.setCode(ex.getErr());
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(tF)
				.build();
	}

}
