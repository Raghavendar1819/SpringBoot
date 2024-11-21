
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportFileFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportFileFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="DELIMITER"/>
 *     &lt;enumeration value="FIXED_LENGTH"/>
 *     &lt;enumeration value="XML"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportFileFormat")
@XmlEnum
public enum ReportFileFormat {

    UNKNOWN,
    DELIMITER,
    FIXED_LENGTH,
    XML;

    public String value() {
        return name();
    }

    public static ReportFileFormat fromValue(String v) {
        return valueOf(v);
    }

}
