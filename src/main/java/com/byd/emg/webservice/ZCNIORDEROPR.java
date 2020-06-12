
package com.byd.emg.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Operation Data
 * 
 * <p>Java class for ZCNI_ORDER_OPR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZCNI_ORDER_OPR">
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
 *         &lt;element name="VORNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STEUS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LTXA1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PREIS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="11"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PEINH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="0"/>
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
 *         &lt;element name="ARBPL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ARBEI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ISMNW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ARBEH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
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
@XmlType(name = "ZCNI_ORDER_OPR", propOrder = {
    "aufnr",
    "vornr",
    "steus",
    "ltxa1",
    "preis",
    "peinh",
    "waers",
    "arbpl",
    "arbei",
    "ismnw",
    "arbeh",
    "erdat",
    "aedat"
})
public class ZCNIORDEROPR {

    @XmlElement(name = "AUFNR")
    protected String aufnr;
    @XmlElement(name = "VORNR")
    protected String vornr;
    @XmlElement(name = "STEUS")
    protected String steus;
    @XmlElement(name = "LTXA1")
    protected String ltxa1;
    @XmlElement(name = "PREIS")
    protected BigDecimal preis;
    @XmlElement(name = "PEINH")
    protected BigDecimal peinh;
    @XmlElement(name = "WAERS")
    protected String waers;
    @XmlElement(name = "ARBPL")
    protected String arbpl;
    @XmlElement(name = "ARBEI")
    protected BigDecimal arbei;
    @XmlElement(name = "ISMNW")
    protected BigDecimal ismnw;
    @XmlElement(name = "ARBEH")
    protected String arbeh;
    @XmlElement(name = "ERDAT")
    protected String erdat;
    @XmlElement(name = "AEDAT")
    protected String aedat;

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
     * Gets the value of the vornr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVORNR() {
        return vornr;
    }

    /**
     * Sets the value of the vornr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVORNR(String value) {
        this.vornr = value;
    }

    /**
     * Gets the value of the steus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTEUS() {
        return steus;
    }

    /**
     * Sets the value of the steus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTEUS(String value) {
        this.steus = value;
    }

    /**
     * Gets the value of the ltxa1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLTXA1() {
        return ltxa1;
    }

    /**
     * Sets the value of the ltxa1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLTXA1(String value) {
        this.ltxa1 = value;
    }

    /**
     * Gets the value of the preis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPREIS() {
        return preis;
    }

    /**
     * Sets the value of the preis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPREIS(BigDecimal value) {
        this.preis = value;
    }

    /**
     * Gets the value of the peinh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPEINH() {
        return peinh;
    }

    /**
     * Sets the value of the peinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPEINH(BigDecimal value) {
        this.peinh = value;
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
     * Gets the value of the arbei property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getARBEI() {
        return arbei;
    }

    /**
     * Sets the value of the arbei property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setARBEI(BigDecimal value) {
        this.arbei = value;
    }

    /**
     * Gets the value of the ismnw property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getISMNW() {
        return ismnw;
    }

    /**
     * Sets the value of the ismnw property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setISMNW(BigDecimal value) {
        this.ismnw = value;
    }

    /**
     * Gets the value of the arbeh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARBEH() {
        return arbeh;
    }

    /**
     * Sets the value of the arbeh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARBEH(String value) {
        this.arbeh = value;
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
