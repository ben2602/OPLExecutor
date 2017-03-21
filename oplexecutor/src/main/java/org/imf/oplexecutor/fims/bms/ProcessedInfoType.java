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
 *         The type of processed information provided.
 *       
 * 
 * <p>Java class for ProcessedInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessedInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="percentageProcessedCompleted">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessedInfoType", propOrder = {
    "percentageProcessedCompleted"
})
@XmlSeeAlso({
    ProcessedInfoByBytesType.class,
    ProcessedInfoByFramesType.class
})
public abstract class ProcessedInfoType {

    protected int percentageProcessedCompleted;

    /**
     * Gets the value of the percentageProcessedCompleted property.
     * 
     */
    public int getPercentageProcessedCompleted() {
        return percentageProcessedCompleted;
    }

    /**
     * Sets the value of the percentageProcessedCompleted property.
     * 
     */
    public void setPercentageProcessedCompleted(int value) {
        this.percentageProcessedCompleted = value;
    }

}