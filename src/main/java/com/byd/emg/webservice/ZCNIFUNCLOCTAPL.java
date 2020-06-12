
package com.byd.emg.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Function Location Task List - TAPL table
 * 
 * <p>Java class for ZCNI_FUNC_LOC_TAPL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZCNI_FUNC_LOC_TAPL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TPLNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PLNNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PLNAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LOEKZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IWERK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ANDAT" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="AEDAT" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZCNI_FUNC_LOC_TAPL", propOrder = {
    "tplnr",
    "plnnr",
    "plnal",
    "loekz",
    "iwerk",
    "andat",
    "aedat"
})
public class ZCNIFUNCLOCTAPL {

    @XmlElement(name = "TPLNR")
    protected String tplnr;
    @XmlElement(name = "PLNNR")
    protected String plnnr;
    @XmlElement(name = "PLNAL")
    protected String plnal;
    @XmlElement(name = "LOEKZ")
    protected String loekz;
    @XmlElement(name = "IWERK")
    protected String iwerk;
    @XmlElement(name = "ANDAT")
    protected String andat;
    @XmlElement(name = "AEDAT")
    protected String aedat;

    /**
     * Gets the value of the tplnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPLNR() {
        return tplnr;
    }

    /**
     * Sets the value of the tplnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPLNR(String value) {
        this.tplnr = value;
    }

    /**
     * Gets the value of the plnnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLNNR() {
        return plnnr;
    }

    /**
     * Sets the value of the plnnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLNNR(String value) {
        this.plnnr = value;
    }

    /**
     * Gets the value of the plnal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLNAL() {
        return plnal;
    }

    /**
     * Sets the value of the plnal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLNAL(String value) {
        this.plnal = value;
    }

    /**
     * Gets the value of the loekz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOEKZ() {
        return loekz;
    }

    /**
     * Sets the value of the loekz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOEKZ(String value) {
        this.loekz = value;
    }

    /**
     * Gets the value of the iwerk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIWERK() {
        return iwerk;
    }

    /**
     * Sets the value of the iwerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIWERK(String value) {
        this.iwerk = value;
    }

    /**
     * Gets the value of the andat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANDAT() {
        return andat;
    }

    /**
     * Sets the value of the andat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANDAT(String value) {
        this.andat = value;
    }

    /**
     * Gets the value of the aedat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAEDAT() {
        return aedat;
    }

    /**
     * Sets the value of the aedat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAEDAT(String value) {
        this.aedat = value;
    }

}
