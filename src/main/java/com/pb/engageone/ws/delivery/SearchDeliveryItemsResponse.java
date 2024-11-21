
package com.pb.engageone.ws.delivery;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.pb.engageone.ws.common.ResponseMessage;
import com.pb.engageone.ws.model.DeliveryItem;


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
 *         &lt;element name="deliveryItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="deliveryItem" type="{http://pb.com/EngageOne/ws/model}DeliveryItem" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "deliveryItems"
})
@XmlRootElement(name = "SearchDeliveryItemsResponse")
public class SearchDeliveryItemsResponse
    extends ResponseMessage
{

    protected SearchDeliveryItemsResponse.DeliveryItems deliveryItems;

    /**
     * Gets the value of the deliveryItems property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDeliveryItemsResponse.DeliveryItems }
     *     
     */
    public SearchDeliveryItemsResponse.DeliveryItems getDeliveryItems() {
        return deliveryItems;
    }

    /**
     * Sets the value of the deliveryItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDeliveryItemsResponse.DeliveryItems }
     *     
     */
    public void setDeliveryItems(SearchDeliveryItemsResponse.DeliveryItems value) {
        this.deliveryItems = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="deliveryItem" type="{http://pb.com/EngageOne/ws/model}DeliveryItem" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "deliveryItem"
    })
    public static class DeliveryItems {

        @XmlElement(required = true)
        protected List<DeliveryItem> deliveryItem;

        /**
         * Gets the value of the deliveryItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deliveryItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeliveryItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DeliveryItem }
         * 
         * 
         */
        public List<DeliveryItem> getDeliveryItem() {
            if (deliveryItem == null) {
                deliveryItem = new ArrayList<DeliveryItem>();
            }
            return this.deliveryItem;
        }

    }

}
