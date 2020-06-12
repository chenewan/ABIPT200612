
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
 *         &lt;element name="I_ACT_WT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="I_COMP" minOccurs="0">
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
 *         &lt;element name="I_OPR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="I_PL_WT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="I_UPDAT_END" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="I_UPDAT_START" type="{urn:sap-com:document:sap:rfc:functions}date" minOccurs="0"/>
 *         &lt;element name="T_ACT_WT" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_ORDER_ACT_WT" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_AUFNR_SEL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}RANGE_AUFNR" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_COMP" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_ORDER_COMP" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_ILART_SEL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}RSLSTAR" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_ORDER_MD" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_OPR" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_ORDER_OPR" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="T_PL_WT" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_ORDER_PL_WT" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "ZCN_ORDER_INFO_RFC")
public class ZCNORDERINFORFC {

    @XmlElement(name = "I_ACT_WT")
    protected String iactwt;
    @XmlElement(name = "I_COMP")
    protected String icomp;
    @XmlElement(name = "I_MD")
    protected String imd;
    @XmlElement(name = "I_OPR")
    protected String iopr;
    @XmlElement(name = "I_PL_WT")
    protected String iplwt;
    @XmlElement(name = "I_UPDAT_END")
    protected String iupdatend;
    @XmlElement(name = "I_UPDAT_START")
    protected String iupdatstart;
    @XmlElement(name = "T_ACT_WT")
    protected ZCNORDERINFORFC.TACTWT tactwt;
    @XmlElement(name = "T_AUFNR_SEL")
    protected ZCNORDERINFORFC.TAUFNRSEL taufnrsel;
    @XmlElement(name = "T_COMP")
    protected ZCNORDERINFORFC.TCOMP tcomp;
    @XmlElement(name = "T_ILART_SEL")
    protected ZCNORDERINFORFC.TILARTSEL tilartsel;
    @XmlElement(name = "T_MD")
    protected ZCNORDERINFORFC.TMD tmd;
    @XmlElement(name = "T_OPR")
    protected ZCNORDERINFORFC.TOPR topr;
    @XmlElement(name = "T_PL_WT")
    protected ZCNORDERINFORFC.TPLWT tplwt;
    @XmlElement(name = "T_RETURN")
    protected ZCNORDERINFORFC.TRETURN treturn;
    @XmlElement(name = "T_WERKS_SEL")
    protected ZCNORDERINFORFC.TWERKSSEL twerkssel;

    /**
     * Gets the value of the iactwt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIACTWT() {
        return iactwt;
    }

    /**
     * Sets the value of the iactwt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIACTWT(String value) {
        this.iactwt = value;
    }

    /**
     * Gets the value of the icomp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICOMP() {
        return icomp;
    }

    /**
     * Sets the value of the icomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICOMP(String value) {
        this.icomp = value;
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
     * Gets the value of the iopr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIOPR() {
        return iopr;
    }

    /**
     * Sets the value of the iopr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIOPR(String value) {
        this.iopr = value;
    }

    /**
     * Gets the value of the iplwt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPLWT() {
        return iplwt;
    }

    /**
     * Sets the value of the iplwt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPLWT(String value) {
        this.iplwt = value;
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
     * Gets the value of the tactwt property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNORDERINFORFC.TACTWT }
     *     
     */
    public ZCNORDERINFORFC.TACTWT getTACTWT() {
        return tactwt;
    }

    /**
     * Sets the value of the tactwt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNORDERINFORFC.TACTWT }
     *     
     */
    public void setTACTWT(ZCNORDERINFORFC.TACTWT value) {
        this.tactwt = value;
    }

    /**
     * Gets the value of the taufnrsel property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNORDERINFORFC.TAUFNRSEL }
     *     
     */
    public ZCNORDERINFORFC.TAUFNRSEL getTAUFNRSEL() {
        return taufnrsel;
    }

    /**
     * Sets the value of the taufnrsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNORDERINFORFC.TAUFNRSEL }
     *     
     */
    public void setTAUFNRSEL(ZCNORDERINFORFC.TAUFNRSEL value) {
        this.taufnrsel = value;
    }

    /**
     * Gets the value of the tcomp property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNORDERINFORFC.TCOMP }
     *     
     */
    public ZCNORDERINFORFC.TCOMP getTCOMP() {
        return tcomp;
    }

    /**
     * Sets the value of the tcomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNORDERINFORFC.TCOMP }
     *     
     */
    public void setTCOMP(ZCNORDERINFORFC.TCOMP value) {
        this.tcomp = value;
    }

    /**
     * Gets the value of the tilartsel property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNORDERINFORFC.TILARTSEL }
     *     
     */
    public ZCNORDERINFORFC.TILARTSEL getTILARTSEL() {
        return tilartsel;
    }

    /**
     * Sets the value of the tilartsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNORDERINFORFC.TILARTSEL }
     *     
     */
    public void setTILARTSEL(ZCNORDERINFORFC.TILARTSEL value) {
        this.tilartsel = value;
    }

    /**
     * Gets the value of the tmd property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNORDERINFORFC.TMD }
     *     
     */
    public ZCNORDERINFORFC.TMD getTMD() {
        return tmd;
    }

    /**
     * Sets the value of the tmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNORDERINFORFC.TMD }
     *     
     */
    public void setTMD(ZCNORDERINFORFC.TMD value) {
        this.tmd = value;
    }

    /**
     * Gets the value of the topr property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNORDERINFORFC.TOPR }
     *     
     */
    public ZCNORDERINFORFC.TOPR getTOPR() {
        return topr;
    }

    /**
     * Sets the value of the topr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNORDERINFORFC.TOPR }
     *     
     */
    public void setTOPR(ZCNORDERINFORFC.TOPR value) {
        this.topr = value;
    }

    /**
     * Gets the value of the tplwt property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNORDERINFORFC.TPLWT }
     *     
     */
    public ZCNORDERINFORFC.TPLWT getTPLWT() {
        return tplwt;
    }

    /**
     * Sets the value of the tplwt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNORDERINFORFC.TPLWT }
     *     
     */
    public void setTPLWT(ZCNORDERINFORFC.TPLWT value) {
        this.tplwt = value;
    }

    /**
     * Gets the value of the treturn property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNORDERINFORFC.TRETURN }
     *     
     */
    public ZCNORDERINFORFC.TRETURN getTRETURN() {
        return treturn;
    }

    /**
     * Sets the value of the treturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNORDERINFORFC.TRETURN }
     *     
     */
    public void setTRETURN(ZCNORDERINFORFC.TRETURN value) {
        this.treturn = value;
    }

    /**
     * Gets the value of the twerkssel property.
     * 
     * @return
     *     possible object is
     *     {@link ZCNORDERINFORFC.TWERKSSEL }
     *     
     */
    public ZCNORDERINFORFC.TWERKSSEL getTWERKSSEL() {
        return twerkssel;
    }

    /**
     * Sets the value of the twerkssel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCNORDERINFORFC.TWERKSSEL }
     *     
     */
    public void setTWERKSSEL(ZCNORDERINFORFC.TWERKSSEL value) {
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_ORDER_ACT_WT" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TACTWT {

        protected List<ZCNIORDERACTWT> item;

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
         * {@link ZCNIORDERACTWT }
         * 
         * 
         */
        public List<ZCNIORDERACTWT> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIORDERACTWT>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}RANGE_AUFNR" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TAUFNRSEL {

        protected List<RANGEAUFNR> item;

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
         * {@link RANGEAUFNR }
         * 
         * 
         */
        public List<RANGEAUFNR> getItem() {
            if (item == null) {
                item = new ArrayList<RANGEAUFNR>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_ORDER_COMP" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TCOMP {

        protected List<ZCNIORDERCOMP> item;

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
         * {@link ZCNIORDERCOMP }
         * 
         * 
         */
        public List<ZCNIORDERCOMP> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIORDERCOMP>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}RSLSTAR" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TILARTSEL {

        protected List<RSLSTAR> item;

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
         * {@link RSLSTAR }
         * 
         * 
         */
        public List<RSLSTAR> getItem() {
            if (item == null) {
                item = new ArrayList<RSLSTAR>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_ORDER_MD" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<ZCNIORDERMD> item;

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
         * {@link ZCNIORDERMD }
         * 
         * 
         */
        public List<ZCNIORDERMD> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIORDERMD>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_ORDER_OPR" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TOPR {

        protected List<ZCNIORDEROPR> item;

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
         * {@link ZCNIORDEROPR }
         * 
         * 
         */
        public List<ZCNIORDEROPR> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIORDEROPR>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZCNI_ORDER_PL_WT" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class TPLWT {

        protected List<ZCNIORDERPLWT> item;

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
         * {@link ZCNIORDERPLWT }
         * 
         * 
         */
        public List<ZCNIORDERPLWT> getItem() {
            if (item == null) {
                item = new ArrayList<ZCNIORDERPLWT>();
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
