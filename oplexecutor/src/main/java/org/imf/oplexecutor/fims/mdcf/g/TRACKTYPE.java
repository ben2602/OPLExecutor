//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.mdcf.g;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRACK_TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TRACK_TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUDIO"/>
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="TIMECODE"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="DATA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TRACK_TYPE")
@XmlEnum
public enum TRACKTYPE {

    AUDIO,
    VIDEO,
    TIMECODE,
    TEXT,
    DATA;

    public String value() {
        return name();
    }

    public static TRACKTYPE fromValue(String v) {
        return valueOf(v);
    }

}
