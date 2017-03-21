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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for rightsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rightsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rightsExpression" type="{http://description.fims.tv}textElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rightsLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="rightsHolder" type="{http://description.fims.tv}entityType" minOccurs="0"/>
 *         &lt;element name="exploitationIssues" type="{http://description.fims.tv}textElementType" minOccurs="0"/>
 *         &lt;element name="coverage" type="{http://description.fims.tv}coverageType" minOccurs="0"/>
 *         &lt;element name="rightsClearanceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="processingRestrictionFlag" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>boolean">
 *                 &lt;attGroup ref="{http://description.fims.tv}typeGroup"/>
 *                 &lt;attribute name="qualityClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="restrictions" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="disclaimer" type="{http://description.fims.tv}textElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="copyrightStatement" type="{http://description.fims.tv}textElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rightsId" type="{http://description.fims.tv}identifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactDetails" type="{http://description.fims.tv}contactDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://description.fims.tv}typeGroup"/>
 *       &lt;attribute name="note" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="formatIDRefs" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="rightsID" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rightsType", propOrder = {
    "rightsExpression",
    "rightsLink",
    "rightsHolder",
    "exploitationIssues",
    "coverage",
    "rightsClearanceFlag",
    "processingRestrictionFlag",
    "disclaimer",
    "copyrightStatement",
    "rightsId",
    "contactDetails"
})
public class RightsType {

    protected List<TextElementType> rightsExpression;
    @XmlSchemaType(name = "anyURI")
    protected String rightsLink;
    protected EntityType rightsHolder;
    protected TextElementType exploitationIssues;
    protected CoverageType coverage;
    protected Boolean rightsClearanceFlag;
    protected RightsType.ProcessingRestrictionFlag processingRestrictionFlag;
    protected List<TextElementType> disclaimer;
    protected List<TextElementType> copyrightStatement;
    protected List<IdentifierType> rightsId;
    protected List<ContactDetailsType> contactDetails;
    @XmlAttribute(name = "note")
    protected String note;
    @XmlAttribute(name = "formatIDRefs")
    @XmlSchemaType(name = "anyURI")
    protected String formatIDRefs;
    @XmlAttribute(name = "rightsID")
    @XmlSchemaType(name = "anyURI")
    protected String rightsID;
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

    /**
     * Gets the value of the rightsExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightsExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightsExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextElementType }
     * 
     * 
     */
    public List<TextElementType> getRightsExpression() {
        if (rightsExpression == null) {
            rightsExpression = new ArrayList<TextElementType>();
        }
        return this.rightsExpression;
    }

    /**
     * Gets the value of the rightsLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightsLink() {
        return rightsLink;
    }

    /**
     * Sets the value of the rightsLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightsLink(String value) {
        this.rightsLink = value;
    }

    /**
     * Gets the value of the rightsHolder property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getRightsHolder() {
        return rightsHolder;
    }

    /**
     * Sets the value of the rightsHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setRightsHolder(EntityType value) {
        this.rightsHolder = value;
    }

    /**
     * Gets the value of the exploitationIssues property.
     * 
     * @return
     *     possible object is
     *     {@link TextElementType }
     *     
     */
    public TextElementType getExploitationIssues() {
        return exploitationIssues;
    }

    /**
     * Sets the value of the exploitationIssues property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextElementType }
     *     
     */
    public void setExploitationIssues(TextElementType value) {
        this.exploitationIssues = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageType }
     *     
     */
    public CoverageType getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageType }
     *     
     */
    public void setCoverage(CoverageType value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the rightsClearanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRightsClearanceFlag() {
        return rightsClearanceFlag;
    }

    /**
     * Sets the value of the rightsClearanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightsClearanceFlag(Boolean value) {
        this.rightsClearanceFlag = value;
    }

    /**
     * Gets the value of the processingRestrictionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link RightsType.ProcessingRestrictionFlag }
     *     
     */
    public RightsType.ProcessingRestrictionFlag getProcessingRestrictionFlag() {
        return processingRestrictionFlag;
    }

    /**
     * Sets the value of the processingRestrictionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link RightsType.ProcessingRestrictionFlag }
     *     
     */
    public void setProcessingRestrictionFlag(RightsType.ProcessingRestrictionFlag value) {
        this.processingRestrictionFlag = value;
    }

    /**
     * Gets the value of the disclaimer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclaimer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclaimer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextElementType }
     * 
     * 
     */
    public List<TextElementType> getDisclaimer() {
        if (disclaimer == null) {
            disclaimer = new ArrayList<TextElementType>();
        }
        return this.disclaimer;
    }

    /**
     * Gets the value of the copyrightStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyrightStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyrightStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextElementType }
     * 
     * 
     */
    public List<TextElementType> getCopyrightStatement() {
        if (copyrightStatement == null) {
            copyrightStatement = new ArrayList<TextElementType>();
        }
        return this.copyrightStatement;
    }

    /**
     * Gets the value of the rightsId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightsId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightsId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getRightsId() {
        if (rightsId == null) {
            rightsId = new ArrayList<IdentifierType>();
        }
        return this.rightsId;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetailsType }
     * 
     * 
     */
    public List<ContactDetailsType> getContactDetails() {
        if (contactDetails == null) {
            contactDetails = new ArrayList<ContactDetailsType>();
        }
        return this.contactDetails;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the formatIDRefs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatIDRefs() {
        return formatIDRefs;
    }

    /**
     * Sets the value of the formatIDRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatIDRefs(String value) {
        this.formatIDRefs = value;
    }

    /**
     * Gets the value of the rightsID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightsID() {
        return rightsID;
    }

    /**
     * Sets the value of the rightsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightsID(String value) {
        this.rightsID = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>boolean">
     *       &lt;attGroup ref="{http://description.fims.tv}typeGroup"/>
     *       &lt;attribute name="qualityClass" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="restrictions" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class ProcessingRestrictionFlag {

        @XmlValue
        protected boolean value;
        @XmlAttribute(name = "qualityClass")
        protected String qualityClass;
        @XmlAttribute(name = "restrictions")
        protected String restrictions;
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

        /**
         * Gets the value of the value property.
         * 
         */
        public boolean isValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(boolean value) {
            this.value = value;
        }

        /**
         * Gets the value of the qualityClass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualityClass() {
            return qualityClass;
        }

        /**
         * Sets the value of the qualityClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualityClass(String value) {
            this.qualityClass = value;
        }

        /**
         * Gets the value of the restrictions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRestrictions() {
            return restrictions;
        }

        /**
         * Sets the value of the restrictions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRestrictions(String value) {
            this.restrictions = value;
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

    }

}