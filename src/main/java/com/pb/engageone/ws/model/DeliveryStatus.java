
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="PROCESSING"/>
 *     &lt;enumeration value="COMPOSED"/>
 *     &lt;enumeration value="DELIVERED"/>
 *     &lt;enumeration value="HOLD"/>
 *     &lt;enumeration value="CANCELED"/>
 *     &lt;enumeration value="RESUMED"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="VARIOUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryStatus")
@XmlEnum
public enum DeliveryStatus {

    NEW,
    PROCESSING,
    COMPOSED,
    DELIVERED,
    HOLD,
    CANCELED,
    RESUMED,
    ERROR,
    VARIOUS;

    public String value() {
        return name();
    }

    public static DeliveryStatus fromValue(String v) {
        return valueOf(v);
    }

}
