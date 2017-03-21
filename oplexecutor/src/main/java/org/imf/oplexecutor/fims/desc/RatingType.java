//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.desc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Introduced In Version:
 * 				1_2_0
 * 
 * <p>Java class for ratingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ratingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ratingValue" type="{http://description.fims.tv}textElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingScaleMaxValue" type="{http://description.fims.tv}textElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingScaleMinValue" type="{http://description.fims.tv}textElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingProvider" type="{http://description.fims.tv}entityType" minOccurs="0"/>
 *         &lt;element name="ratingRegion" type="{http://description.fims.tv}regionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ratingExclusionRegion" type="{http://description.fims.tv}regionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://description.fims.tv}typeGroup"/>
 *       &lt;attGroup ref="{http://description.fims.tv}formatGroup"/>
 *       &lt;attribute name="ratingSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ratingEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="linkToLogo" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="notRated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="adultContent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ratingType", propOrder = {
    "ratingValue",
    "ratingLink",
    "ratingScaleMaxValue",
    "ratingScaleMinValue",
    "ratingProvider",
    "ratingRegion",
    "ratingExclusionRegion"
})
public class RatingType {

    protected List<TextElementType> ratingValue;
    @XmlSchemaType(name = "anyURI")
    protected List<String> ratingLink;
    protected List<TextElementType> ratingScaleMaxValue;
    protected List<TextElementType> ratingScaleMinValue;
    protected EntityType ratingProvider;
    protected List<RegionType> ratingRegion;
    protected List<RegionType> ratingExclusionRegion;
    @XmlAttribute(name = "ratingSystem")
    protected String ratingSystem;
    @XmlAttribute(name = "ratingEnvironment")
    protected String ratingEnvironment;
    @XmlAttribute(name = "reason")
    protected String reason;
    @XmlAttribute(name = "linkToLogo")
    @XmlSchemaType(name = "anyURI")
    protected String linkToLogo;
    @XmlAttribute(name = "notRated")
    protected Boolean notRated;
    @XmlAttribute(name = "adultContent")
    protected Boolean adultContent;
    @XmlAttribute(name = "typeLabel")
    protected String typeLabel;
    @XmlAttribute(name = "typeDefinition")
    protected String typeDefinition;
    @XmlAttribute(name = "typeLink")
    @XmlSchemaType(name = "anyURI")
    protected String typeLink;
    @XmlAttribute(name = "typeSource")
    protected String typeSource;
    @XmlAttribute(name = "typeNamespace")
    protected String typeNamespace;
    @XmlAttribute(name = "typeLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String typeLanguage;
    @XmlAttribute(name = "formatLabel")
    protected String formatLabel;
    @XmlAttribute(name = "formatDefinition")
    protected String formatDefinition;
    @XmlAttribute(name = "formatLink")
    @XmlSchemaType(name = "anyURI")
    protected String formatLink;
    @XmlAttribute(name = "formatSource")
    protected String formatSource;
    @XmlAttribute(name = "formatNamespace")
    protected String formatNamespace;
    @XmlAttribute(name = "formatLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String formatLanguage;

    /**
     * Gets the value of the ratingValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextElementType }
     * 
     * 
     */
    public List<TextElementType> getRatingValue() {
        if (ratingValue == null) {
            ratingValue = new ArrayList<TextElementType>();
        }
        return this.ratingValue;
    }

    /**
     * Gets the value of the ratingLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRatingLink() {
        if (ratingLink == null) {
            ratingLink = new ArrayList<String>();
        }
        return this.ratingLink;
    }

    /**
     * Gets the value of the ratingScaleMaxValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingScaleMaxValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingScaleMaxValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextElementType }
     * 
     * 
     */
    public List<TextElementType> getRatingScaleMaxValue() {
        if (ratingScaleMaxValue == null) {
            ratingScaleMaxValue = new ArrayList<TextElementType>();
        }
        return this.ratingScaleMaxValue;
    }

    /**
     * Gets the value of the ratingScaleMinValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingScaleMinValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingScaleMinValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextElementType }
     * 
     * 
     */
    public List<TextElementType> getRatingScaleMinValue() {
        if (ratingScaleMinValue == null) {
            ratingScaleMinValue = new ArrayList<TextElementType>();
        }
        return this.ratingScaleMinValue;
    }

    /**
     * Gets the value of the ratingProvider property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getRatingProvider() {
        return ratingProvider;
    }

    /**
     * Sets the value of the ratingProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setRatingProvider(EntityType value) {
        this.ratingProvider = value;
    }

    /**
     * Gets the value of the ratingRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionType }
     * 
     * 
     */
    public List<RegionType> getRatingRegion() {
        if (ratingRegion == null) {
            ratingRegion = new ArrayList<RegionType>();
        }
        return this.ratingRegion;
    }

    /**
     * Gets the value of the ratingExclusionRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingExclusionRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingExclusionRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionType }
     * 
     * 
     */
    public List<RegionType> getRatingExclusionRegion() {
        if (ratingExclusionRegion == null) {
            ratingExclusionRegion = new ArrayList<RegionType>();
        }
        return this.ratingExclusionRegion;
    }

    /**
     * Gets the value of the ratingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingSystem() {
        return ratingSystem;
    }

    /**
     * Sets the value of the ratingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingSystem(String value) {
        this.ratingSystem = value;
    }

    /**
     * Gets the value of the ratingEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingEnvironment() {
        return ratingEnvironment;
    }

    /**
     * Sets the value of the ratingEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingEnvironment(String value) {
        this.ratingEnvironment = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the linkToLogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkToLogo() {
        return linkToLogo;
    }

    /**
     * Sets the value of the linkToLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkToLogo(String value) {
        this.linkToLogo = value;
    }

    /**
     * Gets the value of the notRated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotRated() {
        return notRated;
    }

    /**
     * Sets the value of the notRated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotRated(Boolean value) {
        this.notRated = value;
    }

    /**
     * Gets the value of the adultContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdultContent() {
        return adultContent;
    }

    /**
     * Sets the value of the adultContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdultContent(Boolean value) {
        this.adultContent = value;
    }

    /**
     * Gets the value of the typeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeLabel() {
        return typeLabel;
    }

    /**
     * Sets the value of the typeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeLabel(String value) {
        this.typeLabel = value;
    }

    /**
     * Gets the value of the typeDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDefinition() {
        return typeDefinition;
    }

    /**
     * Sets the value of the typeDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDefinition(String value) {
        this.typeDefinition = value;
    }

    /**
     * Gets the value of the typeLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeLink() {
        return typeLink;
    }

    /**
     * Sets the value of the typeLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeLink(String value) {
        this.typeLink = value;
    }

    /**
     * Gets the value of the typeSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSource() {
        return typeSource;
    }

    /**
     * Sets the value of the typeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSource(String value) {
        this.typeSource = value;
    }

    /**
     * Gets the value of the typeNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeNamespace() {
        return typeNamespace;
    }

    /**
     * Sets the value of the typeNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeNamespace(String value) {
        this.typeNamespace = value;
    }

    /**
     * Gets the value of the typeLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeLanguage() {
        return typeLanguage;
    }

    /**
     * Sets the value of the typeLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeLanguage(String value) {
        this.typeLanguage = value;
    }

    /**
     * Gets the value of the formatLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatLabel() {
        return formatLabel;
    }

    /**
     * Sets the value of the formatLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatLabel(String value) {
        this.formatLabel = value;
    }

    /**
     * Gets the value of the formatDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatDefinition() {
        return formatDefinition;
    }

    /**
     * Sets the value of the formatDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatDefinition(String value) {
        this.formatDefinition = value;
    }

    /**
     * Gets the value of the formatLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatLink() {
        return formatLink;
    }

    /**
     * Sets the value of the formatLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatLink(String value) {
        this.formatLink = value;
    }

    /**
     * Gets the value of the formatSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatSource() {
        return formatSource;
    }

    /**
     * Sets the value of the formatSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatSource(String value) {
        this.formatSource = value;
    }

    /**
     * Gets the value of the formatNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatNamespace() {
        return formatNamespace;
    }

    /**
     * Sets the value of the formatNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatNamespace(String value) {
        this.formatNamespace = value;
    }

    /**
     * Gets the value of the formatLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatLanguage() {
        return formatLanguage;
    }

    /**
     * Sets the value of the formatLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatLanguage(String value) {
        this.formatLanguage = value;
    }

}