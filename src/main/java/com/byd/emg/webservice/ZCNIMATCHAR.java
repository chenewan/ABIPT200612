
package com.byd.emg.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Material Characteristic Data
 * 
 * <p>Java class for ZCNI_MAT_CHAR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZCNI_MAT_CHAR">
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
 *         &lt;element name="CLASS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ATNAM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KSCHL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ATBEZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ATWRT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
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
@XmlType(name = "ZCNI_MAT_CHAR", propOrder = {
    "matnr",
    "_class",
    "atnam",
    "kschl",
    "atbez",
    "atwrt",
    "ersda",
    "laeda"
})
public class ZCNIMATCHAR {

    @XmlElement(name = "MATNR")
    protected String matnr;
    @XmlElement(name = "CLASS")
    protected String _class;
    @XmlElement(name = "ATNAM")
    protected String atnam;
    @XmlElement(name = "KSCHL")
    protected String kschl;
    @XmlElement(name = "ATBEZ")
    protected String atbez;
    @XmlElement(name = "ATWRT")
    protected String atwrt;
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
     * Gets the value of the class property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASS() {
        return _class;
    }

    /**
     * Sets the value of the class property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASS(String value) {
        this._class = value;
    }

    /**
     * Gets the value of the atnam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATNAM() {
        return atnam;
    }

    /**
     * Sets the value of the atnam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATNAM(String value) {
        this.atnam = value;
    }

    /**
     * Gets the value of the kschl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKSCHL() {
        return kschl;
    }

    /**
     * Sets the value of the kschl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKSCHL(String value) {
        this.kschl = value;
    }

    /**
     * Gets the value of the atbez property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATBEZ() {
        return atbez;
    }

    /**
     * Sets the value of the atbez property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATBEZ(String value) {
        this.atbez = value;
    }

    /**
     * Gets the value of the atwrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATWRT() {
        return atwrt;
    }

    /**
     * Sets the value of the atwrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATWRT(String value) {
        this.atwrt = value;
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
