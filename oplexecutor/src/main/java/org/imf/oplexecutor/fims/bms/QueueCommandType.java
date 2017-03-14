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
 * <p>Java class for QueueCommandType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueueCommandType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="clear"/>
 *     &lt;enumeration value="stop"/>
 *     &lt;enumeration value="start"/>
 *     &lt;enumeration value="lock"/>
 *     &lt;enumeration value="unlock"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueueCommandType")
@XmlEnum
public enum QueueCommandType {


    /**
     * Retrieve the current status of the queue.
     * 
     */
    @XmlEnumValue("status")
    STATUS("status"),

    /**
     * Delete all remaining jobs in the queue.
     * 
     */
    @XmlEnumValue("clear")
    CLEAR("clear"),

    /**
     * 
     *             Stop the queue. Jobs cannot then be en-queued or de-queued.
     *           
     * 
     */
    @XmlEnumValue("stop")
    STOP("stop"),

    /**
     * Restart a stopped queue.
     * 
     */
    @XmlEnumValue("start")
    START("start"),

    /**
     * 
     *             Lock the queue. Jobs cannot be en-queued but they are still being processed and can be deleted.
     *           
     * 
     */
    @XmlEnumValue("lock")
    LOCK("lock"),

    /**
     * Unlock a locked queue.
     * 
     */
    @XmlEnumValue("unlock")
    UNLOCK("unlock");
    private final String value;

    QueueCommandType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueueCommandType fromValue(String v) {
        for (QueueCommandType c: QueueCommandType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
