//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.mdcf.c;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.smpte-ra.org/schemas/st2071/2015/identity}UDN"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parent", propOrder = {
    "udn"
})
public class Parent {

    @XmlElement(name = "UDN", namespace = "http://www.smpte-ra.org/schemas/st2071/2015/identity", required = true)
    protected String udn;

    /**
     * Gets the value of the udn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUDN() {
        return udn;
    }

    /**
     * Sets the value of the udn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUDN(String value) {
        this.udn = value;
    }

}
