
package com.pb.engageone.ws.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.pb.engageone.ws.common.IntegerIdOrName;
import com.pb.engageone.ws.common.SearchRequestMessage;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/common}SearchRequestMessage">
 *       &lt;sequence>
 *         &lt;element name="workItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="workItem">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ident" type="{http://pb.com/EngageOne/ws/common}IntegerIdOrName"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="deliveryItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="deliveryItem">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" type="{http://pb.com/EngageOne/ws/model}ID"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "workItems",
    "deliveryItems"
})
@XmlRootElement(name = "SearchDeliveryItems")
public class SearchDeliveryItems
    extends SearchRequestMessage
{

    protected SearchDeliveryItems.WorkItems workItems;
    protected SearchDeliveryItems.DeliveryItems deliveryItems;

    /**
     * Gets the value of the workItems property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDeliveryItems.WorkItems }
     *     
     */
    public SearchDeliveryItems.WorkItems getWorkItems() {
        return workItems;
    }

    /**
     * Sets the value of the workItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDeliveryItems.WorkItems }
     *     
     */
    public void setWorkItems(SearchDeliveryItems.WorkItems value) {
        this.workItems = value;
    }

    /**
     * Gets the value of the deliveryItems property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDeliveryItems.DeliveryItems }
     *     
     */
    public SearchDeliveryItems.DeliveryItems getDeliveryItems() {
        return deliveryItems;
    }

    /**
     * Sets the value of the deliveryItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDeliveryItems.DeliveryItems }
     *     
     */
    public void setDeliveryItems(SearchDeliveryItems.DeliveryItems value) {
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
     *         &lt;element name="deliveryItem">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id" type="{http://pb.com/EngageOne/ws/model}ID"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        protected SearchDeliveryItems.DeliveryItems.DeliveryItem deliveryItem;

        /**
         * Gets the value of the deliveryItem property.
         * 
         * @return
         *     possible object is
         *     {@link SearchDeliveryItems.DeliveryItems.DeliveryItem }
         *     
         */
        public SearchDeliveryItems.DeliveryItems.DeliveryItem getDeliveryItem() {
            return deliveryItem;
        }

        /**
         * Sets the value of the deliveryItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchDeliveryItems.DeliveryItems.DeliveryItem }
         *     
         */
        public void setDeliveryItem(SearchDeliveryItems.DeliveryItems.DeliveryItem value) {
            this.deliveryItem = value;
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
     *         &lt;element name="workItem">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ident" type="{http://pb.com/EngageOne/ws/common}IntegerIdOrName"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "workItem"
    })
    public static class WorkItems {

        @XmlElement(required = true)
        protected SearchDeliveryItems.WorkItems.WorkItem workItem;

        /**
         * Gets the value of the workItem property.
         * 
         * @return
         *     possible object is
         *     {@link SearchDeliveryItems.WorkItems.WorkItem }
         *     
         */
        public SearchDeliveryItems.WorkItems.WorkItem getWorkItem() {
            return workItem;
        }

        /**
         * Sets the value of the workItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchDeliveryItems.WorkItems.WorkItem }
         *     
         */
        public void setWorkItem(SearchDeliveryItems.WorkItems.WorkItem value) {
            this.workItem = value;
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

}
