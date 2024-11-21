
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryChannelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARCHIVE"/>
 *     &lt;enumeration value="PRINT"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="FAX"/>
 *     &lt;enumeration value="EMSG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryChannelType")
@XmlEnum
public enum DeliveryChannelType {

    ARCHIVE,
    PRINT,
    EMAIL,
    FAX,
    EMSG;

    public String value() {
        return name();
    }

    public static DeliveryChannelType fromValue(String v) {
        return valueOf(v);
    }

}
