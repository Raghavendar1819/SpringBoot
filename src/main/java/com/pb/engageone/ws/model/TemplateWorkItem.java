
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateWorkItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateWorkItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/model}WorkItem">
 *       &lt;sequence>
 *         &lt;element name="modelTemplateId" type="{http://pb.com/EngageOne/ws/model}ID"/>
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="folderId" type="{http://pb.com/EngageOne/ws/model}ID"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateWorkItem", propOrder = {
    "modelTemplateId",
    "templateName",
    "folderId"
})
public class TemplateWorkItem
    extends WorkItem
{

    protected int modelTemplateId;
    @XmlElement(required = true)
    protected String templateName;
    protected int folderId;

    /**
     * Gets the value of the modelTemplateId property.
     * 
     */
    public int getModelTemplateId() {
        return modelTemplateId;
    }

    /**
     * Sets the value of the modelTemplateId property.
     * 
     */
    public void setModelTemplateId(int value) {
        this.modelTemplateId = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the folderId property.
     * 
     */
    public int getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     */
    public void setFolderId(int value) {
        this.folderId = value;
    }

}
