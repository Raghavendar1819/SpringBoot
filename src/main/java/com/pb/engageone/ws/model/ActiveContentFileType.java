
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActiveContentFileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActiveContentFileType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WMR"/>
 *     &lt;enumeration value="HIP"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActiveContentFileType")
@XmlEnum
public enum ActiveContentFileType {

    WMR,
    HIP,
    OTHER;

    public String value() {
        return name();
    }

    public static ActiveContentFileType fromValue(String v) {
        return valueOf(v);
    }

}
