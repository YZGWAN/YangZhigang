package push.email;

import java.io.File;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

public class Test {

	public static void main(String[] args) throws MessagingException {
		Test test = new Test();

		// 发送邮件中插入图片
		String rootPath = test.getClass().getResource("/").getFile().toString();
		Multipart multipart = new MimeMultipart("mixed");
		MimeBodyPart image = new MimeBodyPart();
		image.setDataHandler(new DataHandler(
				new FileDataSource(new File(rootPath + "/com/persagy/business/service/common/push/persagy.png"))));
		image.setContentID("000");

		String text = "邮件内容字符串<img src='cid:000'>";

		MimeBodyPart html = new MimeBodyPart();
		html.setContent(text, "text/html;charset=UTF-8");

		multipart.addBodyPart(html);
		multipart.addBodyPart(image);

		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.persagy.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);

		// 邮箱用户名
		mailInfo.setUserName("yangzhigang@persagy.com");
		// 邮箱密码
		mailInfo.setPassword("yang12345");
		// 发件人邮箱
		mailInfo.setFromAddress("yangzhigang@persagy.com");
		// 收件人邮箱
		mailInfo.setToAddress("979096609@qq.com");
		// 邮件标题
		mailInfo.setSubject("报警信息");

		mailInfo.setContent(multipart);

		DefaultMailHandler.sendHtmlMailAffix(mailInfo);
	}
}
