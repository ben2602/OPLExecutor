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
import org.imf.oplexecutor.fims.mdcf.a.Capabilities;
import org.imf.oplexecutor.fims.mdcf.b.URLs;


/**
 * <p>Java class for DeviceNotBound complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceNotBound">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.smpte-ra.org/schemas/st2071/2015/device}DeviceException">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.smpte-ra.org/schemas/st2071/2015/device}ParentUDN"/>
 *         &lt;element ref="{http://www.smpte-ra.org/schemas/st2071/2015/identity}URLs"/>
 *         &lt;element ref="{http://www.smpte-ra.org/schemas/st2071/2015/device}Name"/>
 *         &lt;element ref="{http://www.smpte-ra.org/schemas/st2071/2015/types}Capabilities"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceNotBound", propOrder = {
    "parentUDN",
    "urLs",
    "name",
    "capabilities"
})
public class DeviceNotBound
    extends DeviceException
{

    @XmlElement(name = "ParentUDN", required = true)
    protected String parentUDN;
    @XmlElement(name = "URLs", namespace = "http://www.smpte-ra.org/schemas/st2071/2015/identity", required = true)
    protected URLs urLs;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Capabilities", namespace = "http://www.smpte-ra.org/schemas/st2071/2015/types", required = true)
    protected Capabilities capabilities;

    /**
     * Gets the value of the parentUDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentUDN() {
        return parentUDN;
    }

    /**
     * Sets the value of the parentUDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentUDN(String value) {
        this.parentUDN = value;
    }

    /**
     * Gets the value of the urLs property.
     * 
     * @return
     *     possible object is
     *     {@link URLs }
     *     
     */
    public URLs getURLs() {
        return urLs;
    }

    /**
     * Sets the value of the urLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLs }
     *     
     */
    public void setURLs(URLs value) {
        this.urLs = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Capabilities }
     *     
     */
    public Capabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Capabilities }
     *     
     */
    public void setCapabilities(Capabilities value) {
        this.capabilities = value;
    }

}