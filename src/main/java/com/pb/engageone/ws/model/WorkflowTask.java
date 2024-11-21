
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actualOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalReferenceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalReferenceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalReferenceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalReferenceSubjectName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalReferenceSubjectId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="step" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="submitter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://pb.com/EngageOne/ws/model}WorkflowTaskType"/>
 *         &lt;element name="uriToGetTaskDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowTask", propOrder = {
    "id",
    "name",
    "description",
    "status",
    "actualOwner",
    "externalReferenceName",
    "externalReferenceId",
    "externalReferenceType",
    "externalReferenceSubjectName",
    "externalReferenceSubjectId",
    "created",
    "step",
    "submitter",
    "type",
    "uriToGetTaskDetails"
})
@XmlSeeAlso({
    WorkflowTaskDetails.class
})
public class WorkflowTask {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String actualOwner;
    @XmlElement(required = true)
    protected String externalReferenceName;
    @XmlElement(required = true)
    protected String externalReferenceId;
    @XmlElement(required = true)
    protected String externalReferenceType;
    @XmlElement(required = true)
    protected String externalReferenceSubjectName;
    @XmlElement(required = true)
    protected String externalReferenceSubjectId;
    @XmlElement(required = true)
    protected String created;
    @XmlElement(required = true)
    protected String step;
    @XmlElement(required = true)
    protected String submitter;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected WorkflowTaskType type;
    @XmlElement(required = true)
    protected String uriToGetTaskDetails;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the actualOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualOwner() {
        return actualOwner;
    }

    /**
     * Sets the value of the actualOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualOwner(String value) {
        this.actualOwner = value;
    }

    /**
     * Gets the value of the externalReferenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferenceName() {
        return externalReferenceName;
    }

    /**
     * Sets the value of the externalReferenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferenceName(String value) {
        this.externalReferenceName = value;
    }

    /**
     * Gets the value of the externalReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferenceId() {
        return externalReferenceId;
    }

    /**
     * Sets the value of the externalReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferenceId(String value) {
        this.externalReferenceId = value;
    }

    /**
     * Gets the value of the externalReferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferenceType() {
        return externalReferenceType;
    }

    /**
     * Sets the value of the externalReferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferenceType(String value) {
        this.externalReferenceType = value;
    }

    /**
     * Gets the value of the externalReferenceSubjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferenceSubjectName() {
        return externalReferenceSubjectName;
    }

    /**
     * Sets the value of the externalReferenceSubjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferenceSubjectName(String value) {
        this.externalReferenceSubjectName = value;
    }

    /**
     * Gets the value of the externalReferenceSubjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferenceSubjectId() {
        return externalReferenceSubjectId;
    }

    /**
     * Sets the value of the externalReferenceSubjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferenceSubjectId(String value) {
        this.externalReferenceSubjectId = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * Gets the value of the step property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStep(String value) {
        this.step = value;
    }

    /**
     * Gets the value of the submitter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitter() {
        return submitter;
    }

    /**
     * Sets the value of the submitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitter(String value) {
        this.submitter = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowTaskType }
     *     
     */
    public WorkflowTaskType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowTaskType }
     *     
     */
    public void setType(WorkflowTaskType value) {
        this.type = value;
    }

    /**
     * Gets the value of the uriToGetTaskDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUriToGetTaskDetails() {
        return uriToGetTaskDetails;
    }

    /**
     * Sets the value of the uriToGetTaskDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUriToGetTaskDetails(String value) {
        this.uriToGetTaskDetails = value;
    }

}
