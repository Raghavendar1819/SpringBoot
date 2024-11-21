
package com.pb.engageone.ws.delivery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.pb.engageone.ws.common.ResponseMessage;
import com.pb.engageone.ws.model.ComposedDocument;


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
 *         &lt;element name="document" type="{http://pb.com/EngageOne/ws/model}ComposedDocument"/>
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
    "document"
})
@XmlRootElement(name = "PreviewTemplateResponse")
public class PreviewTemplateResponse
    extends ResponseMessage
{

    @XmlElement(required = true)
    protected ComposedDocument document;

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

}
