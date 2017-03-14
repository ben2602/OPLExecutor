//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.bms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Modified In Version: 1_1_0
 * 
 * <p>Java class for ManageJobResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageJobResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://base.fims.tv}job"/>
 *         &lt;element name="ExtensionGroup" type="{http://base.fims.tv}ExtensionGroup" minOccurs="0"/>
 *         &lt;element name="ExtensionAttributes" type="{http://base.fims.tv}ExtensionAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://base.fims.tv}CurrentVersion" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageJobResponseType", propOrder = {
    "job",
    "extensionGroup",
    "extensionAttributes"
})
public class ManageJobResponseType {

    @XmlElement(required = true)
    protected JobType job;
    @XmlElement(name = "ExtensionGroup")
    protected ExtensionGroup extensionGroup;
    @XmlElement(name = "ExtensionAttributes")
    protected ExtensionAttributes extensionAttributes;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Inclusion In Response: Mandatory
     * 
     * @return
     *     possible object is
     *     {@link JobType }
     *     
     */
    public JobType getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobType }
     *     
     */
    public void setJob(JobType value) {
        this.job = value;
    }

    /**
     * Gets the value of the extensionGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionGroup }
     *     
     */
    public ExtensionGroup getExtensionGroup() {
        return extensionGroup;
    }

    /**
     * Sets the value of the extensionGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionGroup }
     *     
     */
    public void setExtensionGroup(ExtensionGroup value) {
        this.extensionGroup = value;
    }

    /**
     * Gets the value of the extensionAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionAttributes }
     *     
     */
    public ExtensionAttributes getExtensionAttributes() {
        return extensionAttributes;
    }

    /**
     * Sets the value of the extensionAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionAttributes }
     *     
     */
    public void setExtensionAttributes(ExtensionAttributes value) {
        this.extensionAttributes = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
