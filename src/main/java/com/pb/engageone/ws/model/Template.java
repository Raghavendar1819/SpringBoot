
package com.pb.engageone.ws.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Template complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Template">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/model}FileItem">
 *       &lt;sequence>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="withdrawnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="files" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="file" type="{http://pb.com/EngageOne/ws/model}TemplateFile" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="effectiveDateSelection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="versionsHaveEffectivDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="selectionCriteria" type="{http://pb.com/EngageOne/ws/model}EffectiveDateSelectionCriteria"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="spellCheck" type="{http://pb.com/EngageOne/ws/model}SpellCheckType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Template", propOrder = {
    "path",
    "version",
    "effectiveDate",
    "withdrawnDate",
    "files",
    "effectiveDateSelection",
    "spellCheck"
})
public class Template
    extends FileItem
{

    @XmlElement(required = true)
    protected String path;
    @XmlElement(required = true)
    protected String version;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar withdrawnDate;
    protected Template.Files files;
    protected Template.EffectiveDateSelection effectiveDateSelection;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SpellCheckType spellCheck;

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the withdrawnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWithdrawnDate() {
        return withdrawnDate;
    }

    /**
     * Sets the value of the withdrawnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWithdrawnDate(XMLGregorianCalendar value) {
        this.withdrawnDate = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * @return
     *     possible object is
     *     {@link Template.Files }
     *     
     */
    public Template.Files getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link Template.Files }
     *     
     */
    public void setFiles(Template.Files value) {
        this.files = value;
    }

    /**
     * Gets the value of the effectiveDateSelection property.
     * 
     * @return
     *     possible object is
     *     {@link Template.EffectiveDateSelection }
     *     
     */
    public Template.EffectiveDateSelection getEffectiveDateSelection() {
        return effectiveDateSelection;
    }

    /**
     * Sets the value of the effectiveDateSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Template.EffectiveDateSelection }
     *     
     */
    public void setEffectiveDateSelection(Template.EffectiveDateSelection value) {
        this.effectiveDateSelection = value;
    }

    /**
     * Gets the value of the spellCheck property.
     * 
     * @return
     *     possible object is
     *     {@link SpellCheckType }
     *     
     */
    public SpellCheckType getSpellCheck() {
        return spellCheck;
    }

    /**
     * Sets the value of the spellCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpellCheckType }
     *     
     */
    public void setSpellCheck(SpellCheckType value) {
        this.spellCheck = value;
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
     *         &lt;element name="versionsHaveEffectivDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="selectionCriteria" type="{http://pb.com/EngageOne/ws/model}EffectiveDateSelectionCriteria"/>
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
        "versionsHaveEffectivDate",
        "selectionCriteria"
    })
    public static class EffectiveDateSelection {

        @XmlElement(defaultValue = "false")
        protected boolean versionsHaveEffectivDate;
        @XmlElement(required = true, defaultValue = "CURRENT_DATE")
        @XmlSchemaType(name = "string")
        protected EffectiveDateSelectionCriteria selectionCriteria;

        /**
         * Gets the value of the versionsHaveEffectivDate property.
         * 
         */
        public boolean isVersionsHaveEffectivDate() {
            return versionsHaveEffectivDate;
        }

        /**
         * Sets the value of the versionsHaveEffectivDate property.
         * 
         */
        public void setVersionsHaveEffectivDate(boolean value) {
            this.versionsHaveEffectivDate = value;
        }

        /**
         * Gets the value of the selectionCriteria property.
         * 
         * @return
         *     possible object is
         *     {@link EffectiveDateSelectionCriteria }
         *     
         */
        public EffectiveDateSelectionCriteria getSelectionCriteria() {
            return selectionCriteria;
        }

        /**
         * Sets the value of the selectionCriteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link EffectiveDateSelectionCriteria }
         *     
         */
        public void setSelectionCriteria(EffectiveDateSelectionCriteria value) {
            this.selectionCriteria = value;
        }

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
     *         &lt;element name="file" type="{http://pb.com/EngageOne/ws/model}TemplateFile" maxOccurs="unbounded"/>
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
        "file"
    })
    public static class Files {

        @XmlElement(required = true)
        protected List<TemplateFile> file;

        /**
         * Gets the value of the file property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the file property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TemplateFile }
         * 
         * 
         */
        public List<TemplateFile> getFile() {
            if (file == null) {
                file = new ArrayList<TemplateFile>();
            }
            return this.file;
        }

    }

}
