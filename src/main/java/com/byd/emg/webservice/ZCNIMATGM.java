
package com.byd.emg.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Material Goods Movement Data
 * 
 * <p>Java class for ZCNI_MAT_GM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZCNI_MAT_GM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MBLNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MJAHR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="\d+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZEILE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="\d+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUDAT" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="CPUDT" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="CPUTM" type="{urn:sap-com:document:sap:rfc:functions}time" minOccurs="0"/>
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
 *         &lt;element name="BWART" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AUFNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MENGE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="3"/>
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
 *         &lt;element name="ERFMG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ERFME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
 *         &lt;element name="BWTAR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LFBJA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="\d+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LFBNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LFPOS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="\d+"/>
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
@XmlType(name = "ZCNI_MAT_GM", propOrder = {
    "mblnr",
    "mjahr",
    "zeile",
    "budat",
    "cpudt",
    "cputm",
    "matnr",
    "werks",
    "lgort",
    "bwart",
    "aufnr",
    "menge",
    "meins",
    "erfmg",
    "erfme",
    "dmbtr",
    "waers",
    "bwtar",
    "lfbja",
    "lfbnr",
    "lfpos"
})
public class ZCNIMATGM {

    @XmlElement(name = "MBLNR")
    protected String mblnr;
    @XmlElement(name = "MJAHR")
    protected String mjahr;
    @XmlElement(name = "ZEILE")
    protected String zeile;
    @XmlElement(name = "BUDAT")
    protected String budat;
    @XmlElement(name = "CPUDT")
    protected String cpudt;
    @XmlElement(name = "CPUTM")
    protected String cputm;
    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "WERKS")
    protected String werks;
    @XmlElement(name = "LGORT")
    protected String lgort;
    @XmlElement(name = "BWART")
    protected String bwart;
    @XmlElement(name = "AUFNR")
    protected String aufnr;
    @XmlElement(name = "MENGE")
    protected BigDecimal menge;
    @XmlElement(name = "MEINS")
    protected String meins;
    @XmlElement(name = "ERFMG")
    protected BigDecimal erfmg;
    @XmlElement(name = "ERFME")
    protected String erfme;
    @XmlElement(name = "DMBTR")
    protected BigDecimal dmbtr;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "BWTAR")
    protected String bwtar;
    @XmlElement(name = "LFBJA")
    protected String lfbja;
    @XmlElement(name = "LFBNR")
    protected String lfbnr;
    @XmlElement(name = "LFPOS")
    protected String lfpos;

    /**
     * Gets the value of the mblnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMBLNR() {
        return mblnr;
    }

    /**
     * Sets the value of the mblnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMBLNR(String value) {
        this.mblnr = value;
    }

    /**
     * Gets the value of the mjahr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMJAHR() {
        return mjahr;
    }

    /**
     * Sets the value of the mjahr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMJAHR(String value) {
        this.mjahr = value;
    }

    /**
     * Gets the value of the zeile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEILE() {
        return zeile;
    }

    /**
     * Sets the value of the zeile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEILE(String value) {
        this.zeile = value;
    }

    /**
     * Gets the value of the budat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDAT() {
        return budat;
    }

    /**
     * Sets the value of the budat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDAT(String value) {
        this.budat = value;
    }

    /**
     * Gets the value of the cpudt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPUDT() {
        return cpudt;
    }

    /**
     * Sets the value of the cpudt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPUDT(String value) {
        this.cpudt = value;
    }

    /**
     * Gets the value of the cputm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPUTM() {
        return cputm;
    }

    /**
     * Sets the value of the cputm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPUTM(String value) {
        this.cputm = value;
    }

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
     * Gets the value of the bwart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBWART() {
        return bwart;
    }

    /**
     * Sets the value of the bwart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBWART(String value) {
        this.bwart = value;
    }

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
     * Gets the value of the menge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMENGE() {
        return menge;
    }

    /**
     * Sets the value of the menge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMENGE(BigDecimal value) {
        this.menge = value;
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
     * Gets the value of the erfmg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getERFMG() {
        return erfmg;
    }

    /**
     * Sets the value of the erfmg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setERFMG(BigDecimal value) {
        this.erfmg = value;
    }

    /**
     * Gets the value of the erfme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERFME() {
        return erfme;
    }

    /**
     * Sets the value of the erfme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERFME(String value) {
        this.erfme = value;
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
     * Gets the value of the bwtar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBWTAR() {
        return bwtar;
    }

    /**
     * Sets the value of the bwtar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBWTAR(String value) {
        this.bwtar = value;
    }

    /**
     * Gets the value of the lfbja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLFBJA() {
        return lfbja;
    }

    /**
     * Sets the value of the lfbja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLFBJA(String value) {
        this.lfbja = value;
    }

    /**
     * Gets the value of the lfbnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLFBNR() {
        return lfbnr;
    }

    /**
     * Sets the value of the lfbnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLFBNR(String value) {
        this.lfbnr = value;
    }

    /**
     * Gets the value of the lfpos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLFPOS() {
        return lfpos;
    }

    /**
     * Sets the value of the lfpos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLFPOS(String value) {
        this.lfpos = value;
    }

}
