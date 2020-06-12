
package com.byd.emg.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Material Stock Data
 * 
 * <p>Java class for ZCNI_MAT_STOCK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZCNI_MAT_STOCK">
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
 *         &lt;element name="BWTAR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LVORM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LBKUM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STPRS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="11"/>
 *               &lt;fractionDigits value="2"/>
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
@XmlType(name = "ZCNI_MAT_STOCK", propOrder = {
    "matnr",
    "werks",
    "bwtar",
    "lvorm",
    "lbkum",
    "stprs",
    "ersda",
    "laeda"
})
public class ZCNIMATSTOCK {

    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "WERKS")
    protected String werks;
    @XmlElement(name = "BWTAR")
    protected String bwtar;
    @XmlElement(name = "LVORM")
    protected String lvorm;
    @XmlElement(name = "LBKUM")
    protected BigDecimal lbkum;
    @XmlElement(name = "STPRS")
    protected BigDecimal stprs;
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
     * Gets the value of the lvorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLVORM() {
        return lvorm;
    }

    /**
     * Sets the value of the lvorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLVORM(String value) {
        this.lvorm = value;
    }

    /**
     * Gets the value of the lbkum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLBKUM() {
        return lbkum;
    }

    /**
     * Sets the value of the lbkum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLBKUM(BigDecimal value) {
        this.lbkum = value;
    }

    /**
     * Gets the value of the stprs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSTPRS() {
        return stprs;
    }

    /**
     * Sets the value of the stprs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSTPRS(BigDecimal value) {
        this.stprs = value;
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
