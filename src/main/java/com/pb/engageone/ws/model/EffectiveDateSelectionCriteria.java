
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EffectiveDateSelectionCriteria.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EffectiveDateSelectionCriteria">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CURRENT_DATE"/>
 *     &lt;enumeration value="USER_SELECTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EffectiveDateSelectionCriteria")
@XmlEnum
public enum EffectiveDateSelectionCriteria {

    CURRENT_DATE,
    USER_SELECTION;

    public String value() {
        return name();
    }

    public static EffectiveDateSelectionCriteria fromValue(String v) {
        return valueOf(v);
    }

}
