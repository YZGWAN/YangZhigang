package push.sms;

import java.util.HashMap;
import java.util.Map;

import push.sms.APILocator;
import push.sms.APISoap_PortType;



public class WebServiceUtil {
	private static WebServiceUtil instance = new WebServiceUtil();

	public synchronized static WebServiceUtil Instance() {
		return instance;
	}

	private static Map<String,APISoap_PortType> smsServiceMap = new HashMap<String, APISoap_PortType>();

	
	public synchronized APISoap_PortType GetSmsWebService(String wsdl) throws Exception {
		if (!smsServiceMap.containsKey(wsdl)) {
			APILocator locator = new APILocator();
			locator.setAPISoap12EndpointAddress(wsdl);
			APISoap_PortType soap_PortType = locator.getAPISoap12();
			smsServiceMap.put(wsdl, soap_PortType);
		}
		return smsServiceMap.get(wsdl);
	}
}
