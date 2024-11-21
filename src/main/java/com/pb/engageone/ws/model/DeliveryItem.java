
package com.pb.engageone.ws.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/model}Entity">
 *       &lt;sequence>
 *         &lt;element name="deliveryChannel" type="{http://pb.com/EngageOne/ws/model}DeliveryChannel"/>
 *         &lt;element name="status" type="{http://pb.com/EngageOne/ws/model}DeliveryStatus"/>
 *         &lt;element name="document" type="{http://pb.com/EngageOne/ws/model}ComposedDocument" minOccurs="0"/>
 *         &lt;element name="reportFiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reportFile" type="{http://pb.com/EngageOne/ws/model}ReportFile" maxOccurs="unbounded"/>
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
@XmlType(name = "DeliveryItem", propOrder = {
    "deliveryChannel",
    "status",
    "document",
    "reportFiles"
})
public class DeliveryItem
    extends Entity
{

    @XmlElement(required = true)
    protected DeliveryChannel deliveryChannel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryStatus status;
    protected ComposedDocument document;
    protected DeliveryItem.ReportFiles reportFiles;

    /**
     * Gets the value of the deliveryChannel property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryChannel }
     *     
     */
    public DeliveryChannel getDeliveryChannel() {
        return deliveryChannel;
    }

    /**
     * Sets the value of the deliveryChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryChannel }
     *     
     */
    public void setDeliveryChannel(DeliveryChannel value) {
        this.deliveryChannel = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryStatus }
     *     
     */
    public DeliveryStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryStatus }
     *     
     */
    public void setStatus(DeliveryStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link ComposedDocument }
     *     
     */
    public ComposedDocument getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComposedDocument }
     *     
     */
    public void setDocument(ComposedDocument value) {
        this.document = value;
    }

    /**
     * Gets the value of the reportFiles property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryItem.ReportFiles }
     *     
     */
    public DeliveryItem.ReportFiles getReportFiles() {
        return reportFiles;
    }

    /**
     * Sets the value of the reportFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryItem.ReportFiles }
     *     
     */
    public void setReportFiles(DeliveryItem.ReportFiles value) {
        this.reportFiles = value;
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
     *         &lt;element name="reportFile" type="{http://pb.com/EngageOne/ws/model}ReportFile" maxOccurs="unbounded"/>
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
        "reportFile"
    })
    public static class ReportFiles {

        @XmlElement(required = true)
        protected List<ReportFile> reportFile;

        /**
         * Gets the value of the reportFile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportFile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportFile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReportFile }
         * 
         * 
         */
        public List<ReportFile> getReportFile() {
            if (reportFile == null) {
                reportFile = new ArrayList<ReportFile>();
            }
            return this.reportFile;
        }

    }

}
