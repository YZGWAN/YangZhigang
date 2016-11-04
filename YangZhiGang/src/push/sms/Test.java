package push.sms;

import push.sms.ISmsHandler;
import push.sms.DefaultSmsHandler;
import push.sms.MissionResultInfo;

public class Test {
	private static final String server = "http://202.85.214.57:8087/service/sms/api.asmx";
	private static final String user = "博锐尚格";
	private static final String password = "persagy_2014";
	private static final String sign = "商户服务平台";

	public static void main(String[] args) throws Exception {
		String s = "亲爱的租户，您的电剩余量不足，请及时缴费，当前剩余量54455.5【商户缴费平台】";
		ISmsHandler handler = new DefaultSmsHandler();
		MissionResultInfo missionResultInfo = handler.sendSms(server,user,password,s,"15311118021","");
		if("0".equals(missionResultInfo.getStatus().getValue())){//成功
			System.out.println(missionResultInfo.getStatus());
		}
		
	}
}
