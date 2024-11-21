
package com.pb.engageone.ws.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.pb.engageone.ws.common.IntegerIdOrName;
import com.pb.engageone.ws.common.RequestMessage;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/common}RequestMessage">
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
 *     &lt;/extension>
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
@XmlRootElement(name = "PreviewWorkItem")
public class PreviewWorkItem
    extends RequestMessage
{

    @XmlElement(required = true)
    protected PreviewWorkItem.WorkItem workItem;

    /**
     * Gets the value of the workItem property.
     * 
     * @return
     *     possible object is
     *     {@link PreviewWorkItem.WorkItem }
     *     
     */
    public PreviewWorkItem.WorkItem getWorkItem() {
        return workItem;
    }

    /**
     * Sets the value of the workItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviewWorkItem.WorkItem }
     *     
     */
    public void setWorkItem(PreviewWorkItem.WorkItem value) {
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
