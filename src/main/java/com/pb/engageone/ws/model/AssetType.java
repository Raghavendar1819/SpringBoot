
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FOLDER"/>
 *     &lt;enumeration value="TEMPLATE"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="DOCUMENT_CLASS"/>
 *     &lt;enumeration value="DELIVERY_OPTION"/>
 *     &lt;enumeration value="DEVICE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetType")
@XmlEnum
public enum AssetType {

    FOLDER,
    TEMPLATE,
    AC,
    DOCUMENT_CLASS,
    DELIVERY_OPTION,
    DEVICE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AssetType fromValue(String v) {
        return valueOf(v);
    }

}
