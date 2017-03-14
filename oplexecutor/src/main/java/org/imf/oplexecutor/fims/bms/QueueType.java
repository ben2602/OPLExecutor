//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.bms;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Description: 
 *         Support or not the queue, queue depth, and supported queue commands
 *       
 * 
 * <p>Java class for QueueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueueType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://base.fims.tv}ResourceType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://base.fims.tv}QueueStatusType" minOccurs="0"/>
 *         &lt;element name="statusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="availability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="estimatedTotalCompletionDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="jobs" type="{http://base.fims.tv}JobsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueType", propOrder = {
    "status",
    "statusDescription",
    "length",
    "availability",
    "estimatedTotalCompletionDuration",
    "jobs"
})
public class QueueType
    extends ResourceType
{

    protected QueueStatusType status;
    protected String statusDescription;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger length;
    protected Boolean availability;
    protected Duration estimatedTotalCompletionDuration;
    protected JobsType jobs;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link QueueStatusType }
     *     
     */
    public QueueStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueStatusType }
     *     
     */
    public void setStatus(QueueStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailability(Boolean value) {
        this.availability = value;
    }

    /**
     * Gets the value of the estimatedTotalCompletionDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEstimatedTotalCompletionDuration() {
        return estimatedTotalCompletionDuration;
    }

    /**
     * Sets the value of the estimatedTotalCompletionDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEstimatedTotalCompletionDuration(Duration value) {
        this.estimatedTotalCompletionDuration = value;
    }

    /**
     * Gets the value of the jobs property.
     * 
     * @return
     *     possible object is
     *     {@link JobsType }
     *     
     */
    public JobsType getJobs() {
        return jobs;
    }

    /**
     * Sets the value of the jobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobsType }
     *     
     */
    public void setJobs(JobsType value) {
        this.jobs = value;
    }

}
