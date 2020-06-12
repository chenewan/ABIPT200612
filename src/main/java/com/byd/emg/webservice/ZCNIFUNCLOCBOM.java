
package com.byd.emg.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Function Location BOM
 * 
 * <p>Java class for ZCNI_FUNC_LOC_BOM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZCNI_FUNC_LOC_BOM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WERKS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
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
 *         &lt;element name="POSNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDNRK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
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
 *         &lt;element name="ANDAT_TPST" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="AEDAT_TPST" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="ANDAT_STPO" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="AEDAT_STPO" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZCNI_FUNC_LOC_BOM", propOrder = {
    "werks",
    "tplnr",
    "posnr",
    "idnrk",
    "menge",
    "meins",
    "andattpst",
    "aedattpst",
    "andatstpo",
    "aedatstpo"
})
public class ZCNIFUNCLOCBOM {

    @XmlElement(name = "WERKS")
    protected String werks;
    @XmlElement(name = "TPLNR")
    protected String tplnr;
    @XmlElement(name = "POSNR")
    protected String posnr;
    @XmlElement(name = "IDNRK")
    protected String idnrk;
    @XmlElement(name = "MENGE")
    protected BigDecimal menge;
    @XmlElement(name = "MEINS")
    protected String meins;
    @XmlElement(name = "ANDAT_TPST")
    protected String andattpst;
    @XmlElement(name = "AEDAT_TPST")
    protected String aedattpst;
    @XmlElement(name = "ANDAT_STPO")
    protected String andatstpo;
    @XmlElement(name = "AEDAT_STPO")
    protected String aedatstpo;

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
     * Gets the value of the posnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSNR() {
        return posnr;
    }

    /**
     * Sets the value of the posnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSNR(String value) {
        this.posnr = value;
    }

    /**
     * Gets the value of the idnrk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNRK() {
        return idnrk;
    }

    /**
     * Sets the value of the idnrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNRK(String value) {
        this.idnrk = value;
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
     * Gets the value of the andattpst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANDATTPST() {
        return andattpst;
    }

    /**
     * Sets the value of the andattpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANDATTPST(String value) {
        this.andattpst = value;
    }

    /**
     * Gets the value of the aedattpst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAEDATTPST() {
        return aedattpst;
    }

    /**
     * Sets the value of the aedattpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAEDATTPST(String value) {
        this.aedattpst = value;
    }

    /**
     * Gets the value of the andatstpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANDATSTPO() {
        return andatstpo;
    }

    /**
     * Sets the value of the andatstpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANDATSTPO(String value) {
        this.andatstpo = value;
    }

    /**
     * Gets the value of the aedatstpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAEDATSTPO() {
        return aedatstpo;
    }

    /**
     * Sets the value of the aedatstpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAEDATSTPO(String value) {
        this.aedatstpo = value;
    }

}
