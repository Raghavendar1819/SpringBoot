
package com.pb.engageone.ws.delivery;

import java.util.ArrayList;
import java.util.List;
import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.pb.engageone.ws.common.IntegerIdOrName;
import com.pb.engageone.ws.common.RequestMessage;
import com.pb.engageone.ws.model.TemplateFileType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/common}RequestMessage">
 *       &lt;sequence>
 *         &lt;element name="template">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ident" type="{http://pb.com/EngageOne/ws/common}IntegerIdOrName"/>
 *                   &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="files" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="file" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="type" type="{http://pb.com/EngageOne/ws/model}TemplateFileType"/>
 *                                       &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "", propOrder = {
    "template"
})
@XmlRootElement(name = "PreviewDocument")
public class PreviewDocument
    extends RequestMessage
{

    @XmlElement(required = true)
    protected PreviewDocument.Template template;

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link PreviewDocument.Template }
     *     
     */
    public PreviewDocument.Template getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviewDocument.Template }
     *     
     */
    public void setTemplate(PreviewDocument.Template value) {
        this.template = value;
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
     *         &lt;element name="ident" type="{http://pb.com/EngageOne/ws/common}IntegerIdOrName"/>
     *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="files" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="file" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="type" type="{http://pb.com/EngageOne/ws/model}TemplateFileType"/>
     *                             &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "ident",
        "effectiveDate",
        "files"
    })
    public static class Template {

        @XmlElement(required = true)
        protected IntegerIdOrName ident;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        protected PreviewDocument.Template.Files files;

        /**
         * Gets the value of the ident property.
         * 
         * @return
         *     possible object is
         *     {@link IntegerIdOrName }
         *     
         */
        public IntegerIdOrName getIdent() {
            return ident;
        }

        /**
         * Sets the value of the ident property.
         * 
         * @param value
         *     allowed object is
         *     {@link IntegerIdOrName }
         *     
         */
        public void setIdent(IntegerIdOrName value) {
            this.ident = value;
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
         * Gets the value of the files property.
         * 
         * @return
         *     possible object is
         *     {@link PreviewDocument.Template.Files }
         *     
         */
        public PreviewDocument.Template.Files getFiles() {
            return files;
        }

        /**
         * Sets the value of the files property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreviewDocument.Template.Files }
         *     
         */
        public void setFiles(PreviewDocument.Template.Files value) {
            this.files = value;
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
         *         &lt;element name="file" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="type" type="{http://pb.com/EngageOne/ws/model}TemplateFileType"/>
         *                   &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            protected List<PreviewDocument.Template.Files.File> file;

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
             * {@link PreviewDocument.Template.Files.File }
             * 
             * 
             */
            public List<PreviewDocument.Template.Files.File> getFile() {
                if (file == null) {
                    file = new ArrayList<PreviewDocument.Template.Files.File>();
                }
                return this.file;
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
             *         &lt;element name="type" type="{http://pb.com/EngageOne/ws/model}TemplateFileType"/>
             *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
                "type",
                "data"
            })
            public static class File {

                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected TemplateFileType type;
                @XmlElement(required = true)
                @XmlMimeType("application/octet-stream")
                protected DataHandler data;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TemplateFileType }
                 *     
                 */
                public TemplateFileType getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TemplateFileType }
                 *     
                 */
                public void setType(TemplateFileType value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the data property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DataHandler }
                 *     
                 */
                public DataHandler getData() {
                    return data;
                }

                /**
                 * Sets the value of the data property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DataHandler }
                 *     
                 */
                public void setData(DataHandler value) {
                    this.data = value;
                }

            }

        }

    }

}
