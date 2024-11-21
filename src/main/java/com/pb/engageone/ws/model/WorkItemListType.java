
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkItemListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkItemListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="SUBMITTED"/>
 *     &lt;enumeration value="ALL_ACTIVE"/>
 *     &lt;enumeration value="ALL_SUBMITTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkItemListType")
@XmlEnum
public enum WorkItemListType {

    ACTIVE,
    SUBMITTED,
    ALL_ACTIVE,
    ALL_SUBMITTED;

    public String value() {
        return name();
    }

    public static WorkItemListType fromValue(String v) {
        return valueOf(v);
    }

}
