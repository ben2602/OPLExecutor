//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.bms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.imf.oplexecutor.fims.tim.TimeType;


/**
 * <p>Java class for StartProcessByServiceDefinedTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StartProcessByServiceDefinedTimeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://base.fims.tv}StartProcessType">
 *       &lt;sequence>
 *         &lt;element name="actualStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualStartMark" type="{http://baseTime.fims.tv}TimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartProcessByServiceDefinedTimeType", propOrder = {
    "actualStartTime",
    "actualStartMark"
})
public class StartProcessByServiceDefinedTimeType
    extends StartProcessType
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualStartTime;
    protected TimeType actualStartMark;

    /**
     * Gets the value of the actualStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualStartTime() {
        return actualStartTime;
    }

    /**
     * Sets the value of the actualStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualStartTime(XMLGregorianCalendar value) {
        this.actualStartTime = value;
    }

    /**
     * Gets the value of the actualStartMark property.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getActualStartMark() {
        return actualStartMark;
    }

    /**
     * Sets the value of the actualStartMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setActualStartMark(TimeType value) {
        this.actualStartMark = value;
    }

}
