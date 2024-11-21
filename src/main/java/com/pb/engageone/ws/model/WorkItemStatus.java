
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkItemStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkItemStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="ACTIVE_NEW"/>
 *     &lt;enumeration value="ACTIVE_COMPLETE"/>
 *     &lt;enumeration value="ACTIVE_INCOMPLETE"/>
 *     &lt;enumeration value="ASSIGNED"/>
 *     &lt;enumeration value="FAILED_DELIVERY"/>
 *     &lt;enumeration value="FINISHED"/>
 *     &lt;enumeration value="OPEN"/>
 *     &lt;enumeration value="PENDING_APPROVAL"/>
 *     &lt;enumeration value="PENDING_DELIVERY"/>
 *     &lt;enumeration value="SUBMITTED_APPROVED"/>
 *     &lt;enumeration value="SUBMITTED_REJECTED"/>
 *     &lt;enumeration value="SUBMITTED_REVIEW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkItemStatus")
@XmlEnum
public enum WorkItemStatus {

    NEW,
    ACTIVE_NEW,
    ACTIVE_COMPLETE,
    ACTIVE_INCOMPLETE,
    ASSIGNED,
    FAILED_DELIVERY,
    FINISHED,
    OPEN,
    PENDING_APPROVAL,
    PENDING_DELIVERY,
    SUBMITTED_APPROVED,
    SUBMITTED_REJECTED,
    SUBMITTED_REVIEW;

    public String value() {
        return name();
    }

    public static WorkItemStatus fromValue(String v) {
        return valueOf(v);
    }

}
