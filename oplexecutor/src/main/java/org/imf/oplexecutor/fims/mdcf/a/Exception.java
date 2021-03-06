//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.mdcf.a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.imf.oplexecutor.fims.mdcf.c.DeviceException;
import org.imf.oplexecutor.fims.mdcf.f.InvalidMode;
import org.imf.oplexecutor.fims.mdcf.f.ModeException;
import org.imf.oplexecutor.fims.mdcf.g.MediaCreationFailed;
import org.imf.oplexecutor.fims.mdcf.g.MediaDeletionFailed;
import org.imf.oplexecutor.fims.mdcf.g.MediaNotFound;
import org.imf.oplexecutor.fims.mdcf.g.MediaUpdateFailed;
import org.imf.oplexecutor.fims.mdcf.h.InvalidQuery;
import org.imf.oplexecutor.fims.mdcf.q.ServiceException;


/**
 * <p>Java class for Exception complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exception">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.smpte-ra.org/schemas/st2071/2015/types}Message"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exception", propOrder = {
    "message"
})
@XmlSeeAlso({
    ServiceException.class,
    DeviceException.class,
    InvalidQuery.class,
    ModeException.class,
    InvalidMode.class,
    MediaDeletionFailed.class,
    MediaCreationFailed.class,
    MediaUpdateFailed.class,
    MediaNotFound.class
})
public abstract class Exception {

    @XmlElement(name = "Message", required = true)
    protected String message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
