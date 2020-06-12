
package com.byd.emg.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Function Location Task List - PLMZ Table
 * 
 * <p>Java class for ZCNI_FUNC_LOC_PLMZ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZCNI_FUNC_LOC_PLMZ">
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
 *         &lt;element name="IMENG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IMEIN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
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
 *         &lt;element name="IDNRK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ANDAT" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
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
@XmlType(name = "ZCNI_FUNC_LOC_PLMZ", propOrder = {
    "plnnr",
    "plnal",
    "zaehl",
    "imeng",
    "imein",
    "loekz",
    "idnrk",
    "andat",
    "aedat"
})
public class ZCNIFUNCLOCPLMZ {

    @XmlElement(name = "PLNNR")
    protected String plnnr;
    @XmlElement(name = "PLNAL")
    protected String plnal;
    @XmlElement(name = "ZAEHL")
    protected String zaehl;
    @XmlElement(name = "IMENG")
    protected BigDecimal imeng;
    @XmlElement(name = "IMEIN")
    protected String imein;
    @XmlElement(name = "LOEKZ")
    protected String loekz;
    @XmlElement(name = "IDNRK")
    protected String idnrk;
    @XmlElement(name = "ANDAT")
    protected String andat;
    @XmlElement(name = "AEDAT")
    protected String aedat;

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
     * Gets the value of the imeng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIMENG() {
        return imeng;
    }

    /**
     * Sets the value of the imeng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIMENG(BigDecimal value) {
        this.imeng = value;
    }

    /**
     * Gets the value of the imein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMEIN() {
        return imein;
    }

    /**
     * Sets the value of the imein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMEIN(String value) {
        this.imein = value;
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
     * Gets the value of the andat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANDAT() {
        return andat;
    }

    /**
     * Sets the value of the andat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANDAT(String value) {
        this.andat = value;
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
