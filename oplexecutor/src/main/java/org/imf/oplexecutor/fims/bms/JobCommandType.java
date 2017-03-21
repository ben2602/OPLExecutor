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
 * <p>Java class for JobCommandType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JobCommandType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cancel"/>
 *     &lt;enumeration value="pause"/>
 *     &lt;enumeration value="resume"/>
 *     &lt;enumeration value="restart"/>
 *     &lt;enumeration value="stop"/>
 *     &lt;enumeration value="cleanup"/>
 *     &lt;enumeration value="modifyPriority"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JobCommandType")
@XmlEnum
public enum JobCommandType {


    /**
     * Cancel the job.
     * 
     */
    @XmlEnumValue("cancel")
    CANCEL("cancel"),

    /**
     * 
     *             Pause the job. It can be restarted with resume.
     *           
     * 
     */
    @XmlEnumValue("pause")
    PAUSE("pause"),

    /**
     * Resume the job from its paused state.
     * 
     */
    @XmlEnumValue("resume")
    RESUME("resume"),

    /**
     * Restart the job from the beginning.
     * 
     */
    @XmlEnumValue("restart")
    RESTART("restart"),

    /**
     * Stop the job.
     * 
     */
    @XmlEnumValue("stop")
    STOP("stop"),

    /**
     * 
     *             Remove all the data associated with the job.
     *           
     * 
     */
    @XmlEnumValue("cleanup")
    CLEANUP("cleanup"),

    /**
     * Modify the priority of the job.
     * 
     */
    @XmlEnumValue("modifyPriority")
    MODIFY_PRIORITY("modifyPriority");
    private final String value;

    JobCommandType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobCommandType fromValue(String v) {
        for (JobCommandType c: JobCommandType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}