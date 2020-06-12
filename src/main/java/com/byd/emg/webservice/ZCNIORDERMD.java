
package com.byd.emg.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Master Data
 * 
 * <p>Java class for ZCNI_ORDER_MD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZCNI_ORDER_MD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AUFNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ERDAT" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="AEDAT" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="AUART" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KTEXT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VAPLZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
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
 *         &lt;element name="BUKRS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KOSTL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDAT2" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="GSTRP" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="GLTRP" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="GSTRI" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="GETRI" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="FTRMI" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="INGPR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="APGRP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ILART" minOccurs="0">
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
 *         &lt;element name="PRIOK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WARPL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LAUFN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QMNUM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ADDAT" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="ADUHR" type="{urn:sap-com:document:sap:rfc:functions}time" minOccurs="0"/>
 *         &lt;element name="DMBTR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WAERS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STTXT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UTTXT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TPLNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "ZCNI_ORDER_MD", propOrder = {
    "aufnr",
    "erdat",
    "aedat",
    "auart",
    "ktext",
    "vaplz",
    "werks",
    "bukrs",
    "kostl",
    "idat2",
    "gstrp",
    "gltrp",
    "gstri",
    "getri",
    "ftrmi",
    "ingpr",
    "apgrp",
    "ilart",
    "anlzu",
    "priok",
    "warpl",
    "laufn",
    "qmnum",
    "addat",
    "aduhr",
    "dmbtr",
    "waers",
    "sttxt",
    "uttxt",
    "tplnr"
})
public class ZCNIORDERMD {

    @XmlElement(name = "AUFNR")
    protected String aufnr;
    @XmlElement(name = "ERDAT")
    protected String erdat;
    @XmlElement(name = "AEDAT")
    protected String aedat;
    @XmlElement(name = "AUART")
    protected String auart;
    @XmlElement(name = "KTEXT")
    protected String ktext;
    @XmlElement(name = "VAPLZ")
    protected String vaplz;
    @XmlElement(name = "WERKS")
    protected String werks;
    @XmlElement(name = "BUKRS")
    protected String bukrs;
    @XmlElement(name = "KOSTL")
    protected String kostl;
    @XmlElement(name = "IDAT2")
    protected String idat2;
    @XmlElement(name = "GSTRP")
    protected String gstrp;
    @XmlElement(name = "GLTRP")
    protected String gltrp;
    @XmlElement(name = "GSTRI")
    protected String gstri;
    @XmlElement(name = "GETRI")
    protected String getri;
    @XmlElement(name = "FTRMI")
    protected String ftrmi;
    @XmlElement(name = "INGPR")
    protected String ingpr;
    @XmlElement(name = "APGRP")
    protected String apgrp;
    @XmlElement(name = "ILART")
    protected String ilart;
    @XmlElement(name = "ANLZU")
    protected String anlzu;
    @XmlElement(name = "PRIOK")
    protected String priok;
    @XmlElement(name = "WARPL")
    protected String warpl;
    @XmlElement(name = "LAUFN")
    protected String laufn;
    @XmlElement(name = "QMNUM")
    protected String qmnum;
    @XmlElement(name = "ADDAT")
    protected String addat;
    @XmlElement(name = "ADUHR")
    protected String aduhr;
    @XmlElement(name = "DMBTR")
    protected BigDecimal dmbtr;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "STTXT")
    protected String sttxt;
    @XmlElement(name = "UTTXT")
    protected String uttxt;
    @XmlElement(name = "TPLNR")
    protected String tplnr;

    /**
     * Gets the value of the aufnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUFNR() {
        return aufnr;
    }

    /**
     * Sets the value of the aufnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUFNR(String value) {
        this.aufnr = value;
    }

    /**
     * Gets the value of the erdat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERDAT() {
        return erdat;
    }

    /**
     * Sets the value of the erdat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERDAT(String value) {
        this.erdat = value;
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

    /**
     * Gets the value of the auart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUART() {
        return auart;
    }

    /**
     * Sets the value of the auart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUART(String value) {
        this.auart = value;
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
     * Gets the value of the vaplz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAPLZ() {
        return vaplz;
    }

    /**
     * Sets the value of the vaplz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAPLZ(String value) {
        this.vaplz = value;
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
     * Gets the value of the bukrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUKRS() {
        return bukrs;
    }

    /**
     * Sets the value of the bukrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUKRS(String value) {
        this.bukrs = value;
    }

    /**
     * Gets the value of the kostl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOSTL() {
        return kostl;
    }

    /**
     * Sets the value of the kostl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOSTL(String value) {
        this.kostl = value;
    }

    /**
     * Gets the value of the idat2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDAT2() {
        return idat2;
    }

    /**
     * Sets the value of the idat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDAT2(String value) {
        this.idat2 = value;
    }

    /**
     * Gets the value of the gstrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSTRP() {
        return gstrp;
    }

    /**
     * Sets the value of the gstrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSTRP(String value) {
        this.gstrp = value;
    }

    /**
     * Gets the value of the gltrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLTRP() {
        return gltrp;
    }

    /**
     * Sets the value of the gltrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLTRP(String value) {
        this.gltrp = value;
    }

    /**
     * Gets the value of the gstri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSTRI() {
        return gstri;
    }

    /**
     * Sets the value of the gstri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSTRI(String value) {
        this.gstri = value;
    }

    /**
     * Gets the value of the getri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGETRI() {
        return getri;
    }

    /**
     * Sets the value of the getri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGETRI(String value) {
        this.getri = value;
    }

    /**
     * Gets the value of the ftrmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTRMI() {
        return ftrmi;
    }

    /**
     * Sets the value of the ftrmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTRMI(String value) {
        this.ftrmi = value;
    }

    /**
     * Gets the value of the ingpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINGPR() {
        return ingpr;
    }

    /**
     * Sets the value of the ingpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINGPR(String value) {
        this.ingpr = value;
    }

    /**
     * Gets the value of the apgrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPGRP() {
        return apgrp;
    }

    /**
     * Sets the value of the apgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPGRP(String value) {
        this.apgrp = value;
    }

    /**
     * Gets the value of the ilart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getILART() {
        return ilart;
    }

    /**
     * Sets the value of the ilart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setILART(String value) {
        this.ilart = value;
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
     * Gets the value of the priok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIOK() {
        return priok;
    }

    /**
     * Sets the value of the priok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIOK(String value) {
        this.priok = value;
    }

    /**
     * Gets the value of the warpl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWARPL() {
        return warpl;
    }

    /**
     * Sets the value of the warpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWARPL(String value) {
        this.warpl = value;
    }

    /**
     * Gets the value of the laufn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAUFN() {
        return laufn;
    }

    /**
     * Sets the value of the laufn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAUFN(String value) {
        this.laufn = value;
    }

    /**
     * Gets the value of the qmnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQMNUM() {
        return qmnum;
    }

    /**
     * Sets the value of the qmnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQMNUM(String value) {
        this.qmnum = value;
    }

    /**
     * Gets the value of the addat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDAT() {
        return addat;
    }

    /**
     * Sets the value of the addat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDAT(String value) {
        this.addat = value;
    }

    /**
     * Gets the value of the aduhr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADUHR() {
        return aduhr;
    }

    /**
     * Sets the value of the aduhr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADUHR(String value) {
        this.aduhr = value;
    }

    /**
     * Gets the value of the dmbtr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDMBTR() {
        return dmbtr;
    }

    /**
     * Sets the value of the dmbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDMBTR(BigDecimal value) {
        this.dmbtr = value;
    }

    /**
     * Gets the value of the waers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWAERS() {
        return waers;
    }

    /**
     * Sets the value of the waers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWAERS(String value) {
        this.waers = value;
    }

    /**
     * Gets the value of the sttxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTTXT() {
        return sttxt;
    }

    /**
     * Sets the value of the sttxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTTXT(String value) {
        this.sttxt = value;
    }

    /**
     * Gets the value of the uttxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTTXT() {
        return uttxt;
    }

    /**
     * Sets the value of the uttxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTTXT(String value) {
        this.uttxt = value;
    }

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

}
