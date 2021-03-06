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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Introduced In Version: 1_2_0
 * 
 * <p>Java class for filterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trackIdRef" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/>
 *         &lt;element name="filterProfile">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://base.fims.tv}typeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="filterSetting" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="technicalAttribute" type="{http://base.fims.tv}TechnicalAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://base.fims.tv}typeGroup"/>
 *                 &lt;attribute name="filterAttributeOrder" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://base.fims.tv}typeGroup"/>
 *       &lt;attribute name="filterOrder" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filterType", propOrder = {
    "trackIdRef",
    "filterProfile",
    "filterSetting"
})
public class FilterType {

    @XmlElement(required = true)
    protected List<Object> trackIdRef;
    @XmlElement(required = true)
    protected FilterType.FilterProfile filterProfile;
    protected List<FilterType.FilterSetting> filterSetting;
    @XmlAttribute(name = "filterOrder")
    @XmlSchemaType(name = "anySimpleType")
    protected String filterOrder;
    @XmlAttribute(name = "typeLabel")
    protected String typeLabel;
    @XmlAttribute(name = "typeDefinition")
    protected String typeDefinition;
    @XmlAttribute(name = "typeLink")
    @XmlSchemaType(name = "anyURI")
    protected String typeLink;

    /**
     * Gets the value of the trackIdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackIdRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackIdRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTrackIdRef() {
        if (trackIdRef == null) {
            trackIdRef = new ArrayList<Object>();
        }
        return this.trackIdRef;
    }

    /**
     * Gets the value of the filterProfile property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType.FilterProfile }
     *     
     */
    public FilterType.FilterProfile getFilterProfile() {
        return filterProfile;
    }

    /**
     * Sets the value of the filterProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType.FilterProfile }
     *     
     */
    public void setFilterProfile(FilterType.FilterProfile value) {
        this.filterProfile = value;
    }

    /**
     * Gets the value of the filterSetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterSetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType.FilterSetting }
     * 
     * 
     */
    public List<FilterType.FilterSetting> getFilterSetting() {
        if (filterSetting == null) {
            filterSetting = new ArrayList<FilterType.FilterSetting>();
        }
        return this.filterSetting;
    }

    /**
     * Gets the value of the filterOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterOrder() {
        return filterOrder;
    }

    /**
     * Sets the value of the filterOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterOrder(String value) {
        this.filterOrder = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://base.fims.tv}typeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FilterProfile {

        @XmlAttribute(name = "typeLabel")
        protected String typeLabel;
        @XmlAttribute(name = "typeDefinition")
        protected String typeDefinition;
        @XmlAttribute(name = "typeLink")
        @XmlSchemaType(name = "anyURI")
        protected String typeLink;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="technicalAttribute" type="{http://base.fims.tv}TechnicalAttributeType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://base.fims.tv}typeGroup"/>
     *       &lt;attribute name="filterAttributeOrder" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "technicalAttribute"
    })
    public static class FilterSetting {

        protected List<TechnicalAttributeType> technicalAttribute;
        @XmlAttribute(name = "filterAttributeOrder")
        @XmlSchemaType(name = "anySimpleType")
        protected String filterAttributeOrder;
        @XmlAttribute(name = "typeLabel")
        protected String typeLabel;
        @XmlAttribute(name = "typeDefinition")
        protected String typeDefinition;
        @XmlAttribute(name = "typeLink")
        @XmlSchemaType(name = "anyURI")
        protected String typeLink;

        /**
         * Gets the value of the technicalAttribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the technicalAttribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTechnicalAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TechnicalAttributeType }
         * 
         * 
         */
        public List<TechnicalAttributeType> getTechnicalAttribute() {
            if (technicalAttribute == null) {
                technicalAttribute = new ArrayList<TechnicalAttributeType>();
            }
            return this.technicalAttribute;
        }

        /**
         * Gets the value of the filterAttributeOrder property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFilterAttributeOrder() {
            return filterAttributeOrder;
        }

        /**
         * Sets the value of the filterAttributeOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFilterAttributeOrder(String value) {
            this.filterAttributeOrder = value;
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

    }

}
