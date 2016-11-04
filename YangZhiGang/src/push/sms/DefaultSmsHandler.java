package push.sms;

import push.sms.ISmsHandler;
import push.sms.APISoap_PortType;
import push.sms.MissionResultInfo;
import push.sms.WebServiceUtil;

/** 
 * @author zhangyuan 
 * @version 2014-8-1 下午12:36:59 
 */
public class DefaultSmsHandler implements ISmsHandler{

	@Override
	public MissionResultInfo sendSms(String wsdl, String uid, String pwd, String msg, String mobiles,
			String sendtime) throws Exception {
		APISoap_PortType soap_PortType = WebServiceUtil.Instance().GetSmsWebService(wsdl);
		
		return soap_PortType.sendSms(uid,pwd,msg,mobiles,sendtime);
	}

}



