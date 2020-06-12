
package com.byd.emg.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Material Master Data
 * 
 * <p>Java class for ZCNI_MAT_MD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZCNI_MAT_MD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MATNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
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
 *         &lt;element name="LGORT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LVORM_MARA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LVORM_MARC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LVORM_MARD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAKTX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MTART" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MEINS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MMSTA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MFRPN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DISPO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LGPBE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ERSDA" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="LAEDA" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZCNI_MAT_MD", propOrder = {
    "matnr",
    "werks",
    "lgort",
    "lvormmara",
    "lvormmarc",
    "lvormmard",
    "maktx",
    "mtart",
    "meins",
    "mmsta",
    "mfrpn",
    "dispo",
    "lgpbe",
    "ersda",
    "laeda"
})
public class ZCNIMATMD {

    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "WERKS")
    protected String werks;
    @XmlElement(name = "LGORT")
    protected String lgort;
    @XmlElement(name = "LVORM_MARA")
    protected String lvormmara;
    @XmlElement(name = "LVORM_MARC")
    protected String lvormmarc;
    @XmlElement(name = "LVORM_MARD")
    protected String lvormmard;
    @XmlElement(name = "MAKTX")
    protected String maktx;
    @XmlElement(name = "MTART")
    protected String mtart;
    @XmlElement(name = "MEINS")
    protected String meins;
    @XmlElement(name = "MMSTA")
    protected String mmsta;
    @XmlElement(name = "MFRPN")
    protected String mfrpn;
    @XmlElement(name = "DISPO")
    protected String dispo;
    @XmlElement(name = "LGPBE")
    protected String lgpbe;
    @XmlElement(name = "ERSDA")
    protected String ersda;
    @XmlElement(name = "LAEDA")
    protected String laeda;

    /**
     * Gets the value of the matnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNR() {
        return matnr;
    }

    /**
     * Sets the value of the matnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNR(String value) {
        this.matnr = value;
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
     * Gets the value of the lgort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGORT() {
        return lgort;
    }

    /**
     * Sets the value of the lgort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGORT(String value) {
        this.lgort = value;
    }

    /**
     * Gets the value of the lvormmara property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLVORMMARA() {
        return lvormmara;
    }

    /**
     * Sets the value of the lvormmara property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLVORMMARA(String value) {
        this.lvormmara = value;
    }

    /**
     * Gets the value of the lvormmarc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLVORMMARC() {
        return lvormmarc;
    }

    /**
     * Sets the value of the lvormmarc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLVORMMARC(String value) {
        this.lvormmarc = value;
    }

    /**
     * Gets the value of the lvormmard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLVORMMARD() {
        return lvormmard;
    }

    /**
     * Sets the value of the lvormmard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLVORMMARD(String value) {
        this.lvormmard = value;
    }

    /**
     * Gets the value of the maktx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKTX() {
        return maktx;
    }

    /**
     * Sets the value of the maktx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKTX(String value) {
        this.maktx = value;
    }

    /**
     * Gets the value of the mtart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMTART() {
        return mtart;
    }

    /**
     * Sets the value of the mtart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMTART(String value) {
        this.mtart = value;
    }

    /**
     * Gets the value of the meins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEINS() {
        return meins;
    }

    /**
     * Sets the value of the meins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEINS(String value) {
        this.meins = value;
    }

    /**
     * Gets the value of the mmsta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMSTA() {
        return mmsta;
    }

    /**
     * Sets the value of the mmsta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMSTA(String value) {
        this.mmsta = value;
    }

    /**
     * Gets the value of the mfrpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFRPN() {
        return mfrpn;
    }

    /**
     * Sets the value of the mfrpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFRPN(String value) {
        this.mfrpn = value;
    }

    /**
     * Gets the value of the dispo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPO() {
        return dispo;
    }

    /**
     * Sets the value of the dispo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPO(String value) {
        this.dispo = value;
    }

    /**
     * Gets the value of the lgpbe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGPBE() {
        return lgpbe;
    }

    /**
     * Sets the value of the lgpbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGPBE(String value) {
        this.lgpbe = value;
    }

    /**
     * Gets the value of the ersda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERSDA() {
        return ersda;
    }

    /**
     * Sets the value of the ersda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERSDA(String value) {
        this.ersda = value;
    }

    /**
     * Gets the value of the laeda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAEDA() {
        return laeda;
    }

    /**
     * Sets the value of the laeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAEDA(String value) {
        this.laeda = value;
    }

}
