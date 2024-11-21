
package com.pb.engageone.ws.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Folder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Folder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/model}FileItem">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://pb.com/EngageOne/ws/model}FolderType"/>
 *         &lt;element name="children" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded">
 *                     &lt;element name="folder" type="{http://pb.com/EngageOne/ws/model}Folder"/>
 *                     &lt;element name="template" type="{http://pb.com/EngageOne/ws/model}Template"/>
 *                   &lt;/choice>
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
@XmlType(name = "Folder", propOrder = {
    "type",
    "children"
})
public class Folder
    extends FileItem
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FolderType type;
    protected Folder.Children children;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FolderType }
     *     
     */
    public FolderType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderType }
     *     
     */
    public void setType(FolderType value) {
        this.type = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link Folder.Children }
     *     
     */
    public Folder.Children getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link Folder.Children }
     *     
     */
    public void setChildren(Folder.Children value) {
        this.children = value;
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
     *         &lt;choice maxOccurs="unbounded">
     *           &lt;element name="folder" type="{http://pb.com/EngageOne/ws/model}Folder"/>
     *           &lt;element name="template" type="{http://pb.com/EngageOne/ws/model}Template"/>
     *         &lt;/choice>
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
        "folderOrTemplate"
    })
    public static class Children {

        @XmlElements({
            @XmlElement(name = "folder", type = Folder.class),
            @XmlElement(name = "template", type = Template.class)
        })
        protected List<FileItem> folderOrTemplate;

        /**
         * Gets the value of the folderOrTemplate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the folderOrTemplate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFolderOrTemplate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Folder }
         * {@link Template }
         * 
         * 
         */
        public List<FileItem> getFolderOrTemplate() {
            if (folderOrTemplate == null) {
                folderOrTemplate = new ArrayList<FileItem>();
            }
            return this.folderOrTemplate;
        }

    }

}
