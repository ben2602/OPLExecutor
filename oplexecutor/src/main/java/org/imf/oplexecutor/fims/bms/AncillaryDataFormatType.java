//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.bms;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryDataFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryDataFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SDID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="wrappingType" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ExtensionGroup" type="{http://base.fims.tv}ExtensionGroup" minOccurs="0"/>
 *         &lt;element name="ExtensionAttributes" type="{http://base.fims.tv}ExtensionAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryDataFormatType", propOrder = {
    "did",
    "sdid",
    "lineNumber",
    "wrappingType",
    "extensionGroup",
    "extensionAttributes"
})
public class AncillaryDataFormatType {

    @XmlElement(name = "DID")
    protected BigInteger did;
    @XmlElement(name = "SDID")
    protected BigInteger sdid;
    protected BigInteger lineNumber;
    protected BigInteger wrappingType;
    @XmlElement(name = "ExtensionGroup")
    protected ExtensionGroup extensionGroup;
    @XmlElement(name = "ExtensionAttributes")
    protected ExtensionAttributes extensionAttributes;

    /**
     * Gets the value of the did property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDID() {
        return did;
    }

    /**
     * Sets the value of the did property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDID(BigInteger value) {
        this.did = value;
    }

    /**
     * Gets the value of the sdid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSDID() {
        return sdid;
    }

    /**
     * Sets the value of the sdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSDID(BigInteger value) {
        this.sdid = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the wrappingType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWrappingType() {
        return wrappingType;
    }

    /**
     * Sets the value of the wrappingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWrappingType(BigInteger value) {
        this.wrappingType = value;
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

}