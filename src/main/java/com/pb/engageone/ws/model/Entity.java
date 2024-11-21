
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entity">
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
@XmlType(name = "Entity", propOrder = {
    "id"
})
@XmlSeeAlso({
    DeliveryRequest.class,
    WorkItem.class,
    Attachment.class,
    MetadataField.class,
    ActiveContentFile.class,
    Device.class,
    Workflow.class,
    Recipient.class,
    MessageContentFile.class,
    DeliveryItem.class,
    TemplateFile.class,
    Role.class,
    DeliveryChannel.class,
    DeliveryOption.class,
    WorkItemFile.class,
    SpellerManifest.class,
    DocumentClass.class,
    EditorResource.class,
    FileItem.class,
    Keymap.class,
    KeyedImage.class
})
public abstract class Entity {

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
