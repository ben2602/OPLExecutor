//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.bms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.imf.oplexecutor.fims.tim.TimeType;


/**
 * <p>Java class for StartProcessByTimeMarkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StartProcessByTimeMarkType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://base.fims.tv}StartProcessType">
 *       &lt;sequence>
 *         &lt;element name="timeMark" type="{http://baseTime.fims.tv}TimeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartProcessByTimeMarkType", propOrder = {
    "timeMark"
})
public class StartProcessByTimeMarkType
    extends StartProcessType
{

    @XmlElement(required = true)
    protected TimeType timeMark;

    /**
     * Gets the value of the timeMark property.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getTimeMark() {
        return timeMark;
    }

    /**
     * Sets the value of the timeMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setTimeMark(TimeType value) {
        this.timeMark = value;
    }

}
