
package com.pb.engageone.ws.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.pb.engageone.ws.delivery.DeliverDocument;
import com.pb.engageone.ws.delivery.DeliveryItemMaintRequest;
import com.pb.engageone.ws.delivery.PreviewDocument;
import com.pb.engageone.ws.delivery.PreviewTemplate;
import com.pb.engageone.ws.delivery.PreviewWorkItem;


/**
 * <p>Java class for RequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authContext" type="{http://pb.com/EngageOne/ws/common}AuthContext" minOccurs="0"/>
 *         &lt;element name="context" type="{http://pb.com/EngageOne/ws/common}RequestContext" minOccurs="0"/>
 *         &lt;element name="community" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessage", propOrder = {
    "authContext",
    "context",
    "community"
})
@XmlSeeAlso({
    PreviewTemplate.class,
    PreviewDocument.class,
    SearchRequestMessage.class,
    PreviewWorkItem.class,
    DeliverDocument.class,
    DeliveryItemMaintRequest.class
})
public abstract class RequestMessage {

    protected AuthContext authContext;
    protected RequestContext context;
    protected String community;

    /**
     * Gets the value of the authContext property.
     * 
     * @return
     *     possible object is
     *     {@link AuthContext }
     *     
     */
    public AuthContext getAuthContext() {
        return authContext;
    }

    /**
     * Sets the value of the authContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthContext }
     *     
     */
    public void setAuthContext(AuthContext value) {
        this.authContext = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link RequestContext }
     *     
     */
    public RequestContext getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestContext }
     *     
     */
    public void setContext(RequestContext value) {
        this.context = value;
    }

    /**
     * Gets the value of the community property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunity() {
        return community;
    }

    /**
     * Sets the value of the community property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunity(String value) {
        this.community = value;
    }

}
