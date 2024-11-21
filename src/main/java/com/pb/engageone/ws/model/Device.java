
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Device complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Device">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/model}Entity">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://pb.com/EngageOne/ws/model}DeviceType"/>
 *         &lt;element name="preview" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HIPId" type="{http://pb.com/EngageOne/ws/model}ID"/>
 *         &lt;element name="metaId" type="{http://pb.com/EngageOne/ws/model}ID"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device", propOrder = {
    "name",
    "type",
    "preview",
    "hipId",
    "metaId"
})
public class Device
    extends Entity
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DeviceType type;
    protected boolean preview;
    @XmlElement(name = "HIPId")
    protected int hipId;
    protected int metaId;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceType }
     *     
     */
    public DeviceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceType }
     *     
     */
    public void setType(DeviceType value) {
        this.type = value;
    }

    /**
     * Gets the value of the preview property.
     * 
     */
    public boolean isPreview() {
        return preview;
    }

    /**
     * Sets the value of the preview property.
     * 
     */
    public void setPreview(boolean value) {
        this.preview = value;
    }

    /**
     * Gets the value of the hipId property.
     * 
     */
    public int getHIPId() {
        return hipId;
    }

    /**
     * Sets the value of the hipId property.
     * 
     */
    public void setHIPId(int value) {
        this.hipId = value;
    }

    /**
     * Gets the value of the metaId property.
     * 
     */
    public int getMetaId() {
        return metaId;
    }

    /**
     * Sets the value of the metaId property.
     * 
     */
    public void setMetaId(int value) {
        this.metaId = value;
    }

}
