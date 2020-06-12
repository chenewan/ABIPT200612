
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
@WebServiceClient(name = "SAPERP_PM_CN_FUNC_LOC_DATA_SIService", targetNamespace = "urn:ERP:DR_PM_FUNC_LOC_DATA", wsdlLocation = "file:/F:/SAP/SAPERP_PM_CN_FUNC_LOC_DATA_SIService.wsdl")
public class SAPERPPMCNFUNCLOCDATASIService
    extends Service
{

    private final static URL SAPERPPMCNFUNCLOCDATASISERVICE_WSDL_LOCATION;
    private final static WebServiceException SAPERPPMCNFUNCLOCDATASISERVICE_EXCEPTION;
    private final static QName SAPERPPMCNFUNCLOCDATASISERVICE_QNAME = new QName("urn:ERP:DR_PM_FUNC_LOC_DATA", "SAPERP_PM_CN_FUNC_LOC_DATA_SIService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/F:/SAP/SAPERP_PM_CN_FUNC_LOC_DATA_SIService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SAPERPPMCNFUNCLOCDATASISERVICE_WSDL_LOCATION = url;
        SAPERPPMCNFUNCLOCDATASISERVICE_EXCEPTION = e;
    }

    public SAPERPPMCNFUNCLOCDATASIService() {
        super(__getWsdlLocation(), SAPERPPMCNFUNCLOCDATASISERVICE_QNAME);
    }

    public SAPERPPMCNFUNCLOCDATASIService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SAPERPPMCNFUNCLOCDATASISERVICE_QNAME, features);
    }

    public SAPERPPMCNFUNCLOCDATASIService(URL wsdlLocation) {
        super(wsdlLocation, SAPERPPMCNFUNCLOCDATASISERVICE_QNAME);
    }

    public SAPERPPMCNFUNCLOCDATASIService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SAPERPPMCNFUNCLOCDATASISERVICE_QNAME, features);
    }

    public SAPERPPMCNFUNCLOCDATASIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SAPERPPMCNFUNCLOCDATASIService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SAPERPPMCNFUNCLOCDATASI
     */
    @WebEndpoint(name = "HTTP_Port")
    public SAPERPPMCNFUNCLOCDATASI getHTTPPort() {
        return super.getPort(new QName("urn:ERP:DR_PM_FUNC_LOC_DATA", "HTTP_Port"), SAPERPPMCNFUNCLOCDATASI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SAPERPPMCNFUNCLOCDATASI
     */
    @WebEndpoint(name = "HTTP_Port")
    public SAPERPPMCNFUNCLOCDATASI getHTTPPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:ERP:DR_PM_FUNC_LOC_DATA", "HTTP_Port"), SAPERPPMCNFUNCLOCDATASI.class, features);
    }

    /**
     * 
     * @return
     *     returns SAPERPPMCNFUNCLOCDATASI
     */
    @WebEndpoint(name = "HTTPS_Port")
    public SAPERPPMCNFUNCLOCDATASI getHTTPSPort() {
        return super.getPort(new QName("urn:ERP:DR_PM_FUNC_LOC_DATA", "HTTPS_Port"), SAPERPPMCNFUNCLOCDATASI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SAPERPPMCNFUNCLOCDATASI
     */
    @WebEndpoint(name = "HTTPS_Port")
    public SAPERPPMCNFUNCLOCDATASI getHTTPSPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:ERP:DR_PM_FUNC_LOC_DATA", "HTTPS_Port"), SAPERPPMCNFUNCLOCDATASI.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SAPERPPMCNFUNCLOCDATASISERVICE_EXCEPTION!= null) {
            throw SAPERPPMCNFUNCLOCDATASISERVICE_EXCEPTION;
        }
        return SAPERPPMCNFUNCLOCDATASISERVICE_WSDL_LOCATION;
    }

}