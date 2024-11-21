
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportAssetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportAssetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/model}AssetPromotionResult">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://pb.com/EngageOne/ws/model}ImportJobResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportAssetResult", propOrder = {
    "result"
})
public class ImportAssetResult
    extends AssetPromotionResult
{

    protected ImportJobResult result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ImportJobResult }
     *     
     */
    public ImportJobResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportJobResult }
     *     
     */
    public void setResult(ImportJobResult value) {
        this.result = value;
    }

}
