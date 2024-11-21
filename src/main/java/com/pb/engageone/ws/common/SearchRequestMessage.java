
package com.pb.engageone.ws.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.pb.engageone.ws.delivery.SearchDeliveryItems;


/**
 * <p>Java class for SearchRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRequestMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/common}RequestMessage">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://pb.com/EngageOne/ws/common}SearchFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRequestMessage", propOrder = {
    "filter"
})
@XmlSeeAlso({
    SearchDeliveryItems.class
})
public abstract class SearchRequestMessage
    extends RequestMessage
{

    @XmlElement(defaultValue = "LIST")
    @XmlSchemaType(name = "string")
    protected SearchFilter filter;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link SearchFilter }
     *     
     */
    public SearchFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFilter }
     *     
     */
    public void setFilter(SearchFilter value) {
        this.filter = value;
    }

}
