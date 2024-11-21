
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowTaskAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowTaskAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPROVE"/>
 *     &lt;enumeration value="REJECT"/>
 *     &lt;enumeration value="CLAIM"/>
 *     &lt;enumeration value="DELEGATE"/>
 *     &lt;enumeration value="RELEASE"/>
 *     &lt;enumeration value="RESUBMIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowTaskAction")
@XmlEnum
public enum WorkflowTaskAction {

    APPROVE,
    REJECT,
    CLAIM,
    DELEGATE,
    RELEASE,
    RESUBMIT;

    public String value() {
        return name();
    }

    public static WorkflowTaskAction fromValue(String v) {
        return valueOf(v);
    }

}
