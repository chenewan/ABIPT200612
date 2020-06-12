
package com.byd.emg.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Function Location Task List - PLAS PLPO Table
 * 
 * <p>Java class for ZCNI_FUNC_LOC_PLAS_PLPO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZCNI_FUNC_LOC_PLAS_PLPO">
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
 *         &lt;element name="ZAEHL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *               &lt;pattern value="\d+"/>
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
 *         &lt;element name="VORNR" minOccurs="0">
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
 *         &lt;element name="ARBEI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="7"/>
 *               &lt;fractionDigits value="1"/>
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
 *         &lt;element name="ANDAT_PLAS" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="AEDAT_PLAS" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="ANDAT_PLPO" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="AEDAT_PLPO" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZCNI_FUNC_LOC_PLAS_PLPO", propOrder = {
    "plnnr",
    "plnal",
    "zaehl",
    "loekz",
    "werks",
    "vornr",
    "ltxa1",
    "arbei",
    "arbeh",
    "andatplas",
    "aedatplas",
    "andatplpo",
    "aedatplpo"
})
public class ZCNIFUNCLOCPLASPLPO {

    @XmlElement(name = "PLNNR")
    protected String plnnr;
    @XmlElement(name = "PLNAL")
    protected String plnal;
    @XmlElement(name = "ZAEHL")
    protected String zaehl;
    @XmlElement(name = "LOEKZ")
    protected String loekz;
    @XmlElement(name = "WERKS")
    protected String werks;
    @XmlElement(name = "VORNR")
    protected String vornr;
    @XmlElement(name = "LTXA1")
    protected String ltxa1;
    @XmlElement(name = "ARBEI")
    protected BigDecimal arbei;
    @XmlElement(name = "ARBEH")
    protected String arbeh;
    @XmlElement(name = "ANDAT_PLAS")
    protected String andatplas;
    @XmlElement(name = "AEDAT_PLAS")
    protected String aedatplas;
    @XmlElement(name = "ANDAT_PLPO")
    protected String andatplpo;
    @XmlElement(name = "AEDAT_PLPO")
    protected String aedatplpo;

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
     * Gets the value of the zaehl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZAEHL() {
        return zaehl;
    }

    /**
     * Sets the value of the zaehl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZAEHL(String value) {
        this.zaehl = value;
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
     * Gets the value of the andatplas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANDATPLAS() {
        return andatplas;
    }

    /**
     * Sets the value of the andatplas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANDATPLAS(String value) {
        this.andatplas = value;
    }

    /**
     * Gets the value of the aedatplas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAEDATPLAS() {
        return aedatplas;
    }

    /**
     * Sets the value of the aedatplas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAEDATPLAS(String value) {
        this.aedatplas = value;
    }

    /**
     * Gets the value of the andatplpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANDATPLPO() {
        return andatplpo;
    }

    /**
     * Sets the value of the andatplpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANDATPLPO(String value) {
        this.andatplpo = value;
    }

    /**
     * Gets the value of the aedatplpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAEDATPLPO() {
        return aedatplpo;
    }

    /**
     * Sets the value of the aedatplpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAEDATPLPO(String value) {
        this.aedatplpo = value;
    }

}
