
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetadataFieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetadataFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="NUMBER"/>
 *     &lt;enumeration value="CHOICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MetadataFieldType")
@XmlEnum
public enum MetadataFieldType {

    STRING,
    DATE,
    NUMBER,
    CHOICE;

    public String value() {
        return name();
    }

    public static MetadataFieldType fromValue(String v) {
        return valueOf(v);
    }

}
