
package com.pb.engageone.ws.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LIST"/>
 *     &lt;enumeration value="DETAIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchFilter")
@XmlEnum
public enum SearchFilter {

    LIST,
    DETAIL;

    public String value() {
        return name();
    }

    public static SearchFilter fromValue(String v) {
        return valueOf(v);
    }

}
