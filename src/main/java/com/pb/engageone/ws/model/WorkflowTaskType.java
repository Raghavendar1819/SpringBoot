
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowTaskType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowTaskType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="documentReview"/>
 *     &lt;enumeration value="designReview"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowTaskType")
@XmlEnum
public enum WorkflowTaskType {

    @XmlEnumValue("documentReview")
    DOCUMENT_REVIEW("documentReview"),
    @XmlEnumValue("designReview")
    DESIGN_REVIEW("designReview");
    private final String value;

    WorkflowTaskType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkflowTaskType fromValue(String v) {
        for (WorkflowTaskType c: WorkflowTaskType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
