//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.mdcf.g;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaFile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.smpte-ra.org/schemas/st2071/2015/media}Media">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.smpte-ra.org/schemas/st2071/2015/media}MIMEType"/>
 *         &lt;element ref="{http://www.smpte-ra.org/schemas/st2071/2015/media}Size"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaFile", propOrder = {
    "mimeType",
    "size"
})
@XmlSeeAlso({
    MediaInstance.class
})
public class MediaFile
    extends Media
{

    @XmlElement(name = "MIMEType", required = true)
    protected String mimeType;
    @XmlElement(name = "Size", required = true)
    protected BigInteger size;

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMEType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMEType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

}
