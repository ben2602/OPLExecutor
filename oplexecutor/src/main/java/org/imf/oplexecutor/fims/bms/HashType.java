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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for HashType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HashType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hashFunction" type="{http://base.fims.tv}HashFunctionType"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HashType", propOrder = {
    "hashFunction",
    "value"
})
public class HashType {

    @XmlElement(required = true)
    protected HashFunctionType hashFunction;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] value;

    /**
     * Gets the value of the hashFunction property.
     * 
     * @return
     *     possible object is
     *     {@link HashFunctionType }
     *     
     */
    public HashFunctionType getHashFunction() {
        return hashFunction;
    }

    /**
     * Sets the value of the hashFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link HashFunctionType }
     *     
     */
    public void setHashFunction(HashFunctionType value) {
        this.hashFunction = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

}
