
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
 *         &lt;element name="I_BOM" minOccurs="0">
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
 *         &lt;element name="I_TASK" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="I_UPDAT_END" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="I_UPDAT_START" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
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
@XmlRootElement(name = "ZCN_FUNC_LOC_INFO_RFC")
public class ZCNFUNCLOCINFORFC {

    @XmlElement(name = "I_BOM")
    protected String ibom;
    @XmlElement(name = "I_MD")
    protected String imd;
    @XmlElement(name = "I_TASK")
    protected String itask;
    @XmlElement(name = "I_UPDAT_END")
    protected String iupdatend;
    @XmlElement(name = "I_UPDAT_START")
    protected String iupdatstart;
    @XmlElement(name = "T_BOM")
    protected ZCNFUNCLOCINFORFC.TBOM tbom;
    @XmlElement(name = "T_MD")
    protected ZCNFUNCLOCINFORFC.TMD tmd;
    @XmlElement(name = "T_PLAS_PLPO")
    protected ZCNFUNCLOCINFORFC.TPLASPLPO tplasplpo;
    @XmlElement(name = "T_PLKO")
    protected ZCNFUNCLOCINFORFC.TPLKO tplko;
    @XmlElement(name = "T_PLMZ")
    protected ZCNFUNCLOCINFORFC.TPLMZ tplmz;
    @XmlElement(name = "T_RETURN")
    protected ZCNFUNCLOCINFORFC.TRETURN treturn;
    @XmlElement(name = "T_TAPL")
    protected ZCNFUNCLOCINFORFC.TTAPL ttapl;
    @XmlElement(name = "T_TPLNR_SEL")
    protected ZCNFUNCLOCINFORFC.TTPLNRSEL ttplnrsel;
    @XmlElement(name = "T_WERKS_SEL")
    protected ZCNFUNCLOCINFORFC.TWERKSSEL twerkssel;

    /**
     * Gets the value of the ibom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBOM() {
        return ibom;
    }

    /**
     * Sets the value of the ibom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBOM(String value) {
        this.ibom = value;
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
     * Gets the value of the itask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITASK() {
        return itask;
    }

    /**
     * Sets the value of the itask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITASK(String value) {
        this.itask = value;
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
     * Gets the value of the tbom property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFC.TBOM }
     *     
     */
    public ZCNFUNCLOCINFORFC.TBOM getTBOM() {
        return tbom;
    }

    /**
     * Sets the value of the tbom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFC.TBOM }
     *     
     */
    public void setTBOM(ZCNFUNCLOCINFORFC.TBOM value) {
        this.tbom = value;
    }

    /**
     * Gets the value of the tmd property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFC.TMD }
     *     
     */
    public ZCNFUNCLOCINFORFC.TMD getTMD() {
        return tmd;
    }

    /**
     * Sets the value of the tmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFC.TMD }
     *     
     */
    public void setTMD(ZCNFUNCLOCINFORFC.TMD value) {
        this.tmd = value;
    }

    /**
     * Gets the value of the tplasplpo property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFC.TPLASPLPO }
     *     
     */
    public ZCNFUNCLOCINFORFC.TPLASPLPO getTPLASPLPO() {
        return tplasplpo;
    }

    /**
     * Sets the value of the tplasplpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFC.TPLASPLPO }
     *     
     */
    public void setTPLASPLPO(ZCNFUNCLOCINFORFC.TPLASPLPO value) {
        this.tplasplpo = value;
    }

    /**
     * Gets the value of the tplko property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFC.TPLKO }
     *     
     */
    public ZCNFUNCLOCINFORFC.TPLKO getTPLKO() {
        return tplko;
    }

    /**
     * Sets the value of the tplko property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFC.TPLKO }
     *     
     */
    public void setTPLKO(ZCNFUNCLOCINFORFC.TPLKO value) {
        this.tplko = value;
    }

    /**
     * Gets the value of the tplmz property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFC.TPLMZ }
     *     
     */
    public ZCNFUNCLOCINFORFC.TPLMZ getTPLMZ() {
        return tplmz;
    }

    /**
     * Sets the value of the tplmz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFC.TPLMZ }
     *     
     */
    public void setTPLMZ(ZCNFUNCLOCINFORFC.TPLMZ value) {
        this.tplmz = value;
    }

    /**
     * Gets the value of the treturn property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFC.TRETURN }
     *     
     */
    public ZCNFUNCLOCINFORFC.TRETURN getTRETURN() {
        return treturn;
    }

    /**
     * Sets the value of the treturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFC.TRETURN }
     *     
     */
    public void setTRETURN(ZCNFUNCLOCINFORFC.TRETURN value) {
        this.treturn = value;
    }

    /**
     * Gets the value of the ttapl property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFC.TTAPL }
     *     
     */
    public ZCNFUNCLOCINFORFC.TTAPL getTTAPL() {
        return ttapl;
    }

    /**
     * Sets the value of the ttapl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFC.TTAPL }
     *     
     */
    public void setTTAPL(ZCNFUNCLOCINFORFC.TTAPL value) {
        this.ttapl = value;
    }

    /**
     * Gets the value of the ttplnrsel property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFC.TTPLNRSEL }
     *     
     */
    public ZCNFUNCLOCINFORFC.TTPLNRSEL getTTPLNRSEL() {
        return ttplnrsel;
    }

    /**
     * Sets the value of the ttplnrsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFC.TTPLNRSEL }
     *     
     */
    public void setTTPLNRSEL(ZCNFUNCLOCINFORFC.TTPLNRSEL value) {
        this.ttplnrsel = value;
    }

    /**
     * Gets the value of the twerkssel property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNFUNCLOCINFORFC.TWERKSSEL }
     *     
     */
    public ZCNFUNCLOCINFORFC.TWERKSSEL getTWERKSSEL() {
        return twerkssel;
    }

    /**
     * Sets the value of the twerkssel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNFUNCLOCINFORFC.TWERKSSEL }
     *     
     */
    public void setTWERKSSEL(ZCNFUNCLOCINFORFC.TWERKSSEL value) {
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
