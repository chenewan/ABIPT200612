
package com.byd.emg.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="I_CHAR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="I_GM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="I_MD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="I_STOCK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="I_UPDAT_END" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="I_UPDAT_START" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="T_CHAR" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_MAT_CHAR" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_GM" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_MAT_GM" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_MATNR_SEL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}RANGE_MATNR" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_MD" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_MAT_MD" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_RETURN" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}BAPIRET2" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_STOCK" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_MAT_STOCK" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_WERKS_SEL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}WERKS_RANG" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "ZCN_MAT_INFO_RFC")
public class ZCNMATINFORFC {

    @XmlElement(name = "I_CHAR")
    protected String ichar;
    @XmlElement(name = "I_GM")
    protected String igm;
    @XmlElement(name = "I_MD")
    protected String imd;
    @XmlElement(name = "I_STOCK")
    protected String istock;
    @XmlElement(name = "I_UPDAT_END")
    protected String iupdatend;
    @XmlElement(name = "I_UPDAT_START")
    protected String iupdatstart;
    @XmlElement(name = "T_CHAR")
    protected ZCNMATINFORFC.TCHAR tchar;
    @XmlElement(name = "T_GM")
    protected ZCNMATINFORFC.TGM tgm;
    @XmlElement(name = "T_MATNR_SEL")
    protected ZCNMATINFORFC.TMATNRSEL tmatnrsel;
    @XmlElement(name = "T_MD")
    protected ZCNMATINFORFC.TMD tmd;
    @XmlElement(name = "T_RETURN")
    protected ZCNMATINFORFC.TRETURN treturn;
    @XmlElement(name = "T_STOCK")
    protected ZCNMATINFORFC.TSTOCK tstock;
    @XmlElement(name = "T_WERKS_SEL")
    protected ZCNMATINFORFC.TWERKSSEL twerkssel;

    /**
     * Gets the value of the ichar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICHAR() {
        return ichar;
    }

    /**
     * Sets the value of the ichar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICHAR(String value) {
        this.ichar = value;
    }

    /**
     * Gets the value of the igm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIGM() {
        return igm;
    }

    /**
     * Sets the value of the igm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIGM(String value) {
        this.igm = value;
    }

    /**
     * Gets the value of the imd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMD() {
        return imd;
    }

    /**
     * Sets the value of the imd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMD(String value) {
        this.imd = value;
    }

    /**
     * Gets the value of the istock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISTOCK() {
        return istock;
    }

    /**
     * Sets the value of the istock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISTOCK(String value) {
        this.istock = value;
    }

    /**
     * Gets the value of the iupdatend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIUPDATEND() {
        return iupdatend;
    }

    /**
     * Sets the value of the iupdatend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIUPDATEND(String value) {
        this.iupdatend = value;
    }

    /**
     * Gets the value of the iupdatstart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIUPDATSTART() {
        return iupdatstart;
    }

    /**
     * Sets the value of the iupdatstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIUPDATSTART(String value) {
        this.iupdatstart = value;
    }

    /**
     * Gets the value of the tchar property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNMATINFORFC.TCHAR }
     *     
     */
    public ZCNMATINFORFC.TCHAR getTCHAR() {
        return tchar;
    }

    /**
     * Sets the value of the tchar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNMATINFORFC.TCHAR }
     *     
     */
    public void setTCHAR(ZCNMATINFORFC.TCHAR value) {
        this.tchar = value;
    }

    /**
     * Gets the value of the tgm property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNMATINFORFC.TGM }
     *     
     */
    public ZCNMATINFORFC.TGM getTGM() {
        return tgm;
    }

    /**
     * Sets the value of the tgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNMATINFORFC.TGM }
     *     
     */
    public void setTGM(ZCNMATINFORFC.TGM value) {
        this.tgm = value;
    }

    /**
     * Gets the value of the tmatnrsel property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNMATINFORFC.TMATNRSEL }
     *     
     */
    public ZCNMATINFORFC.TMATNRSEL getTMATNRSEL() {
        return tmatnrsel;
    }

    /**
     * Sets the value of the tmatnrsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNMATINFORFC.TMATNRSEL }
     *     
     */
    public void setTMATNRSEL(ZCNMATINFORFC.TMATNRSEL value) {
        this.tmatnrsel = value;
    }

    /**
     * Gets the value of the tmd property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNMATINFORFC.TMD }
     *     
     */
    public ZCNMATINFORFC.TMD getTMD() {
        return tmd;
    }

    /**
     * Sets the value of the tmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNMATINFORFC.TMD }
     *     
     */
    public void setTMD(ZCNMATINFORFC.TMD value) {
        this.tmd = value;
    }

    /**
     * Gets the value of the treturn property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNMATINFORFC.TRETURN }
     *     
     */
    public ZCNMATINFORFC.TRETURN getTRETURN() {
        return treturn;
    }

    /**
     * Sets the value of the treturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNMATINFORFC.TRETURN }
     *     
     */
    public void setTRETURN(ZCNMATINFORFC.TRETURN value) {
        this.treturn = value;
    }

    /**
     * Gets the value of the tstock property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNMATINFORFC.TSTOCK }
     *     
     */
    public ZCNMATINFORFC.TSTOCK getTSTOCK() {
        return tstock;
    }

    /**
     * Sets the value of the tstock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNMATINFORFC.TSTOCK }
     *     
     */
    public void setTSTOCK(ZCNMATINFORFC.TSTOCK value) {
        this.tstock = value;
    }

    /**
     * Gets the value of the twerkssel property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNMATINFORFC.TWERKSSEL }
     *     
     */
    public ZCNMATINFORFC.TWERKSSEL getTWERKSSEL() {
        return twerkssel;
    }

    /**
     * Sets the value of the twerkssel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNMATINFORFC.TWERKSSEL }
     *     
     */
    public void setTWERKSSEL(ZCNMATINFORFC.TWERKSSEL value) {
        this.twerkssel = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_MAT_CHAR" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class TCHAR {

        protected List<ZCNIMATCHAR> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZCNIMATCHAR }
         * 
         * 
         */
        public List<ZCNIMATCHAR> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIMATCHAR>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_MAT_GM" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class TGM {

        protected List<ZCNIMATGM> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZCNIMATGM }
         * 
         * 
         */
        public List<ZCNIMATGM> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIMATGM>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}RANGE_MATNR" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class TMATNRSEL {

        protected List<RANGEMATNR> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RANGEMATNR }
         * 
         * 
         */
        public List<RANGEMATNR> getItem() {
            if (item == null) {
                item = new ArrayList<RANGEMATNR>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_MAT_MD" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class TMD {

        protected List<ZCNIMATMD> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZCNIMATMD }
         * 
         * 
         */
        public List<ZCNIMATMD> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIMATMD>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}BAPIRET2" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class TRETURN {

        protected List<BAPIRET2> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BAPIRET2 }
         * 
         * 
         */
        public List<BAPIRET2> getItem() {
            if (item == null) {
                item = new ArrayList<BAPIRET2>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_MAT_STOCK" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class TSTOCK {

        protected List<ZCNIMATSTOCK> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZCNIMATSTOCK }
         * 
         * 
         */
        public List<ZCNIMATSTOCK> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIMATSTOCK>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}WERKS_RANG" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class TWERKSSEL {

        protected List<WERKSRANG> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WERKSRANG }
         * 
         * 
         */
        public List<WERKSRANG> getItem() {
            if (item == null) {
                item = new ArrayList<WERKSRANG>();
            }
            return this.item;
        }

    }

}
