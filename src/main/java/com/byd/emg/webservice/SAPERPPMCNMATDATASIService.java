
package com.byd.emg.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SAPERP_PM_CN_MAT_DATA_SIService", targetNamespace = "urn:ERP:DR_PM_MAT_DATA", wsdlLocation = "file:/F:/SAP/SAPERP_PM_CN_MAT_DATA_SIService.wsdl")
public class SAPERPPMCNMATDATASIService
    extends Service
{

    private final static URL SAPERPPMCNMATDATASISERVICE_WSDL_LOCATION;
    private final static WebServiceException SAPERPPMCNMATDATASISERVICE_EXCEPTION;
    private final static QName SAPERPPMCNMATDATASISERVICE_QNAME = new QName("urn:ERP:DR_PM_MAT_DATA", "SAPERP_PM_CN_MAT_DATA_SIService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/F:/SAP/SAPERP_PM_CN_MAT_DATA_SIService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SAPERPPMCNMATDATASISERVICE_WSDL_LOCATION = url;
        SAPERPPMCNMATDATASISERVICE_EXCEPTION = e;
    }

    public SAPERPPMCNMATDATASIService() {
        super(__getWsdlLocation(), SAPERPPMCNMATDATASISERVICE_QNAME);
    }

    public SAPERPPMCNMATDATASIService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SAPERPPMCNMATDATASISERVICE_QNAME, features);
    }

    public SAPERPPMCNMATDATASIService(URL wsdlLocation) {
        super(wsdlLocation, SAPERPPMCNMATDATASISERVICE_QNAME);
    }

    public SAPERPPMCNMATDATASIService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SAPERPPMCNMATDATASISERVICE_QNAME, features);
    }

    public SAPERPPMCNMATDATASIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SAPERPPMCNMATDATASIService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SAPERPPMCNMATDATASI
     */
    @WebEndpoint(name = "HTTP_Port")
    public SAPERPPMCNMATDATASI getHTTPPort() {
        return super.getPort(new QName("urn:ERP:DR_PM_MAT_DATA", "HTTP_Port"), SAPERPPMCNMATDATASI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SAPERPPMCNMATDATASI
     */
    @WebEndpoint(name = "HTTP_Port")
    public SAPERPPMCNMATDATASI getHTTPPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:ERP:DR_PM_MAT_DATA", "HTTP_Port"), SAPERPPMCNMATDATASI.class, features);
    }

    /**
     * 
     * @return
     *     returns SAPERPPMCNMATDATASI
     */
    @WebEndpoint(name = "HTTPS_Port")
    public SAPERPPMCNMATDATASI getHTTPSPort() {
        return super.getPort(new QName("urn:ERP:DR_PM_MAT_DATA", "HTTPS_Port"), SAPERPPMCNMATDATASI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SAPERPPMCNMATDATASI
     */
    @WebEndpoint(name = "HTTPS_Port")
    public SAPERPPMCNMATDATASI getHTTPSPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:ERP:DR_PM_MAT_DATA", "HTTPS_Port"), SAPERPPMCNMATDATASI.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SAPERPPMCNMATDATASISERVICE_EXCEPTION!= null) {
            throw SAPERPPMCNMATDATASISERVICE_EXCEPTION;
        }
        return SAPERPPMCNMATDATASISERVICE_WSDL_LOCATION;
    }

}