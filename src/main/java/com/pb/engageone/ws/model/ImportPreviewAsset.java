
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportPreviewAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportPreviewAsset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/model}ImportPreviewNode">
 *       &lt;sequence>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eoVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportPreviewAsset", propOrder = {
    "fileName",
    "eoVersion"
})
public class ImportPreviewAsset
    extends ImportPreviewNode
{

    @XmlElement(required = true)
    protected String fileName;
    @XmlElement(required = true)
    protected String eoVersion;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the eoVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEoVersion() {
        return eoVersion;
    }

    /**
     * Sets the value of the eoVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEoVersion(String value) {
        this.eoVersion = value;
    }

}
