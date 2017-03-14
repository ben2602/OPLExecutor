package org.imf.oplexecutor.macro;

import java.util.UUID;

import org.imf.oplexecutor.exception.DataException;
import org.imf.oplexecutor.fims.bms.ErrorCodeType;

public class UUIDGenerator {
  
  public String generate(){
    //generate random UUIDs
    return "urn:uuid:" + UUID.randomUUID().toString();
  }
  
  public Boolean check(String s) {
	  try {
		  	UUID u = UUID.fromString(s.substring(9));
	  } catch (IllegalArgumentException | StringIndexOutOfBoundsException ex) {
		  	throw new DataException(ErrorCodeType.DAT_S_00_0013,"Invalid identifier","UUID not valid, insert ? to create a new one");	  	
	  }
	  return true;
  }
} 