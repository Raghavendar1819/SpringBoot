
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportJobInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportJobInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/model}PromotionJobInfo">
 *       &lt;sequence>
 *         &lt;element name="assetDescriptorPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportJobInfo", propOrder = {
    "assetDescriptorPath"
})
public class ExportJobInfo
    extends PromotionJobInfo
{

    protected String assetDescriptorPath;

    /**
     * Gets the value of the assetDescriptorPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetDescriptorPath() {
        return assetDescriptorPath;
    }

    /**
     * Sets the value of the assetDescriptorPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetDescriptorPath(String value) {
        this.assetDescriptorPath = value;
    }

}
