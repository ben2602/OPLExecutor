//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.mdcf.g;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.imf.oplexecutor.fims.mdcf.h.QueryExpression;


/**
 * <p>Java class for UMNFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UMNFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.smpte-ra.org/schemas/st2071/2015/identity}UMN"/>
 *         &lt;element ref="{http://www.smpte-ra.org/schemas/st2071/2015/query}QueryExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UMNFilter", propOrder = {
    "umn",
    "queryExpression"
})
public class UMNFilter {

    @XmlElement(name = "UMN", namespace = "http://www.smpte-ra.org/schemas/st2071/2015/identity", required = true)
    protected String umn;
    @XmlElement(name = "QueryExpression", namespace = "http://www.smpte-ra.org/schemas/st2071/2015/query")
    protected QueryExpression queryExpression;

    /**
     * Gets the value of the umn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUMN() {
        return umn;
    }

    /**
     * Sets the value of the umn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUMN(String value) {
        this.umn = value;
    }

    /**
     * Gets the value of the queryExpression property.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpression }
     *     
     */
    public QueryExpression getQueryExpression() {
        return queryExpression;
    }

    /**
     * Sets the value of the queryExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpression }
     *     
     */
    public void setQueryExpression(QueryExpression value) {
        this.queryExpression = value;
    }

}
