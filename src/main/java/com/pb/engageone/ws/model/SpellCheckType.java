
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpellCheckType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpellCheckType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INHERIT"/>
 *     &lt;enumeration value="USER_CANNOT_CLOSE"/>
 *     &lt;enumeration value="USER_CAN_CLOSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpellCheckType")
@XmlEnum
public enum SpellCheckType {

    INHERIT,
    USER_CANNOT_CLOSE,
    USER_CAN_CLOSE;

    public String value() {
        return name();
    }

    public static SpellCheckType fromValue(String v) {
        return valueOf(v);
    }

}
