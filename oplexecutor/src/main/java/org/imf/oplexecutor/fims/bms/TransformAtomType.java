//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.bms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransformAtomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransformAtomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="videoFormat" type="{http://base.fims.tv}VideoFormatType" minOccurs="0"/>
 *         &lt;element name="audioFormat" type="{http://base.fims.tv}AudioFormatType" minOccurs="0"/>
 *         &lt;element name="containerFormat" type="{http://base.fims.tv}ContainerFormatType" minOccurs="0"/>
 *         &lt;element name="filter" type="{http://base.fims.tv}filterType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TransformAtomType", propOrder = {
    "videoFormat",
    "audioFormat",
    "containerFormat",
    "filter",
    "extensionGroup",
    "extensionAttributes"
})
public class TransformAtomType {

    protected VideoFormatType videoFormat;
    protected AudioFormatType audioFormat;
    protected ContainerFormatType containerFormat;
    protected List<FilterType> filter;
    @XmlElement(name = "ExtensionGroup")
    protected ExtensionGroup extensionGroup;
    @XmlElement(name = "ExtensionAttributes")
    protected ExtensionAttributes extensionAttributes;

    /**
     * Gets the value of the videoFormat property.
     * 
     * @return
     *     possible object is
     *     {@link VideoFormatType }
     *     
     */
    public VideoFormatType getVideoFormat() {
        return videoFormat;
    }

    /**
     * Sets the value of the videoFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoFormatType }
     *     
     */
    public void setVideoFormat(VideoFormatType value) {
        this.videoFormat = value;
    }

    /**
     * Gets the value of the audioFormat property.
     * 
     * @return
     *     possible object is
     *     {@link AudioFormatType }
     *     
     */
    public AudioFormatType getAudioFormat() {
        return audioFormat;
    }

    /**
     * Sets the value of the audioFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioFormatType }
     *     
     */
    public void setAudioFormat(AudioFormatType value) {
        this.audioFormat = value;
    }

    /**
     * Gets the value of the containerFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerFormatType }
     *     
     */
    public ContainerFormatType getContainerFormat() {
        return containerFormat;
    }

    /**
     * Sets the value of the containerFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerFormatType }
     *     
     */
    public void setContainerFormat(ContainerFormatType value) {
        this.containerFormat = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getFilter() {
        if (filter == null) {
            filter = new ArrayList<FilterType>();
        }
        return this.filter;
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
