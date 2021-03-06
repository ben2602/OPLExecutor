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
 * <p>Java class for HashFunctionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HashFunctionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CRC32"/>
 *     &lt;enumeration value="CRC64"/>
 *     &lt;enumeration value="MD5"/>
 *     &lt;enumeration value="SHA1"/>
 *     &lt;enumeration value="SHA256"/>
 *     &lt;enumeration value="SHA384"/>
 *     &lt;enumeration value="SHA512"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HashFunctionTypes")
@XmlEnum
public enum HashFunctionTypes {


    /**
     * 
     *             32-bit Cyclic Redundancy Check, as defined in ISO 3309.
     *           
     * 
     */
    @XmlEnumValue("CRC32")
    CRC_32("CRC32"),

    /**
     * 
     *             64-bit Cyclic Redundancy Check, as defined in ISO 3309.
     *           
     * 
     */
    @XmlEnumValue("CRC64")
    CRC_64("CRC64"),

    /**
     * 
     *             128-bit Message Digest Algorithm 5, as defined in RFC 1321.
     *           
     * 
     */
    @XmlEnumValue("MD5")
    MD_5("MD5"),

    /**
     * 
     *             160-bit Secure Hash Algorithm, as defined in FIPS 180-2.
     *           
     * 
     */
    @XmlEnumValue("SHA1")
    SHA_1("SHA1"),

    /**
     * 
     *             256-bit Secure Hash Algorithm, as defined in FIPS 180-2.
     *           
     * 
     */
    @XmlEnumValue("SHA256")
    SHA_256("SHA256"),

    /**
     * 
     *             84-bit Secure Hash Algorithm, as defined in FIPS 180-2.
     *           
     * 
     */
    @XmlEnumValue("SHA384")
    SHA_384("SHA384"),

    /**
     * 
     *             512-bit Secure Hash Algorithm, as defined in FIPS 180-2.
     *           
     * 
     */
    @XmlEnumValue("SHA512")
    SHA_512("SHA512");
    private final String value;

    HashFunctionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HashFunctionTypes fromValue(String v) {
        for (HashFunctionTypes c: HashFunctionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
