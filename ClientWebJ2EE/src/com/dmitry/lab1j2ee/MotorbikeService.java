
package com.dmitry.lab1j2ee;

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
@WebServiceClient(name = "MotorbikeService", targetNamespace = "http://lab1J2ee.dmitry.com/", wsdlLocation = "http://desktop-tiide9g:8080/JEE2_web1-13876637809199834880.0-SNAPSHOT/MotorbikeService?wsdl")
public class MotorbikeService
    extends Service
{

    private final static URL MOTORBIKESERVICE_WSDL_LOCATION;
    private final static WebServiceException MOTORBIKESERVICE_EXCEPTION;
    private final static QName MOTORBIKESERVICE_QNAME = new QName("http://lab1J2ee.dmitry.com/", "MotorbikeService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://desktop-tiide9g:8080/JEE2_web1-13876637809199834880.0-SNAPSHOT/MotorbikeService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOTORBIKESERVICE_WSDL_LOCATION = url;
        MOTORBIKESERVICE_EXCEPTION = e;
    }

    public MotorbikeService() {
        super(__getWsdlLocation(), MOTORBIKESERVICE_QNAME);
    }

    public MotorbikeService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOTORBIKESERVICE_QNAME, features);
    }

    public MotorbikeService(URL wsdlLocation) {
        super(wsdlLocation, MOTORBIKESERVICE_QNAME);
    }

    public MotorbikeService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOTORBIKESERVICE_QNAME, features);
    }

    public MotorbikeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MotorbikeService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MotorbikeWebService
     */
    @WebEndpoint(name = "MotorbikeWebServicePort")
    public MotorbikeWebService getMotorbikeWebServicePort() {
        return super.getPort(new QName("http://lab1J2ee.dmitry.com/", "MotorbikeWebServicePort"), MotorbikeWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MotorbikeWebService
     */
    @WebEndpoint(name = "MotorbikeWebServicePort")
    public MotorbikeWebService getMotorbikeWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://lab1J2ee.dmitry.com/", "MotorbikeWebServicePort"), MotorbikeWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOTORBIKESERVICE_EXCEPTION!= null) {
            throw MOTORBIKESERVICE_EXCEPTION;
        }
        return MOTORBIKESERVICE_WSDL_LOCATION;
    }

}
