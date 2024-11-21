
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="AFPDS"/>
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="PCL"/>
 *     &lt;enumeration value="Neutral"/>
 *     &lt;enumeration value="Linedata"/>
 *     &lt;enumeration value="IJPDS"/>
 *     &lt;enumeration value="RTF"/>
 *     &lt;enumeration value="eHTML"/>
 *     &lt;enumeration value="Responsive.HTML"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceType")
@XmlEnum
public enum DeviceType {

    PDF("PDF"),
    PS("PS"),
    AFPDS("AFPDS"),
    HTML("HTML"),
    PCL("PCL"),
    @XmlEnumValue("Neutral")
    NEUTRAL("Neutral"),
    @XmlEnumValue("Linedata")
    LINEDATA("Linedata"),
    IJPDS("IJPDS"),
    RTF("RTF"),
    @XmlEnumValue("eHTML")
    E_HTML("eHTML"),
    @XmlEnumValue("Responsive.HTML")
    RESPONSIVE_HTML("Responsive.HTML");
    private final String value;

    DeviceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceType fromValue(String v) {
        for (DeviceType c: DeviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
