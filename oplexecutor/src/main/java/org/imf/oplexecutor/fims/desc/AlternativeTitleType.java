//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.desc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for alternativeTitleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alternativeTitleType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://description.fims.tv>titleType">
 *       &lt;attGroup ref="{http://description.fims.tv}statusGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alternativeTitleType")
public class AlternativeTitleType
    extends TitleType
{

    @XmlAttribute(name = "statusLabel")
    protected String statusLabel;
    @XmlAttribute(name = "statusDefinition")
    protected String statusDefinition;
    @XmlAttribute(name = "statusLink")
    @XmlSchemaType(name = "anyURI")
    protected String statusLink;
    @XmlAttribute(name = "statusNamespace")
    protected String statusNamespace;
    @XmlAttribute(name = "statusLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String statusLanguage;

    /**
     * Gets the value of the statusLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusLabel() {
        return statusLabel;
    }

    /**
     * Sets the value of the statusLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusLabel(String value) {
        this.statusLabel = value;
    }

    /**
     * Gets the value of the statusDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDefinition() {
        return statusDefinition;
    }

    /**
     * Sets the value of the statusDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDefinition(String value) {
        this.statusDefinition = value;
    }

    /**
     * Gets the value of the statusLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusLink() {
        return statusLink;
    }

    /**
     * Sets the value of the statusLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusLink(String value) {
        this.statusLink = value;
    }

    /**
     * Gets the value of the statusNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusNamespace() {
        return statusNamespace;
    }

    /**
     * Sets the value of the statusNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusNamespace(String value) {
        this.statusNamespace = value;
    }

    /**
     * Gets the value of the statusLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusLanguage() {
        return statusLanguage;
    }

    /**
     * Sets the value of the statusLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusLanguage(String value) {
        this.statusLanguage = value;
    }

}
