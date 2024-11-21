
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportAssetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportAssetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/model}AssetPromotionResult">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://pb.com/EngageOne/ws/model}ExportJobResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportAssetResult", propOrder = {
    "result"
})
public class ExportAssetResult
    extends AssetPromotionResult
{

    protected ExportJobResult result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ExportJobResult }
     *     
     */
    public ExportJobResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportJobResult }
     *     
     */
    public void setResult(ExportJobResult value) {
        this.result = value;
    }

}
