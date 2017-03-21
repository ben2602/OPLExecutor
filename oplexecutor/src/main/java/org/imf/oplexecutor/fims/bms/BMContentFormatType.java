//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.bms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.imf.oplexecutor.fims.tim.DurationType;


/**
 * <p>Java class for BMContentFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMContentFormatType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://base.fims.tv}ResourceType">
 *       &lt;sequence>
 *         &lt;element name="bmEssenceLocators" type="{http://base.fims.tv}BMEssenceLocatorsType" minOccurs="0"/>
 *         &lt;element ref="{http://base.fims.tv}formatCollection" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://baseTime.fims.tv}DurationType" minOccurs="0"/>
 *         &lt;element name="hash" type="{http://base.fims.tv}HashType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="packageSize" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="mimeType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://base.fims.tv}typeGroup"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="technicalAttribute" type="{http://base.fims.tv}TechnicalAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMContentFormatType", propOrder = {
    "bmEssenceLocators",
    "formatCollection",
    "duration",
    "hash",
    "packageSize",
    "mimeType",
    "technicalAttribute"
})
public class BMContentFormatType
    extends ResourceType
{

    protected BMEssenceLocatorsType bmEssenceLocators;
    protected FormatCollection formatCollection;
    protected DurationType duration;
    protected List<HashType> hash;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger packageSize;
    protected BMContentFormatType.MimeType mimeType;
    protected List<TechnicalAttributeType> technicalAttribute;

    /**
     * Gets the value of the bmEssenceLocators property.
     * 
     * @return
     *     possible object is
     *     {@link BMEssenceLocatorsType }
     *     
     */
    public BMEssenceLocatorsType getBmEssenceLocators() {
        return bmEssenceLocators;
    }

    /**
     * Sets the value of the bmEssenceLocators property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMEssenceLocatorsType }
     *     
     */
    public void setBmEssenceLocators(BMEssenceLocatorsType value) {
        this.bmEssenceLocators = value;
    }

    /**
     * Inclusion In Response: Optional
     * 
     * @return
     *     possible object is
     *     {@link FormatCollection }
     *     
     */
    public FormatCollection getFormatCollection() {
        return formatCollection;
    }

    /**
     * Sets the value of the formatCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatCollection }
     *     
     */
    public void setFormatCollection(FormatCollection value) {
        this.formatCollection = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setDuration(DurationType value) {
        this.duration = value;
    }

    /**
     * Gets the value of the hash property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hash property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHash().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HashType }
     * 
     * 
     */
    public List<HashType> getHash() {
        if (hash == null) {
            hash = new ArrayList<HashType>();
        }
        return this.hash;
    }

    /**
     * Gets the value of the packageSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageSize() {
        return packageSize;
    }

    /**
     * Sets the value of the packageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageSize(BigInteger value) {
        this.packageSize = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link BMContentFormatType.MimeType }
     *     
     */
    public BMContentFormatType.MimeType getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMContentFormatType.MimeType }
     *     
     */
    public void setMimeType(BMContentFormatType.MimeType value) {
        this.mimeType = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{http://base.fims.tv}typeGroup"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class MimeType {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "typeLabel")
        protected String typeLabel;
        @XmlAttribute(name = "typeDefinition")
        protected String typeDefinition;
        @XmlAttribute(name = "typeLink")
        @XmlSchemaType(name = "anyURI")
        protected String typeLink;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
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
        public void setValue(String value) {
            this.value = value;
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