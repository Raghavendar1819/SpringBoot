
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryChannel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryChannel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/model}Entity">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mode" type="{http://pb.com/EngageOne/ws/model}DeliveryChannelMode"/>
 *         &lt;element name="type" type="{http://pb.com/EngageOne/ws/model}DeliveryChannelType"/>
 *         &lt;element name="device" type="{http://pb.com/EngageOne/ws/model}Device"/>
 *         &lt;element name="recipient" type="{http://pb.com/EngageOne/ws/model}Recipient" minOccurs="0"/>
 *         &lt;element name="detail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="emailDetail" type="{http://pb.com/EngageOne/ws/model}EmailChannelDetail"/>
 *                   &lt;element name="faxDetail" type="{http://pb.com/EngageOne/ws/model}FaxChannelDetail"/>
 *                 &lt;/choice>
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
@XmlType(name = "DeliveryChannel", propOrder = {
    "name",
    "mode",
    "type",
    "device",
    "recipient",
    "detail"
})
public class DeliveryChannel
    extends Entity
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryChannelMode mode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryChannelType type;
    @XmlElement(required = true)
    protected Device device;
    protected Recipient recipient;
    protected DeliveryChannel.Detail detail;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryChannelMode }
     *     
     */
    public DeliveryChannelMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryChannelMode }
     *     
     */
    public void setMode(DeliveryChannelMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryChannelType }
     *     
     */
    public DeliveryChannelType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryChannelType }
     *     
     */
    public void setType(DeliveryChannelType value) {
        this.type = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link Device }
     *     
     */
    public Device getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link Device }
     *     
     */
    public void setDevice(Device value) {
        this.device = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link Recipient }
     *     
     */
    public Recipient getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipient }
     *     
     */
    public void setRecipient(Recipient value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryChannel.Detail }
     *     
     */
    public DeliveryChannel.Detail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryChannel.Detail }
     *     
     */
    public void setDetail(DeliveryChannel.Detail value) {
        this.detail = value;
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
     *       &lt;choice>
     *         &lt;element name="emailDetail" type="{http://pb.com/EngageOne/ws/model}EmailChannelDetail"/>
     *         &lt;element name="faxDetail" type="{http://pb.com/EngageOne/ws/model}FaxChannelDetail"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "emailDetail",
        "faxDetail"
    })
    public static class Detail {

        protected EmailChannelDetail emailDetail;
        protected FaxChannelDetail faxDetail;

        /**
         * Gets the value of the emailDetail property.
         * 
         * @return
         *     possible object is
         *     {@link EmailChannelDetail }
         *     
         */
        public EmailChannelDetail getEmailDetail() {
            return emailDetail;
        }

        /**
         * Sets the value of the emailDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmailChannelDetail }
         *     
         */
        public void setEmailDetail(EmailChannelDetail value) {
            this.emailDetail = value;
        }

        /**
         * Gets the value of the faxDetail property.
         * 
         * @return
         *     possible object is
         *     {@link FaxChannelDetail }
         *     
         */
        public FaxChannelDetail getFaxDetail() {
            return faxDetail;
        }

        /**
         * Sets the value of the faxDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link FaxChannelDetail }
         *     
         */
        public void setFaxDetail(FaxChannelDetail value) {
            this.faxDetail = value;
        }

    }

}
