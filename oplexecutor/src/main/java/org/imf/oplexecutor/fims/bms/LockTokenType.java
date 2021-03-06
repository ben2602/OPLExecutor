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


/**
 * Introduced In Version: 1_1_0
 * 
 * <p>Java class for LockTokenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LockTokenType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://base.fims.tv}ResourceType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="resourceReferences" type="{http://base.fims.tv}ResourceReferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockTokenType", propOrder = {
    "userName",
    "expiration",
    "resourceReferences"
})
public class LockTokenType
    extends ResourceType
{

    protected String userName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiration;
    protected ResourceReferencesType resourceReferences;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiration(XMLGregorianCalendar value) {
        this.expiration = value;
    }

    /**
     * Gets the value of the resourceReferences property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReferencesType }
     *     
     */
    public ResourceReferencesType getResourceReferences() {
        return resourceReferences;
    }

    /**
     * Sets the value of the resourceReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReferencesType }
     *     
     */
    public void setResourceReferences(ResourceReferencesType value) {
        this.resourceReferences = value;
    }

}
