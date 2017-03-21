package org.imf.oplexecutor.interfaces;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.imf.oplexecutor.fims.bms.ManageJobResponseType;
import org.imf.oplexecutor.fims.tfms.TransformResponseType;

@Provider
public class ManageJobResponseWriter implements MessageBodyWriter<ManageJobResponseType> {

	@Override
	public long getSize(ManageJobResponseType t, Class<?> type, Type genericType, Annotation[] annotations,
			MediaType mediaType) {
		return -1;
	}
	
	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return ManageJobResponseType.class.isAssignableFrom(type);
	}


	@Override
	public void writeTo(ManageJobResponseType t, Class<?> type, Type genericType, Annotation[] annotations,
			MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
			throws IOException, WebApplicationException {
		
		try {   
			   JAXBContext jc = JAXBContext.newInstance("org.imf.oplexecutor.fims.bms:org.imf.oplexecutor.fims.desc:org.imf.oplexecutor.fims.mdcf.a:org.imf.oplexecutor.fims.mdcf.b:org.imf.oplexecutor.fims.mdcf.c:org.imf.oplexecutor.fims.mdcf.e:org.imf.oplexecutor.fims.mdcf.f:org.imf.oplexecutor.fims.mdcf.g:org.imf.oplexecutor.fims.mdcf.h:org.imf.oplexecutor.fims.mdcf.q:org.imf.oplexecutor.fims.tfms:org.imf.oplexecutor.fims.tim");
			   Marshaller marshaller = jc.createMarshaller();
					
			   org.imf.oplexecutor.fims.bms.ObjectFactory factory = new org.imf.oplexecutor.fims.bms.ObjectFactory();
			
			   JAXBElement<ManageJobResponseType> mJR = factory.createManageJobResponse(t); 
			  
			   marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
			   marshaller.marshal(mJR, entityStream);
			   
		} catch (JAXBException e) {
			System.out.println("Fehler " + e.getMessage());
		}
	}

}
