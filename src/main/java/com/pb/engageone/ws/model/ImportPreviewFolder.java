
package com.pb.engageone.ws.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportPreviewFolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportPreviewFolder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://pb.com/EngageOne/ws/model}ImportPreviewNode">
 *       &lt;sequence>
 *         &lt;element name="assets" type="{http://pb.com/EngageOne/ws/model}ImportPreviewAsset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subFolders" type="{http://pb.com/EngageOne/ws/model}ImportPreviewFolder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportPreviewFolder", propOrder = {
    "assets",
    "subFolders"
})
public class ImportPreviewFolder
    extends ImportPreviewNode
{

    protected List<ImportPreviewAsset> assets;
    protected List<ImportPreviewFolder> subFolders;

    /**
     * Gets the value of the assets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportPreviewAsset }
     * 
     * 
     */
    public List<ImportPreviewAsset> getAssets() {
        if (assets == null) {
            assets = new ArrayList<ImportPreviewAsset>();
        }
        return this.assets;
    }

    /**
     * Gets the value of the subFolders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subFolders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubFolders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportPreviewFolder }
     * 
     * 
     */
    public List<ImportPreviewFolder> getSubFolders() {
        if (subFolders == null) {
            subFolders = new ArrayList<ImportPreviewFolder>();
        }
        return this.subFolders;
    }

}
