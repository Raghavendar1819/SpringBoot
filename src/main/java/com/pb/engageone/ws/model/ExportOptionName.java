
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportOptionName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExportOptionName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="includeSubFolders"/>
 *     &lt;enumeration value="deliveryOptionImportStrategy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExportOptionName")
@XmlEnum
public enum ExportOptionName {

    @XmlEnumValue("includeSubFolders")
    INCLUDE_SUB_FOLDERS("includeSubFolders"),
    @XmlEnumValue("deliveryOptionImportStrategy")
    DELIVERY_OPTION_IMPORT_STRATEGY("deliveryOptionImportStrategy");
    private final String value;

    ExportOptionName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExportOptionName fromValue(String v) {
        for (ExportOptionName c: ExportOptionName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
