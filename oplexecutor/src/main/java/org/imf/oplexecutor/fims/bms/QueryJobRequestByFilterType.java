//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.bms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryJobRequestByFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryJobRequestByFilterType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://base.fims.tv}QueryJobRequestType">
 *       &lt;sequence>
 *         &lt;element name="listFilter" type="{http://base.fims.tv}ListFilterType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryJobRequestByFilterType", propOrder = {
    "listFilter"
})
public class QueryJobRequestByFilterType
    extends QueryJobRequestType
{

    @XmlElement(required = true)
    protected ListFilterType listFilter;

    /**
     * Gets the value of the listFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ListFilterType }
     *     
     */
    public ListFilterType getListFilter() {
        return listFilter;
    }

    /**
     * Sets the value of the listFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListFilterType }
     *     
     */
    public void setListFilter(ListFilterType value) {
        this.listFilter = value;
    }

}