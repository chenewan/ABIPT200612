
package com.byd.emg.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Function Location Master Data
 * 
 * <p>Java class for ZCNI_FUNC_LOC_MD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZCNI_FUNC_LOC_MD">
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
 *         &lt;element name="PLTXT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
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
 *         &lt;element name="IWERK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EQART" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EARTX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HERST" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HERLD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BAUJJ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TYPBZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SERGE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GROES" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BRGEW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GEWEI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ANSWT" minOccurs="0">
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
 *         &lt;element name="ANSDT" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="BAUMM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INGRP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TPLMA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BEBER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ABCKZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EQFNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MSGRP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
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
 *         &lt;element name="STORT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ARBPL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ERDAT" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
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
@XmlType(name = "ZCNI_FUNC_LOC_MD", propOrder = {
    "tplnr",
    "pltxt",
    "sttxt",
    "iwerk",
    "eqart",
    "eartx",
    "herst",
    "herld",
    "baujj",
    "typbz",
    "serge",
    "groes",
    "brgew",
    "gewei",
    "answt",
    "waers",
    "ansdt",
    "baumm",
    "ingrp",
    "tplma",
    "beber",
    "abckz",
    "eqfnr",
    "msgrp",
    "kostl",
    "stort",
    "arbpl",
    "erdat",
    "aedat"
})
public class ZCNIFUNCLOCMD {

    @XmlElement(name = "TPLNR")
    protected String tplnr;
    @XmlElement(name = "PLTXT")
    protected String pltxt;
    @XmlElement(name = "STTXT")
    protected String sttxt;
    @XmlElement(name = "IWERK")
    protected String iwerk;
    @XmlElement(name = "EQART")
    protected String eqart;
    @XmlElement(name = "EARTX")
    protected String eartx;
    @XmlElement(name = "HERST")
    protected String herst;
    @XmlElement(name = "HERLD")
    protected String herld;
    @XmlElement(name = "BAUJJ")
    protected String baujj;
    @XmlElement(name = "TYPBZ")
    protected String typbz;
    @XmlElement(name = "SERGE")
    protected String serge;
    @XmlElement(name = "GROES")
    protected String groes;
    @XmlElement(name = "BRGEW")
    protected BigDecimal brgew;
    @XmlElement(name = "GEWEI")
    protected String gewei;
    @XmlElement(name = "ANSWT")
    protected BigDecimal answt;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "ANSDT")
    protected String ansdt;
    @XmlElement(name = "BAUMM")
    protected String baumm;
    @XmlElement(name = "INGRP")
    protected String ingrp;
    @XmlElement(name = "TPLMA")
    protected String tplma;
    @XmlElement(name = "BEBER")
    protected String beber;
    @XmlElement(name = "ABCKZ")
    protected String abckz;
    @XmlElement(name = "EQFNR")
    protected String eqfnr;
    @XmlElement(name = "MSGRP")
    protected String msgrp;
    @XmlElement(name = "KOSTL")
    protected String kostl;
    @XmlElement(name = "STORT")
    protected String stort;
    @XmlElement(name = "ARBPL")
    protected String arbpl;
    @XmlElement(name = "ERDAT")
    protected String erdat;
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
     * Gets the value of the pltxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLTXT() {
        return pltxt;
    }

    /**
     * Sets the value of the pltxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLTXT(String value) {
        this.pltxt = value;
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
     * Gets the value of the eqart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQART() {
        return eqart;
    }

    /**
     * Sets the value of the eqart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQART(String value) {
        this.eqart = value;
    }

    /**
     * Gets the value of the eartx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEARTX() {
        return eartx;
    }

    /**
     * Sets the value of the eartx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEARTX(String value) {
        this.eartx = value;
    }

    /**
     * Gets the value of the herst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHERST() {
        return herst;
    }

    /**
     * Sets the value of the herst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHERST(String value) {
        this.herst = value;
    }

    /**
     * Gets the value of the herld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHERLD() {
        return herld;
    }

    /**
     * Sets the value of the herld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHERLD(String value) {
        this.herld = value;
    }

    /**
     * Gets the value of the baujj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAUJJ() {
        return baujj;
    }

    /**
     * Sets the value of the baujj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAUJJ(String value) {
        this.baujj = value;
    }

    /**
     * Gets the value of the typbz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPBZ() {
        return typbz;
    }

    /**
     * Sets the value of the typbz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPBZ(String value) {
        this.typbz = value;
    }

    /**
     * Gets the value of the serge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERGE() {
        return serge;
    }

    /**
     * Sets the value of the serge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERGE(String value) {
        this.serge = value;
    }

    /**
     * Gets the value of the groes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROES() {
        return groes;
    }

    /**
     * Sets the value of the groes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROES(String value) {
        this.groes = value;
    }

    /**
     * Gets the value of the brgew property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBRGEW() {
        return brgew;
    }

    /**
     * Sets the value of the brgew property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBRGEW(BigDecimal value) {
        this.brgew = value;
    }

    /**
     * Gets the value of the gewei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEWEI() {
        return gewei;
    }

    /**
     * Sets the value of the gewei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEWEI(String value) {
        this.gewei = value;
    }

    /**
     * Gets the value of the answt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getANSWT() {
        return answt;
    }

    /**
     * Sets the value of the answt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setANSWT(BigDecimal value) {
        this.answt = value;
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
     * Gets the value of the ansdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANSDT() {
        return ansdt;
    }

    /**
     * Sets the value of the ansdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANSDT(String value) {
        this.ansdt = value;
    }

    /**
     * Gets the value of the baumm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBAUMM() {
        return baumm;
    }

    /**
     * Sets the value of the baumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBAUMM(String value) {
        this.baumm = value;
    }

    /**
     * Gets the value of the ingrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINGRP() {
        return ingrp;
    }

    /**
     * Sets the value of the ingrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINGRP(String value) {
        this.ingrp = value;
    }

    /**
     * Gets the value of the tplma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPLMA() {
        return tplma;
    }

    /**
     * Sets the value of the tplma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPLMA(String value) {
        this.tplma = value;
    }

    /**
     * Gets the value of the beber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEBER() {
        return beber;
    }

    /**
     * Sets the value of the beber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEBER(String value) {
        this.beber = value;
    }

    /**
     * Gets the value of the abckz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABCKZ() {
        return abckz;
    }

    /**
     * Sets the value of the abckz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABCKZ(String value) {
        this.abckz = value;
    }

    /**
     * Gets the value of the eqfnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQFNR() {
        return eqfnr;
    }

    /**
     * Sets the value of the eqfnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQFNR(String value) {
        this.eqfnr = value;
    }

    /**
     * Gets the value of the msgrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGRP() {
        return msgrp;
    }

    /**
     * Sets the value of the msgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGRP(String value) {
        this.msgrp = value;
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
     * Gets the value of the stort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTORT() {
        return stort;
    }

    /**
     * Sets the value of the stort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTORT(String value) {
        this.stort = value;
    }

    /**
     * Gets the value of the arbpl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARBPL() {
        return arbpl;
    }

    /**
     * Sets the value of the arbpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARBPL(String value) {
        this.arbpl = value;
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

}
