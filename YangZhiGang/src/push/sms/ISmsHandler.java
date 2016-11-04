package push.sms;

import push.sms.MissionResultInfo;

/** 
 * @author zhangyuan 
 * @version 2014-8-1 下午12:09:00 
 */
public interface ISmsHandler {
	public MissionResultInfo sendSms(String wsdl,String uid,String pwd,String msg,String mobiles,String sendtime) throws Exception;
}



