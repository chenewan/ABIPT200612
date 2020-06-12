
package com.byd.emg.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Actual Worktime Data
 * 
 * <p>Java class for ZCNI_ORDER_ACT_WT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZCNI_ORDER_ACT_WT">
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
 *         &lt;element name="RUECK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;pattern value="\d+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RMZHL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *               &lt;pattern value="\d+"/>
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
 *         &lt;element name="PERNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *               &lt;pattern value="\d+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ERSDA" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="LAEDA" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="NACHN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VORNA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ISMNW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ISMNE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STOKZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STZHL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *               &lt;pattern value="\d+"/>
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
 *         &lt;element name="ARBPL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
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
@XmlType(name = "ZCNI_ORDER_ACT_WT", propOrder = {
    "aufnr",
    "rueck",
    "rmzhl",
    "vornr",
    "pernr",
    "ersda",
    "laeda",
    "nachn",
    "vorna",
    "ismnw",
    "ismne",
    "stokz",
    "stzhl",
    "ltxa1",
    "arbpl"
})
public class ZCNIORDERACTWT {

    @XmlElement(name = "AUFNR")
    protected String aufnr;
    @XmlElement(name = "RUECK")
    protected String rueck;
    @XmlElement(name = "RMZHL")
    protected String rmzhl;
    @XmlElement(name = "VORNR")
    protected String vornr;
    @XmlElement(name = "PERNR")
    protected String pernr;
    @XmlElement(name = "ERSDA")
    protected String ersda;
    @XmlElement(name = "LAEDA")
    protected String laeda;
    @XmlElement(name = "NACHN")
    protected String nachn;
    @XmlElement(name = "VORNA")
    protected String vorna;
    @XmlElement(name = "ISMNW")
    protected BigDecimal ismnw;
    @XmlElement(name = "ISMNE")
    protected String ismne;
    @XmlElement(name = "STOKZ")
    protected String stokz;
    @XmlElement(name = "STZHL")
    protected String stzhl;
    @XmlElement(name = "LTXA1")
    protected String ltxa1;
    @XmlElement(name = "ARBPL")
    protected String arbpl;

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
     * Gets the value of the rueck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUECK() {
        return rueck;
    }

    /**
     * Sets the value of the rueck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUECK(String value) {
        this.rueck = value;
    }

    /**
     * Gets the value of the rmzhl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMZHL() {
        return rmzhl;
    }

    /**
     * Sets the value of the rmzhl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMZHL(String value) {
        this.rmzhl = value;
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
     * Gets the value of the pernr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERNR() {
        return pernr;
    }

    /**
     * Sets the value of the pernr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERNR(String value) {
        this.pernr = value;
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

    /**
     * Gets the value of the nachn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNACHN() {
        return nachn;
    }

    /**
     * Sets the value of the nachn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNACHN(String value) {
        this.nachn = value;
    }

    /**
     * Gets the value of the vorna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVORNA() {
        return vorna;
    }

    /**
     * Sets the value of the vorna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVORNA(String value) {
        this.vorna = value;
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
     * Gets the value of the ismne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISMNE() {
        return ismne;
    }

    /**
     * Sets the value of the ismne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISMNE(String value) {
        this.ismne = value;
    }

    /**
     * Gets the value of the stokz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOKZ() {
        return stokz;
    }

    /**
     * Sets the value of the stokz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOKZ(String value) {
        this.stokz = value;
    }

    /**
     * Gets the value of the stzhl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTZHL() {
        return stzhl;
    }

    /**
     * Sets the value of the stzhl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTZHL(String value) {
        this.stzhl = value;
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

}
