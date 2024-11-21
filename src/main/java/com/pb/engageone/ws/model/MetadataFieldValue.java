
package com.pb.engageone.ws.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MetadataFieldValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataFieldValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="MetadataString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MetadataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="MetadataNumber" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MetadataChoice">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataFieldValue", propOrder = {
    "metadataString",
    "metadataDate",
    "metadataNumber",
    "metadataChoice"
})
public class MetadataFieldValue {

    @XmlElement(name = "MetadataString")
    protected String metadataString;
    @XmlElement(name = "MetadataDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar metadataDate;
    @XmlElement(name = "MetadataNumber")
    protected BigDecimal metadataNumber;
    @XmlElement(name = "MetadataChoice")
    protected MetadataFieldValue.MetadataChoice metadataChoice;

    /**
     * Gets the value of the metadataString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataString() {
        return metadataString;
    }

    /**
     * Sets the value of the metadataString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataString(String value) {
        this.metadataString = value;
    }

    /**
     * Gets the value of the metadataDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMetadataDate() {
        return metadataDate;
    }

    /**
     * Sets the value of the metadataDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMetadataDate(XMLGregorianCalendar value) {
        this.metadataDate = value;
    }

    /**
     * Gets the value of the metadataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMetadataNumber() {
        return metadataNumber;
    }

    /**
     * Sets the value of the metadataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMetadataNumber(BigDecimal value) {
        this.metadataNumber = value;
    }

    /**
     * Gets the value of the metadataChoice property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataFieldValue.MetadataChoice }
     *     
     */
    public MetadataFieldValue.MetadataChoice getMetadataChoice() {
        return metadataChoice;
    }

    /**
     * Sets the value of the metadataChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataFieldValue.MetadataChoice }
     *     
     */
    public void setMetadataChoice(MetadataFieldValue.MetadataChoice value) {
        this.metadataChoice = value;
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
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "value"
    })
    public static class MetadataChoice {

        @XmlElement(required = true)
        protected List<String> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getValue() {
            if (value == null) {
                value = new ArrayList<String>();
            }
            return this.value;
        }

    }

}
