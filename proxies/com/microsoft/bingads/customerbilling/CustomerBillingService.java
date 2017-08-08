
package com.microsoft.bingads.customerbilling;

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
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CustomerBillingService", targetNamespace = "https://bingads.microsoft.com/Billing/v9", wsdlLocation = "https://clientcenter.api.sandbox.bingads.microsoft.com/Api/Billing/v9/CustomerBillingService.svc?wsdl")
public class CustomerBillingService
    extends Service
{

    private final static URL CUSTOMERBILLINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException CUSTOMERBILLINGSERVICE_EXCEPTION;
    private final static QName CUSTOMERBILLINGSERVICE_QNAME = new QName("https://bingads.microsoft.com/Billing/v9", "CustomerBillingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://clientcenter.api.sandbox.bingads.microsoft.com/Api/Billing/v9/CustomerBillingService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERBILLINGSERVICE_WSDL_LOCATION = url;
        CUSTOMERBILLINGSERVICE_EXCEPTION = e;
    }

    public CustomerBillingService() {
        super(__getWsdlLocation(), CUSTOMERBILLINGSERVICE_QNAME);
    }

    public CustomerBillingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ICustomerBillingService
     */
    @WebEndpoint(name = "BasicHttpBinding_ICustomerBillingService")
    public ICustomerBillingService getBasicHttpBindingICustomerBillingService() {
        return super.getPort(new QName("https://bingads.microsoft.com/Billing/v9", "BasicHttpBinding_ICustomerBillingService"), ICustomerBillingService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICustomerBillingService
     */
    @WebEndpoint(name = "BasicHttpBinding_ICustomerBillingService")
    public ICustomerBillingService getBasicHttpBindingICustomerBillingService(WebServiceFeature... features) {
        return super.getPort(new QName("https://bingads.microsoft.com/Billing/v9", "BasicHttpBinding_ICustomerBillingService"), ICustomerBillingService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERBILLINGSERVICE_EXCEPTION!= null) {
            throw CUSTOMERBILLINGSERVICE_EXCEPTION;
        }
        return CUSTOMERBILLINGSERVICE_WSDL_LOCATION;
    }

}
