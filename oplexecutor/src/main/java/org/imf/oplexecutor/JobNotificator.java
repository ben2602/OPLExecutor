package org.imf.oplexecutor;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;

import org.imf.oplexecutor.fims.tfms.TransformJobType;
import org.imf.oplexecutor.fims.tfms.TransformNotificationType;
import org.imf.oplexecutor.model.Job;

public class JobNotificator {

	public JobNotificator() {
		
	}
	
	public void notify(Job j) {
		
		try { 
	        URL url = new URL(j.getNotifyReply());
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setDoOutput(true);
	        connection.setInstanceFollowRedirects(false);
	        connection.setRequestMethod("POST");
	        connection.setRequestProperty("Content-Type", "application/xml");
	
	        OutputStream os = connection.getOutputStream();
	        
	        
	        TransformNotificationType tNt = new TransformNotificationType();
	        TransformJobType tJt = new TransformJobType();
	        tNt.setTransformJob(tJt);
	        tNt.getTransformJob().setResourceID(j.getResourceID());
	        tNt.getTransformJob().setStatus(j.getStatus());
			org.imf.oplexecutor.fims.tfms.ObjectFactory factory = new org.imf.oplexecutor.fims.tfms.ObjectFactory();
	
	        
			JAXBContext jc = JAXBContext.newInstance("org.imf.oplexecutor.fims.bms:org.imf.oplexecutor.fims.desc:org.imf.oplexecutor.fims.mdcf.a:org.imf.oplexecutor.fims.mdcf.b:org.imf.oplexecutor.fims.mdcf.c:org.imf.oplexecutor.fims.mdcf.e:org.imf.oplexecutor.fims.mdcf.f:org.imf.oplexecutor.fims.mdcf.g:org.imf.oplexecutor.fims.mdcf.h:org.imf.oplexecutor.fims.mdcf.q:org.imf.oplexecutor.fims.tfms:org.imf.oplexecutor.fims.tim");
			JAXBElement<TransformNotificationType> tN = factory.createTransformNotification(tNt); 
			
	        jc.createMarshaller().marshal(tN, os);
	        
	    
	        os.flush();
	        System.out.println("ResponseCode: " + connection.getResponseCode());
	        connection.disconnect();
	    } catch(Exception e) {
	    	System.out.println("URL: " + j.getNotifyReply());
	    	System.out.println("Fehler: " + e.getMessage());
	        throw new RuntimeException(e);
	    }
	}
}
