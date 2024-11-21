
package com.pb.engageone.ws.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/model}Entity">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parent" type="{http://pb.com/EngageOne/ws/model}Folder" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docClasses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="docClass" type="{http://pb.com/EngageOne/ws/model}DocumentClass" maxOccurs="unbounded"/>
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
@XmlType(name = "FileItem", propOrder = {
    "name",
    "parent",
    "description",
    "docClasses"
})
@XmlSeeAlso({
    Template.class,
    MessageContent.class,
    Folder.class,
    ActiveContent.class
})
public abstract class FileItem
    extends Entity
{

    @XmlElement(required = true)
    protected String name;
    protected Folder parent;
    protected String description;
    protected FileItem.DocClasses docClasses;

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
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Folder }
     *     
     */
    public Folder getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Folder }
     *     
     */
    public void setParent(Folder value) {
        this.parent = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the docClasses property.
     * 
     * @return
     *     possible object is
     *     {@link FileItem.DocClasses }
     *     
     */
    public FileItem.DocClasses getDocClasses() {
        return docClasses;
    }

    /**
     * Sets the value of the docClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileItem.DocClasses }
     *     
     */
    public void setDocClasses(FileItem.DocClasses value) {
        this.docClasses = value;
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
     *         &lt;element name="docClass" type="{http://pb.com/EngageOne/ws/model}DocumentClass" maxOccurs="unbounded"/>
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
        "docClass"
    })
    public static class DocClasses {

        @XmlElement(required = true)
        protected List<DocumentClass> docClass;

        /**
         * Gets the value of the docClass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docClass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocClass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentClass }
         * 
         * 
         */
        public List<DocumentClass> getDocClass() {
            if (docClass == null) {
                docClass = new ArrayList<DocumentClass>();
            }
            return this.docClass;
        }

    }

}
