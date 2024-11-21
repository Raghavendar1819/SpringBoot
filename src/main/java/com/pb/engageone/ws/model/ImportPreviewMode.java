
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportPreviewMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportPreviewMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROMOTION"/>
 *     &lt;enumeration value="ZIPS"/>
 *     &lt;enumeration value="PARSED_ZIPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImportPreviewMode")
@XmlEnum
public enum ImportPreviewMode {

    PROMOTION,
    ZIPS,
    PARSED_ZIPS;

    public String value() {
        return name();
    }

    public static ImportPreviewMode fromValue(String v) {
        return valueOf(v);
    }

}
