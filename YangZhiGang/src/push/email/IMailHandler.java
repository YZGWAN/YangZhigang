package push.email;

 

/** 
 * @author zhangyuan 
 * @version 2014-8-1 下午12:09:00 
 */
public interface IMailHandler {
	public boolean sendTextMail(MailSenderInfo mailInfo) throws Exception;
}



