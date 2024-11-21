
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Community Administrator"/>
 *     &lt;enumeration value="Delivery Manager"/>
 *     &lt;enumeration value="Document Manager"/>
 *     &lt;enumeration value="Editor"/>
 *     &lt;enumeration value="Editor with Saving New Templates"/>
 *     &lt;enumeration value="External File Manager"/>
 *     &lt;enumeration value="Project Manager"/>
 *     &lt;enumeration value="Reviewer"/>
 *     &lt;enumeration value="Template Manager"/>
 *     &lt;enumeration value="Viewer"/>
 *     &lt;enumeration value="Viewer with Reprint"/>
 *     &lt;enumeration value="Workflow Administrator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleName")
@XmlEnum
public enum RoleName {

    @XmlEnumValue("Community Administrator")
    COMMUNITY_ADMINISTRATOR("Community Administrator"),
    @XmlEnumValue("Delivery Manager")
    DELIVERY_MANAGER("Delivery Manager"),
    @XmlEnumValue("Document Manager")
    DOCUMENT_MANAGER("Document Manager"),
    @XmlEnumValue("Editor")
    EDITOR("Editor"),
    @XmlEnumValue("Editor with Saving New Templates")
    EDITOR_WITH_SAVING_NEW_TEMPLATES("Editor with Saving New Templates"),
    @XmlEnumValue("External File Manager")
    EXTERNAL_FILE_MANAGER("External File Manager"),
    @XmlEnumValue("Project Manager")
    PROJECT_MANAGER("Project Manager"),
    @XmlEnumValue("Reviewer")
    REVIEWER("Reviewer"),
    @XmlEnumValue("Template Manager")
    TEMPLATE_MANAGER("Template Manager"),
    @XmlEnumValue("Viewer")
    VIEWER("Viewer"),
    @XmlEnumValue("Viewer with Reprint")
    VIEWER_WITH_REPRINT("Viewer with Reprint"),
    @XmlEnumValue("Workflow Administrator")
    WORKFLOW_ADMINISTRATOR("Workflow Administrator");
    private final String value;

    RoleName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleName fromValue(String v) {
        for (RoleName c: RoleName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
