
package com.pb.engageone.ws.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.pb.engageone.ws.common.ResponseMessage;
import com.pb.engageone.ws.model.DeliveryRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/common}ResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="deliveryRequest" type="{http://pb.com/EngageOne/ws/model}DeliveryRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "deliveryRequest"
})
@XmlRootElement(name = "DeliverDocumentResponse")
public class DeliverDocumentResponse
    extends ResponseMessage
{

    @XmlElement(required = true)
    protected DeliveryRequest deliveryRequest;

    /**
     * Gets the value of the deliveryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryRequest }
     *     
     */
    public DeliveryRequest getDeliveryRequest() {
        return deliveryRequest;
    }

    /**
     * Sets the value of the deliveryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryRequest }
     *     
     */
    public void setDeliveryRequest(DeliveryRequest value) {
        this.deliveryRequest = value;
    }

}
