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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.imf.oplexecutor.fims.tfms.TransformJobType;


/**
 * Description: Supported job commands
 * 
 * <p>Java class for JobType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://base.fims.tv}ResourceType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://base.fims.tv}JobStatusType" minOccurs="0"/>
 *         &lt;element name="statusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceProviderJobID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queueReference" type="{http://base.fims.tv}QueueType" minOccurs="0"/>
 *         &lt;element name="tasks" type="{http://base.fims.tv}JobsType" minOccurs="0"/>
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bmObjects" type="{http://base.fims.tv}BMObjectsType" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://base.fims.tv}PriorityType" minOccurs="0"/>
 *         &lt;element name="startJob" type="{http://base.fims.tv}StartJobType" minOccurs="0"/>
 *         &lt;element name="finishBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="estimatedCompletionDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="currentQueuePosition" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="jobStartedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="jobElapsedTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="jobCompletedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="processed" type="{http://base.fims.tv}ProcessedInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobType", propOrder = {
    "status",
    "statusDescription",
    "serviceProviderJobID",
    "queueReference",
    "tasks",
    "operationName",
    "bmObjects",
    "priority",
    "startJob",
    "finishBefore",
    "estimatedCompletionDuration",
    "currentQueuePosition",
    "jobStartedTime",
    "jobElapsedTime",
    "jobCompletedTime",
    "processed"
})
@XmlSeeAlso({
    TransformJobType.class
})
public abstract class JobType
    extends ResourceType
{

    protected JobStatusType status;
    protected String statusDescription;
    protected String serviceProviderJobID;
    protected QueueType queueReference;
    protected JobsType tasks;
    protected String operationName;
    protected BMObjectsType bmObjects;
    protected PriorityType priority;
    protected StartJobType startJob;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishBefore;
    protected Duration estimatedCompletionDuration;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger currentQueuePosition;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar jobStartedTime;
    protected Duration jobElapsedTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar jobCompletedTime;
    protected ProcessedInfoType processed;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JobStatusType }
     *     
     */
    public JobStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStatusType }
     *     
     */
    public void setStatus(JobStatusType value) {
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
     * Gets the value of the serviceProviderJobID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderJobID() {
        return serviceProviderJobID;
    }

    /**
     * Sets the value of the serviceProviderJobID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderJobID(String value) {
        this.serviceProviderJobID = value;
    }

    /**
     * Gets the value of the queueReference property.
     * 
     * @return
     *     possible object is
     *     {@link QueueType }
     *     
     */
    public QueueType getQueueReference() {
        return queueReference;
    }

    /**
     * Sets the value of the queueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueType }
     *     
     */
    public void setQueueReference(QueueType value) {
        this.queueReference = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link JobsType }
     *     
     */
    public JobsType getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobsType }
     *     
     */
    public void setTasks(JobsType value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the bmObjects property.
     * 
     * @return
     *     possible object is
     *     {@link BMObjectsType }
     *     
     */
    public BMObjectsType getBmObjects() {
        return bmObjects;
    }

    /**
     * Sets the value of the bmObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMObjectsType }
     *     
     */
    public void setBmObjects(BMObjectsType value) {
        this.bmObjects = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityType }
     *     
     */
    public PriorityType getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityType }
     *     
     */
    public void setPriority(PriorityType value) {
        this.priority = value;
    }

    /**
     * Gets the value of the startJob property.
     * 
     * @return
     *     possible object is
     *     {@link StartJobType }
     *     
     */
    public StartJobType getStartJob() {
        return startJob;
    }

    /**
     * Sets the value of the startJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartJobType }
     *     
     */
    public void setStartJob(StartJobType value) {
        this.startJob = value;
    }

    /**
     * Gets the value of the finishBefore property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishBefore() {
        return finishBefore;
    }

    /**
     * Sets the value of the finishBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishBefore(XMLGregorianCalendar value) {
        this.finishBefore = value;
    }

    /**
     * Gets the value of the estimatedCompletionDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEstimatedCompletionDuration() {
        return estimatedCompletionDuration;
    }

    /**
     * Sets the value of the estimatedCompletionDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEstimatedCompletionDuration(Duration value) {
        this.estimatedCompletionDuration = value;
    }

    /**
     * Gets the value of the currentQueuePosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentQueuePosition() {
        return currentQueuePosition;
    }

    /**
     * Sets the value of the currentQueuePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentQueuePosition(BigInteger value) {
        this.currentQueuePosition = value;
    }

    /**
     * Gets the value of the jobStartedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJobStartedTime() {
        return jobStartedTime;
    }

    /**
     * Sets the value of the jobStartedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJobStartedTime(XMLGregorianCalendar value) {
        this.jobStartedTime = value;
    }

    /**
     * Gets the value of the jobElapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getJobElapsedTime() {
        return jobElapsedTime;
    }

    /**
     * Sets the value of the jobElapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setJobElapsedTime(Duration value) {
        this.jobElapsedTime = value;
    }

    /**
     * Gets the value of the jobCompletedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJobCompletedTime() {
        return jobCompletedTime;
    }

    /**
     * Sets the value of the jobCompletedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJobCompletedTime(XMLGregorianCalendar value) {
        this.jobCompletedTime = value;
    }

    /**
     * Gets the value of the processed property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessedInfoType }
     *     
     */
    public ProcessedInfoType getProcessed() {
        return processed;
    }

    /**
     * Sets the value of the processed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessedInfoType }
     *     
     */
    public void setProcessed(ProcessedInfoType value) {
        this.processed = value;
    }

}