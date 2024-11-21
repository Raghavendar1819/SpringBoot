
package com.pb.engageone.ws.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.pb.engageone.ws.common.IntegerIdOrName;
import com.pb.engageone.ws.common.RequestMessage;


/**
 * <p>Java class for DeliveryItemMaintRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryItemMaintRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/common}RequestMessage">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="workItem">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="ident" type="{http://pb.com/EngageOne/ws/common}IntegerIdOrName"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="deliveryItem">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="id" type="{http://pb.com/EngageOne/ws/model}ID"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryItemMaintRequest", propOrder = {
    "workItem",
    "deliveryItem",
    "comment"
})
@XmlSeeAlso({
    DeleteDeliveryItem.class,
    ResumeDeliveryItem.class,
    UpdateDeliveryItem.class,
    SuspendDeliveryItem.class
})
public abstract class DeliveryItemMaintRequest
    extends RequestMessage
{

    protected DeliveryItemMaintRequest.WorkItem workItem;
    protected DeliveryItemMaintRequest.DeliveryItem deliveryItem;
    protected String comment;

    /**
     * Gets the value of the workItem property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryItemMaintRequest.WorkItem }
     *     
     */
    public DeliveryItemMaintRequest.WorkItem getWorkItem() {
        return workItem;
    }

    /**
     * Sets the value of the workItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryItemMaintRequest.WorkItem }
     *     
     */
    public void setWorkItem(DeliveryItemMaintRequest.WorkItem value) {
        this.workItem = value;
    }

    /**
     * Gets the value of the deliveryItem property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryItemMaintRequest.DeliveryItem }
     *     
     */
    public DeliveryItemMaintRequest.DeliveryItem getDeliveryItem() {
        return deliveryItem;
    }

    /**
     * Sets the value of the deliveryItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryItemMaintRequest.DeliveryItem }
     *     
     */
    public void setDeliveryItem(DeliveryItemMaintRequest.DeliveryItem value) {
        this.deliveryItem = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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
     *         &lt;element name="id" type="{http://pb.com/EngageOne/ws/model}ID"/>
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
        "id"
    })
    public static class DeliveryItem {

        protected int id;

        /**
         * Gets the value of the id property.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

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
     *         &lt;element name="ident" type="{http://pb.com/EngageOne/ws/common}IntegerIdOrName"/>
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
        "ident"
    })
    public static class WorkItem {

        @XmlElement(required = true)
        protected IntegerIdOrName ident;

        /**
         * Gets the value of the ident property.
         * 
         * @return
         *     possible object is
         *     {@link IntegerIdOrName }
         *     
         */
        public IntegerIdOrName getIdent() {
            return ident;
        }

        /**
         * Sets the value of the ident property.
         * 
         * @param value
         *     allowed object is
         *     {@link IntegerIdOrName }
         *     
         */
        public void setIdent(IntegerIdOrName value) {
            this.ident = value;
        }

    }

}
