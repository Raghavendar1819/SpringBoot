
package com.pb.engageone.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverallResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverallResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAssetsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inProgressAssetsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="completedAssetsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="completedWithWarningsAssetsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="failedAssetsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="waitingAssetsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallResult", propOrder = {
    "startTime",
    "endTime",
    "totalAssetsCount",
    "inProgressAssetsCount",
    "completedAssetsCount",
    "completedWithWarningsAssetsCount",
    "failedAssetsCount",
    "waitingAssetsCount"
})
public class OverallResult {

    protected String startTime;
    protected String endTime;
    protected Integer totalAssetsCount;
    protected Integer inProgressAssetsCount;
    protected Integer completedAssetsCount;
    protected Integer completedWithWarningsAssetsCount;
    protected Integer failedAssetsCount;
    protected Integer waitingAssetsCount;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the totalAssetsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalAssetsCount() {
        return totalAssetsCount;
    }

    /**
     * Sets the value of the totalAssetsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalAssetsCount(Integer value) {
        this.totalAssetsCount = value;
    }

    /**
     * Gets the value of the inProgressAssetsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInProgressAssetsCount() {
        return inProgressAssetsCount;
    }

    /**
     * Sets the value of the inProgressAssetsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInProgressAssetsCount(Integer value) {
        this.inProgressAssetsCount = value;
    }

    /**
     * Gets the value of the completedAssetsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompletedAssetsCount() {
        return completedAssetsCount;
    }

    /**
     * Sets the value of the completedAssetsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompletedAssetsCount(Integer value) {
        this.completedAssetsCount = value;
    }

    /**
     * Gets the value of the completedWithWarningsAssetsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompletedWithWarningsAssetsCount() {
        return completedWithWarningsAssetsCount;
    }

    /**
     * Sets the value of the completedWithWarningsAssetsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompletedWithWarningsAssetsCount(Integer value) {
        this.completedWithWarningsAssetsCount = value;
    }

    /**
     * Gets the value of the failedAssetsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedAssetsCount() {
        return failedAssetsCount;
    }

    /**
     * Sets the value of the failedAssetsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedAssetsCount(Integer value) {
        this.failedAssetsCount = value;
    }

    /**
     * Gets the value of the waitingAssetsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWaitingAssetsCount() {
        return waitingAssetsCount;
    }

    /**
     * Sets the value of the waitingAssetsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWaitingAssetsCount(Integer value) {
        this.waitingAssetsCount = value;
    }

}
