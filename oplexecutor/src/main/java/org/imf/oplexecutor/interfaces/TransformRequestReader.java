package org.imf.oplexecutor.interfaces;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.imf.oplexecutor.exception.DataException;
import org.imf.oplexecutor.fims.bms.ErrorCodeType;
import org.imf.oplexecutor.fims.tfms.TransformRequestType;

@Provider
public class TransformRequestReader implements MessageBodyReader<TransformRequestType>{

	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return TransformRequestType.class.isAssignableFrom(type);
	}

	@Override
	public TransformRequestType readFrom(Class<TransformRequestType> type, Type genericType, Annotation[] annotations,
			MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
				
		try {
			   JAXBContext jc = JAXBContext.newInstance("org.imf.oplexecutor.fims.bms:org.imf.oplexecutor.fims.desc:org.imf.oplexecutor.fims.mdcf.a:org.imf.oplexecutor.fims.mdcf.b:org.imf.oplexecutor.fims.mdcf.c:org.imf.oplexecutor.fims.mdcf.e:org.imf.oplexecutor.fims.mdcf.f:org.imf.oplexecutor.fims.mdcf.g:org.imf.oplexecutor.fims.mdcf.h:org.imf.oplexecutor.fims.mdcf.q:org.imf.oplexecutor.fims.tfms:org.imf.oplexecutor.fims.tim");
			   Unmarshaller um = jc.createUnmarshaller();
			   um.setEventHandler(new javax.xml.bind.helpers.DefaultValidationEventHandler());
			   
			   @SuppressWarnings("unchecked")
			   JAXBElement<TransformRequestType> tR = (JAXBElement<TransformRequestType>) um.unmarshal(entityStream);
			   
			   
			   return tR.getValue();
			   
		} catch (JAXBException e ) {		
				System.out.print(e.getMessage());
				throw new DataException(ErrorCodeType.DAT_S_00_0001,"Invalid request, XML format","Check XML Format");
		}
	}

}
