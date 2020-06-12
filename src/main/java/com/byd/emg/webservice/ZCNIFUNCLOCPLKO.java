
package com.byd.emg.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Function Location Task List - PLKO table
 * 
 * <p>Java class for ZCNI_FUNC_LOC_PLKO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZCNI_FUNC_LOC_PLKO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element name="KTEXT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
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
 *         &lt;element name="WERKS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VAGRP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ANLZU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STRAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
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
@XmlType(name = "ZCNI_FUNC_LOC_PLKO", propOrder = {
    "plnnr",
    "plnal",
    "ktext",
    "loekz",
    "werks",
    "vagrp",
    "anlzu",
    "strat",
    "andat",
    "aedat"
})
public class ZCNIFUNCLOCPLKO {

    @XmlElement(name = "PLNNR")
    protected String plnnr;
    @XmlElement(name = "PLNAL")
    protected String plnal;
    @XmlElement(name = "KTEXT")
    protected String ktext;
    @XmlElement(name = "LOEKZ")
    protected String loekz;
    @XmlElement(name = "WERKS")
    protected String werks;
    @XmlElement(name = "VAGRP")
    protected String vagrp;
    @XmlElement(name = "ANLZU")
    protected String anlzu;
    @XmlElement(name = "STRAT")
    protected String strat;
    @XmlElement(name = "ANDAT")
    protected String andat;
    @XmlElement(name = "AEDAT")
    protected String aedat;

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
     * Gets the value of the ktext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKTEXT() {
        return ktext;
    }

    /**
     * Sets the value of the ktext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKTEXT(String value) {
        this.ktext = value;
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
     * Gets the value of the werks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWERKS() {
        return werks;
    }

    /**
     * Sets the value of the werks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWERKS(String value) {
        this.werks = value;
    }

    /**
     * Gets the value of the vagrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAGRP() {
        return vagrp;
    }

    /**
     * Sets the value of the vagrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAGRP(String value) {
        this.vagrp = value;
    }

    /**
     * Gets the value of the anlzu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANLZU() {
        return anlzu;
    }

    /**
     * Sets the value of the anlzu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANLZU(String value) {
        this.anlzu = value;
    }

    /**
     * Gets the value of the strat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRAT() {
        return strat;
    }

    /**
     * Sets the value of the strat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRAT(String value) {
        this.strat = value;
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
