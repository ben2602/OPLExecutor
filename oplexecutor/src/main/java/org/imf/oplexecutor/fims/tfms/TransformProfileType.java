//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.tfms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.imf.oplexecutor.fims.bms.ContentPartAtomType;
import org.imf.oplexecutor.fims.bms.ProfileType;
import org.imf.oplexecutor.fims.bms.SimpleEDLAtomType;
import org.imf.oplexecutor.fims.bms.TransferAtomType;
import org.imf.oplexecutor.fims.bms.TransformAtomType;
import org.imf.oplexecutor.fims.bms.WholeContentAtomType;


/**
 * <p>Java class for TransformProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransformProfileType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://base.fims.tv}ProfileType">
 *       &lt;sequence>
 *         &lt;element name="transformAtom" type="{http://base.fims.tv}TransformAtomType"/>
 *         &lt;element name="transferAtom" type="{http://base.fims.tv}TransferAtomType" maxOccurs="unbounded"/>
 *         &lt;element name="contentPartAtom" type="{http://base.fims.tv}ContentPartAtomType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="simpleEDLAtom" type="{http://base.fims.tv}SimpleEDLAtomType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wholeContentAtom" type="{http://base.fims.tv}WholeContentAtomType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outputFileNamePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformProfileType", propOrder = {
    "transformAtom",
    "transferAtom",
    "contentPartAtom",
    "simpleEDLAtom",
    "wholeContentAtom",
    "outputFileNamePattern"
})
public class TransformProfileType
    extends ProfileType
{

    @XmlElement(required = true)
    protected TransformAtomType transformAtom;
    @XmlElement(required = true)
    protected List<TransferAtomType> transferAtom;
    protected List<ContentPartAtomType> contentPartAtom;
    protected List<SimpleEDLAtomType> simpleEDLAtom;
    protected List<WholeContentAtomType> wholeContentAtom;
    protected String outputFileNamePattern;

    /**
     * Gets the value of the transformAtom property.
     * 
     * @return
     *     possible object is
     *     {@link TransformAtomType }
     *     
     */
    public TransformAtomType getTransformAtom() {
        return transformAtom;
    }

    /**
     * Sets the value of the transformAtom property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformAtomType }
     *     
     */
    public void setTransformAtom(TransformAtomType value) {
        this.transformAtom = value;
    }

    /**
     * Gets the value of the transferAtom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferAtom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferAtom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferAtomType }
     * 
     * 
     */
    public List<TransferAtomType> getTransferAtom() {
        if (transferAtom == null) {
            transferAtom = new ArrayList<TransferAtomType>();
        }
        return this.transferAtom;
    }

    /**
     * Gets the value of the contentPartAtom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentPartAtom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentPartAtom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentPartAtomType }
     * 
     * 
     */
    public List<ContentPartAtomType> getContentPartAtom() {
        if (contentPartAtom == null) {
            contentPartAtom = new ArrayList<ContentPartAtomType>();
        }
        return this.contentPartAtom;
    }

    /**
     * Gets the value of the simpleEDLAtom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simpleEDLAtom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimpleEDLAtom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleEDLAtomType }
     * 
     * 
     */
    public List<SimpleEDLAtomType> getSimpleEDLAtom() {
        if (simpleEDLAtom == null) {
            simpleEDLAtom = new ArrayList<SimpleEDLAtomType>();
        }
        return this.simpleEDLAtom;
    }

    /**
     * Gets the value of the wholeContentAtom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wholeContentAtom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWholeContentAtom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WholeContentAtomType }
     * 
     * 
     */
    public List<WholeContentAtomType> getWholeContentAtom() {
        if (wholeContentAtom == null) {
            wholeContentAtom = new ArrayList<WholeContentAtomType>();
        }
        return this.wholeContentAtom;
    }

    /**
     * Gets the value of the outputFileNamePattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputFileNamePattern() {
        return outputFileNamePattern;
    }

    /**
     * Sets the value of the outputFileNamePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputFileNamePattern(String value) {
        this.outputFileNamePattern = value;
    }

}
