//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.bms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Description: 
 *             if Content Part handling is supported or not.
 *           
 * 
 * <p>Java class for SegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://base.fims.tv}ResourceType">
 *       &lt;sequence>
 *         &lt;element name="timelines" type="{http://base.fims.tv}TimelinesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentType", propOrder = {
    "timelines"
})
@XmlSeeAlso({
    BMContentPartType.class
})
public abstract class SegmentType
    extends ResourceType
{

    protected TimelinesType timelines;

    /**
     * Gets the value of the timelines property.
     * 
     * @return
     *     possible object is
     *     {@link TimelinesType }
     *     
     */
    public TimelinesType getTimelines() {
        return timelines;
    }

    /**
     * Sets the value of the timelines property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimelinesType }
     *     
     */
    public void setTimelines(TimelinesType value) {
        this.timelines = value;
    }

}