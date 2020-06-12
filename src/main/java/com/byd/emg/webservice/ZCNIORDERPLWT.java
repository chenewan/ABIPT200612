
package com.byd.emg.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Planned Worktime Data
 * 
 * <p>Java class for ZCNI_ORDER_PL_WT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZCNI_ORDER_PL_WT">
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
 *         &lt;element name="PERNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *               &lt;pattern value="\d+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
@XmlType(name = "ZCNI_ORDER_PL_WT", propOrder = {
    "aufnr",
    "vornr",
    "pernr",
    "nachn",
    "vorna",
    "arbei",
    "arbeh",
    "erdat",
    "aedat"
})
public class ZCNIORDERPLWT {

    @XmlElement(name = "AUFNR")
    protected String aufnr;
    @XmlElement(name = "VORNR")
    protected String vornr;
    @XmlElement(name = "PERNR")
    protected String pernr;
    @XmlElement(name = "NACHN")
    protected String nachn;
    @XmlElement(name = "VORNA")
    protected String vorna;
    @XmlElement(name = "ARBEI")
    protected BigDecimal arbei;
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
