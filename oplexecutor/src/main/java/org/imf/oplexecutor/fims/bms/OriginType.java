//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.bms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.imf.oplexecutor.fims.tim.DurationType;
import org.imf.oplexecutor.fims.tim.TimeType;


/**
 * Inclusion In Response: Optional
 * 
 * <p>Java class for OriginType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="start" type="{http://baseTime.fims.tv}TimeType" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://baseTime.fims.tv}DurationType" minOccurs="0"/>
 *         &lt;element name="bmContentIDRef" type="{http://base.fims.tv}UID" minOccurs="0"/>
 *         &lt;element name="bmContentFormatIDRef" type="{http://base.fims.tv}UID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginType", propOrder = {
    "start",
    "duration",
    "bmContentIDRef",
    "bmContentFormatIDRef"
})
public class OriginType {

    protected TimeType start;
    protected DurationType duration;
    protected String bmContentIDRef;
    protected String bmContentFormatIDRef;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setStart(TimeType value) {
        this.start = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setDuration(DurationType value) {
        this.duration = value;
    }

    /**
     * Gets the value of the bmContentIDRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBmContentIDRef() {
        return bmContentIDRef;
    }

    /**
     * Sets the value of the bmContentIDRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBmContentIDRef(String value) {
        this.bmContentIDRef = value;
    }

    /**
     * Gets the value of the bmContentFormatIDRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBmContentFormatIDRef() {
        return bmContentFormatIDRef;
    }

    /**
     * Sets the value of the bmContentFormatIDRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBmContentFormatIDRef(String value) {
        this.bmContentFormatIDRef = value;
    }

}
