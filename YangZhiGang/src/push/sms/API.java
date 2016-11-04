/**
 * API.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package push.sms;

public interface API extends javax.xml.rpc.Service {
    public java.lang.String getAPISoapAddress();

    public push.sms.APISoap_PortType getAPISoap() throws javax.xml.rpc.ServiceException;

    public push.sms.APISoap_PortType getAPISoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getAPISoap12Address();

    public push.sms.APISoap_PortType getAPISoap12() throws javax.xml.rpc.ServiceException;

    public push.sms.APISoap_PortType getAPISoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
