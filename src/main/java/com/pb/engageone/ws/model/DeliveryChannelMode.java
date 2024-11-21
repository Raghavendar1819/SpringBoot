
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryChannelMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryChannelMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BATCH"/>
 *     &lt;enumeration value="IMMEDIATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryChannelMode")
@XmlEnum
public enum DeliveryChannelMode {

    BATCH,
    IMMEDIATE;

    public String value() {
        return name();
    }

    public static DeliveryChannelMode fromValue(String v) {
        return valueOf(v);
    }

}
