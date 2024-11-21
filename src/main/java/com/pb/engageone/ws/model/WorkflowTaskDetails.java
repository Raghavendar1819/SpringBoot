
package com.pb.engageone.ws.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowTaskDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowTaskDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/model}WorkflowTask">
 *       &lt;sequence>
 *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isActionableByYou" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="onBehalfOfGroups" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="potentialGroups" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="potentialUsers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="allowedActions" type="{http://pb.com/EngageOne/ws/model}WorkflowTaskAction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previewBefore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previewAfter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previewDiff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comparisonStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowTaskDetails", propOrder = {
    "instanceId",
    "isActionableByYou",
    "onBehalfOfGroups",
    "potentialGroups",
    "potentialUsers",
    "allowedActions",
    "projectId",
    "previewBefore",
    "previewAfter",
    "previewDiff",
    "comparisonStatus"
})
public class WorkflowTaskDetails
    extends WorkflowTask
{

    @XmlElement(required = true)
    protected String instanceId;
    protected boolean isActionableByYou;
    protected List<String> onBehalfOfGroups;
    protected List<String> potentialGroups;
    protected List<String> potentialUsers;
    @XmlSchemaType(name = "string")
    protected List<WorkflowTaskAction> allowedActions;
    protected String projectId;
    protected String previewBefore;
    protected String previewAfter;
    protected String previewDiff;
    protected String comparisonStatus;

    /**
     * Gets the value of the instanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Gets the value of the isActionableByYou property.
     * 
     */
    public boolean isIsActionableByYou() {
        return isActionableByYou;
    }

    /**
     * Sets the value of the isActionableByYou property.
     * 
     */
    public void setIsActionableByYou(boolean value) {
        this.isActionableByYou = value;
    }

    /**
     * Gets the value of the onBehalfOfGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onBehalfOfGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnBehalfOfGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOnBehalfOfGroups() {
        if (onBehalfOfGroups == null) {
            onBehalfOfGroups = new ArrayList<String>();
        }
        return this.onBehalfOfGroups;
    }

    /**
     * Gets the value of the potentialGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the potentialGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPotentialGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPotentialGroups() {
        if (potentialGroups == null) {
            potentialGroups = new ArrayList<String>();
        }
        return this.potentialGroups;
    }

    /**
     * Gets the value of the potentialUsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the potentialUsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPotentialUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPotentialUsers() {
        if (potentialUsers == null) {
            potentialUsers = new ArrayList<String>();
        }
        return this.potentialUsers;
    }

    /**
     * Gets the value of the allowedActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowTaskAction }
     * 
     * 
     */
    public List<WorkflowTaskAction> getAllowedActions() {
        if (allowedActions == null) {
            allowedActions = new ArrayList<WorkflowTaskAction>();
        }
        return this.allowedActions;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the previewBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewBefore() {
        return previewBefore;
    }

    /**
     * Sets the value of the previewBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewBefore(String value) {
        this.previewBefore = value;
    }

    /**
     * Gets the value of the previewAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewAfter() {
        return previewAfter;
    }

    /**
     * Sets the value of the previewAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewAfter(String value) {
        this.previewAfter = value;
    }

    /**
     * Gets the value of the previewDiff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewDiff() {
        return previewDiff;
    }

    /**
     * Sets the value of the previewDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewDiff(String value) {
        this.previewDiff = value;
    }

    /**
     * Gets the value of the comparisonStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparisonStatus() {
        return comparisonStatus;
    }

    /**
     * Sets the value of the comparisonStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparisonStatus(String value) {
        this.comparisonStatus = value;
    }

}
