package org.imf.oplexecutor.validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.imf.oplexecutor.fims.bms.ErrorCodeType;
import org.imf.oplexecutor.fims.bms.FaultType;
import org.imf.oplexecutor.fims.bms.JobStatusType;
import org.imf.oplexecutor.fims.bms.PriorityType;
import org.imf.oplexecutor.fims.tfms.TransformRequestType;
import org.imf.oplexecutor.fims.tfms.TransformResponseType;
import org.imf.oplexecutor.macro.UUIDGenerator;

import org.imf.oplexecutor.exception.DataException;


//Validates the content of the posted TransformRequest and creates Missing elements, if possible
public class TransformRequestValidator {

	private ErrorCodeType err;
	
	public TransformRequestValidator() {}
	
	//Validation
	public void validate(TransformRequestType tRt) throws DataException{
		
		//Check required Elements
		if(tRt.getTransformJob() == null) {
			throw new DataException(err.DAT_S_00_0004,"Missing required service metadata in request","TransformJob Element is missing");
		} else if (tRt.getTransformJob().getResourceID() == null) {
			throw new DataException(err.DAT_S_00_0004,"Missing required service metadata in request","ResourceID Element is missing");
		} else if (tRt.getTransformJob().getProfiles().getTransformProfile().get(0).getLocation()==null) {
			throw new DataException(err.DAT_S_00_0004,"Missing required service metadata in request","Location Element in TransformProfile is missing");
		} else if (tRt.getTransformJob().getProfiles().getTransformProfile().get(0).getOutputFileNamePattern()==null) {
			throw new DataException(err.DAT_S_00_0004,"Missing required service metadata in request","OutputFileNamePattern Element in TransformProfile is missing");
		} else if (tRt.getTransformJob().getProfiles().getTransformProfile().get(0).getTransferAtom().get(0).getDestination()==null) {
			throw new DataException(err.DAT_S_00_0004,"Missing required service metadata in request","Destination Element in TransferAtom of TransformProfile is missing");
		} else if (tRt.getTransformJob().getProfiles().getTransformProfile().get(0).getResourceID()==null) {
			throw new DataException(err.DAT_S_00_0004,"Missing required service metadata in request","ResourceID Element in TransformProfile is missing");
		} 
		
		//Check ResourceID Element of correct content
		String resourceID = tRt.getTransformJob().getResourceID();
		String resourceIDtP = tRt.getTransformJob().getProfiles().getTransformProfile().get(0).getResourceID();
		//Check if ResourceID Element isn't empty
		if (resourceID.isEmpty()) {
			throw new DataException(err.DAT_S_00_0014,"Insufficient data","No ResourceID, insert ? to create an UUID");
		}
		//Check if ResourceID is valid UUID
		if (!resourceID.contains("?")) {
		  UUIDGenerator uuidgenerator = new UUIDGenerator();
		  uuidgenerator.check(resourceID);
		}
		//Check if ResourceID of TransformProfile is valid UUID
		if (!resourceIDtP.contains("?")) {
		  UUIDGenerator uuidgenerator = new UUIDGenerator();
		  uuidgenerator.check(resourceIDtP);
		}
	}
	
	//Creation
	public TransformResponseType create(TransformRequestType tRt) {
		
		//Create TransformAck
		TransformResponseType tA = new TransformResponseType();
		tA.setTransformJob(tRt.getTransformJob());
		tA.getTransformJob().setStatus(JobStatusType.NEW);
		tA.getTransformJob().setServiceGeneratedElement(true);
		
		//Generate UUID if ResourceID Element is ?
		UUIDGenerator uuidgenerator = new UUIDGenerator();
		if (tRt.getTransformJob().getResourceID().contains("?")) {
			tA.getTransformJob().setResourceID(uuidgenerator.generate());
		}
		
		//Generate UUID if ResourceID Element for TransformProfile is ?
		if (tRt.getTransformJob().getProfiles().getTransformProfile().get(0).getResourceID().contains("?")) {
			System.out.print("reouseTP");
			tA.getTransformJob().setResourceID(uuidgenerator.generate());
		}
		
		//Check if priority exists and sets it if necessary
		if(tRt.getTransformJob().getPriority()==null) {
			tA.getTransformJob().setPriority(PriorityType.MEDIUM);
		}
					
		return tA;
	}
		
	public XMLGregorianCalendar getXMLGregorianCalendarNow() {
	    try {    
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
	    DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
	    XMLGregorianCalendar now = 
	            datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
	    return now;
	    } catch (DatatypeConfigurationException e) {
	    	return null;
	    }
	}
	
	public XMLGregorianCalendar setXMLGregorianCalendarFromString(String s)
	{
		XMLGregorianCalendar result = null;
		Date date;
		SimpleDateFormat simpleDateFormat;
		GregorianCalendar gregorianCalendar;
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
		try {
		date = simpleDateFormat.parse(s);
		gregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
		gregorianCalendar.setTime(date);
		result = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		} catch (ParseException | DatatypeConfigurationException ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}
}
