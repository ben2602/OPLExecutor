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
 * Inclusion In Response: optional
 * 
 * <p>Java class for BMContentPartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMContentPartType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://base.fims.tv}SegmentType">
 *       &lt;sequence>
 *         &lt;element name="start" type="{http://baseTime.fims.tv}TimeType" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://baseTime.fims.tv}DurationType" minOccurs="0"/>
 *         &lt;element name="spatialScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bmContentPartFormat" type="{http://base.fims.tv}BMContentPartFormatType" minOccurs="0"/>
 *         &lt;element name="descriptions" type="{http://base.fims.tv}DescriptionsType" minOccurs="0"/>
 *         &lt;element name="origin" type="{http://base.fims.tv}OriginType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMContentPartType", propOrder = {
    "start",
    "duration",
    "spatialScope",
    "bmContentPartFormat",
    "descriptions",
    "origin"
})
public class BMContentPartType
    extends SegmentType
{

    protected TimeType start;
    protected DurationType duration;
    protected String spatialScope;
    protected BMContentPartFormatType bmContentPartFormat;
    protected DescriptionsType descriptions;
    protected OriginType origin;

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
     * Gets the value of the spatialScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpatialScope() {
        return spatialScope;
    }

    /**
     * Sets the value of the spatialScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpatialScope(String value) {
        this.spatialScope = value;
    }

    /**
     * Gets the value of the bmContentPartFormat property.
     * 
     * @return
     *     possible object is
     *     {@link BMContentPartFormatType }
     *     
     */
    public BMContentPartFormatType getBmContentPartFormat() {
        return bmContentPartFormat;
    }

    /**
     * Sets the value of the bmContentPartFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMContentPartFormatType }
     *     
     */
    public void setBmContentPartFormat(BMContentPartFormatType value) {
        this.bmContentPartFormat = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionsType }
     *     
     */
    public DescriptionsType getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionsType }
     *     
     */
    public void setDescriptions(DescriptionsType value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link OriginType }
     *     
     */
    public OriginType getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginType }
     *     
     */
    public void setOrigin(OriginType value) {
        this.origin = value;
    }

}
