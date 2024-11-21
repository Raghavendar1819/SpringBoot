
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateFileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TemplateFileType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANSWER"/>
 *     &lt;enumeration value="DATAMODEL"/>
 *     &lt;enumeration value="HIP"/>
 *     &lt;enumeration value="IMAGE"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="PREVIEW"/>
 *     &lt;enumeration value="PROMPTLOGIC"/>
 *     &lt;enumeration value="PROPERTY"/>
 *     &lt;enumeration value="PUBX"/>
 *     &lt;enumeration value="SCHEMA"/>
 *     &lt;enumeration value="THUMBNAIL"/>
 *     &lt;enumeration value="XFORM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TemplateFileType")
@XmlEnum
public enum TemplateFileType {

    ANSWER,
    DATAMODEL,
    HIP,
    IMAGE,
    OTHER,
    PREVIEW,
    PROMPTLOGIC,
    PROPERTY,
    PUBX,
    SCHEMA,
    THUMBNAIL,
    XFORM;

    public String value() {
        return name();
    }

    public static TemplateFileType fromValue(String v) {
        return valueOf(v);
    }

}
