//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.mdcf.h;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.imf.oplexecutor.fims.mdcf.a.Capabilities;
import org.imf.oplexecutor.fims.mdcf.f.Mode;


/**
 * <p>Java class for IMPLEMENTS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMPLEMENTS">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.smpte-ra.org/schemas/st2071/2015/query}Expression">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.smpte-ra.org/schemas/st2071/2015/mode}Mode" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/schemas/st2071/2015/query}Interfaces"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMPLEMENTS", propOrder = {
    "mode",
    "interfaces"
})
public class IMPLEMENTS
    extends Expression
{

    @XmlElement(name = "Mode", namespace = "http://www.smpte-ra.org/schemas/st2071/2015/mode")
    protected Mode mode;
    @XmlElement(name = "Interfaces", required = true)
    protected Capabilities interfaces;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link Mode }
     *     
     */
    public Mode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mode }
     *     
     */
    public void setMode(Mode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the interfaces property.
     * 
     * @return
     *     possible object is
     *     {@link Capabilities }
     *     
     */
    public Capabilities getInterfaces() {
        return interfaces;
    }

    /**
     * Sets the value of the interfaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Capabilities }
     *     
     */
    public void setInterfaces(Capabilities value) {
        this.interfaces = value;
    }

}