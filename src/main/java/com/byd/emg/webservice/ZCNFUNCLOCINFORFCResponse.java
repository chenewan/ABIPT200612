
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
 *         &lt;element name="T_BOM" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_FUNC_LOC_BOM" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_FUNC_LOC_MD" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_PLAS_PLPO" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_FUNC_LOC_PLAS_PLPO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_PLKO" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_FUNC_LOC_PLKO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_PLMZ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_FUNC_LOC_PLMZ" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="T_TAPL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_FUNC_LOC_TAPL" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_TPLNR_SEL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}WCS_TPLNR" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "ZCN_FUNC_LOC_INFO_RFC.Response")
public class ZCNFUNCLOCINFORFCResponse {

    @XmlElement(name = "T_BOM")
    protected ZCNFUNCLOCINFORFCResponse.TBOM tbom;
    @XmlElement(name = "T_MD")
    protected ZCNFUNCLOCINFORFCResponse.TMD tmd;
    @XmlElement(name = "T_PLAS_PLPO")
    protected ZCNFUNCLOCINFORFCResponse.TPLASPLPO tplasplpo;
    @XmlElement(name = "T_PLKO")
    protected ZCNFUNCLOCINFORFCResponse.TPLKO tplko;
    @XmlElement(name = "T_PLMZ")
    protected ZCNFUNCLOCINFORFCResponse.TPLMZ tplmz;
    @XmlElement(name = "T_RETURN")
    protected ZCNFUNCLOCINFORFCResponse.TRETURN treturn;
    @XmlElement(name = "T_TAPL")
    protected ZCNFUNCLOCINFORFCResponse.TTAPL ttapl;
    @XmlElement(name = "T_TPLNR_SEL")
    protected ZCNFUNCLOCINFORFCResponse.TTPLNRSEL ttplnrsel;
    @XmlElement(name = "T_WERKS_SEL")
    protected ZCNFUNCLOCINFORFCResponse.TWERKSSEL twerkssel;

    /**
     * Gets the value of the tbom property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TBOM }
     *     
     */
    public ZCNFUNCLOCINFORFCResponse.TBOM getTBOM() {
        return tbom;
    }

    /**
     * Sets the value of the tbom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TBOM }
     *     
     */
    public void setTBOM(ZCNFUNCLOCINFORFCResponse.TBOM value) {
        this.tbom = value;
    }

    /**
     * Gets the value of the tmd property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TMD }
     *     
     */
    public ZCNFUNCLOCINFORFCResponse.TMD getTMD() {
        return tmd;
    }

    /**
     * Sets the value of the tmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TMD }
     *     
     */
    public void setTMD(ZCNFUNCLOCINFORFCResponse.TMD value) {
        this.tmd = value;
    }

    /**
     * Gets the value of the tplasplpo property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TPLASPLPO }
     *     
     */
    public ZCNFUNCLOCINFORFCResponse.TPLASPLPO getTPLASPLPO() {
        return tplasplpo;
    }

    /**
     * Sets the value of the tplasplpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TPLASPLPO }
     *     
     */
    public void setTPLASPLPO(ZCNFUNCLOCINFORFCResponse.TPLASPLPO value) {
        this.tplasplpo = value;
    }

    /**
     * Gets the value of the tplko property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TPLKO }
     *     
     */
    public ZCNFUNCLOCINFORFCResponse.TPLKO getTPLKO() {
        return tplko;
    }

    /**
     * Sets the value of the tplko property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TPLKO }
     *     
     */
    public void setTPLKO(ZCNFUNCLOCINFORFCResponse.TPLKO value) {
        this.tplko = value;
    }

    /**
     * Gets the value of the tplmz property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TPLMZ }
     *     
     */
    public ZCNFUNCLOCINFORFCResponse.TPLMZ getTPLMZ() {
        return tplmz;
    }

    /**
     * Sets the value of the tplmz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TPLMZ }
     *     
     */
    public void setTPLMZ(ZCNFUNCLOCINFORFCResponse.TPLMZ value) {
        this.tplmz = value;
    }

    /**
     * Gets the value of the treturn property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TRETURN }
     *     
     */
    public ZCNFUNCLOCINFORFCResponse.TRETURN getTRETURN() {
        return treturn;
    }

    /**
     * Sets the value of the treturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TRETURN }
     *     
     */
    public void setTRETURN(ZCNFUNCLOCINFORFCResponse.TRETURN value) {
        this.treturn = value;
    }

    /**
     * Gets the value of the ttapl property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TTAPL }
     *     
     */
    public ZCNFUNCLOCINFORFCResponse.TTAPL getTTAPL() {
        return ttapl;
    }

    /**
     * Sets the value of the ttapl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TTAPL }
     *     
     */
    public void setTTAPL(ZCNFUNCLOCINFORFCResponse.TTAPL value) {
        this.ttapl = value;
    }

    /**
     * Gets the value of the ttplnrsel property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TTPLNRSEL }
     *     
     */
    public ZCNFUNCLOCINFORFCResponse.TTPLNRSEL getTTPLNRSEL() {
        return ttplnrsel;
    }

    /**
     * Sets the value of the ttplnrsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TTPLNRSEL }
     *     
     */
    public void setTTPLNRSEL(ZCNFUNCLOCINFORFCResponse.TTPLNRSEL value) {
        this.ttplnrsel = value;
    }

    /**
     * Gets the value of the twerkssel property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TWERKSSEL }
     *     
     */
    public ZCNFUNCLOCINFORFCResponse.TWERKSSEL getTWERKSSEL() {
        return twerkssel;
    }

    /**
     * Sets the value of the twerkssel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFCResponse.TWERKSSEL }
     *     
     */
    public void setTWERKSSEL(ZCNFUNCLOCINFORFCResponse.TWERKSSEL value) {
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_FUNC_LOC_BOM" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TBOM {

        protected List<ZCNIFUNCLOCBOM> item;

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
         * {@link ZCNIFUNCLOCBOM }
         * 
         * 
         */
        public List<ZCNIFUNCLOCBOM> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIFUNCLOCBOM>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_FUNC_LOC_MD" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<ZCNIFUNCLOCMD> item;

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
         * {@link ZCNIFUNCLOCMD }
         * 
         * 
         */
        public List<ZCNIFUNCLOCMD> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIFUNCLOCMD>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_FUNC_LOC_PLAS_PLPO" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TPLASPLPO {

        protected List<ZCNIFUNCLOCPLASPLPO> item;

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
         * {@link ZCNIFUNCLOCPLASPLPO }
         * 
         * 
         */
        public List<ZCNIFUNCLOCPLASPLPO> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIFUNCLOCPLASPLPO>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_FUNC_LOC_PLKO" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TPLKO {

        protected List<ZCNIFUNCLOCPLKO> item;

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
         * {@link ZCNIFUNCLOCPLKO }
         * 
         * 
         */
        public List<ZCNIFUNCLOCPLKO> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIFUNCLOCPLKO>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_FUNC_LOC_PLMZ" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TPLMZ {

        protected List<ZCNIFUNCLOCPLMZ> item;

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
         * {@link ZCNIFUNCLOCPLMZ }
         * 
         * 
         */
        public List<ZCNIFUNCLOCPLMZ> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIFUNCLOCPLMZ>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_FUNC_LOC_TAPL" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TTAPL {

        protected List<ZCNIFUNCLOCTAPL> item;

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
         * {@link ZCNIFUNCLOCTAPL }
         * 
         * 
         */
        public List<ZCNIFUNCLOCTAPL> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIFUNCLOCTAPL>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}WCS_TPLNR" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TTPLNRSEL {

        protected List<WCSTPLNR> item;

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
         * {@link WCSTPLNR }
         * 
         * 
         */
        public List<WCSTPLNR> getItem() {
            if (item == null) {
                item = new ArrayList<WCSTPLNR>();
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
