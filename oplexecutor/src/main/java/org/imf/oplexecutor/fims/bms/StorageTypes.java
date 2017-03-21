//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.13 at 10:49:01 AM CET 
//


package org.imf.oplexecutor.fims.bms;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StorageTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="online"/>
 *     &lt;enumeration value="offline"/>
 *     &lt;enumeration value="hsm"/>
 *     &lt;enumeration value="archive"/>
 *     &lt;enumeration value="playout"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StorageTypes")
@XmlEnum
public enum StorageTypes {

    @XmlEnumValue("online")
    ONLINE("online"),
    @XmlEnumValue("offline")
    OFFLINE("offline"),
    @XmlEnumValue("hsm")
    HSM("hsm"),
    @XmlEnumValue("archive")
    ARCHIVE("archive"),
    @XmlEnumValue("playout")
    PLAYOUT("playout"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    StorageTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StorageTypes fromValue(String v) {
        for (StorageTypes c: StorageTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}