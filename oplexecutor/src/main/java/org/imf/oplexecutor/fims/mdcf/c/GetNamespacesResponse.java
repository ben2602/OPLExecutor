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
import org.imf.oplexecutor.fims.mdcf.b.UDNs;


/**
 * <p>Java class for getNamespacesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNamespacesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.smpte-ra.org/schemas/st2071/2015/identity}UDNs"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNamespacesResponse", propOrder = {
    "udNs"
})
public class GetNamespacesResponse {

    @XmlElement(name = "UDNs", namespace = "http://www.smpte-ra.org/schemas/st2071/2015/identity", required = true)
    protected UDNs udNs;

    /**
     * Gets the value of the udNs property.
     * 
     * @return
     *     possible object is
     *     {@link UDNs }
     *     
     */
    public UDNs getUDNs() {
        return udNs;
    }

    /**
     * Sets the value of the udNs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UDNs }
     *     
     */
    public void setUDNs(UDNs value) {
        this.udNs = value;
    }

}