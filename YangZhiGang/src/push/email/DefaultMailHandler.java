package push.email;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

 
public class DefaultMailHandler implements IMailHandler{

	public boolean sendTextMail(MailSenderInfo mailInfo) {
		// 判断是否需要身份认证
		MyAuthenticator authenticator = null;
		Properties pro = mailInfo.getProperties();
		if (mailInfo.isValidate()) {
			// 如果需要身份认证，则创建一个密码验证器
			authenticator = new MyAuthenticator(mailInfo.getUserName(),
					mailInfo.getPassword());
		}
		// 根据邮件会话属性和密码验证器构造一个发送邮件的session
		Session sendMailSession = Session
				.getDefaultInstance(pro, authenticator);
		try {
			// 根据session创建一个邮件消息
			Message mailMessage = new MimeMessage(sendMailSession);
			// 创建邮件发送者地址
			Address from = new InternetAddress(mailInfo.getFromAddress());
			// 设置邮件消息的发送者
			mailMessage.setFrom(from);
			// 创建邮件的接收者地址，并设置到邮件消息中
			Address to = new InternetAddress(mailInfo.getToAddress());
			mailMessage.setRecipient(Message.RecipientType.TO, to);
			// 设置邮件消息的主题
//			String charset = mailInfo.getAttachFileNameCharset();
//			BASE64Encoder encoder = new BASE64Encoder();
//			mailMessage.setSubject("=?" + (charset == null ? "utf-8" : charset) + "?B?" + encoder.encode(mailInfo.getSubject().getBytes()) + "?=");
			mailMessage.setSubject(MimeUtility.encodeText(mailInfo.getSubject(), "UTF-8", "B"));
			// 设置邮件消息发送的时间
			mailMessage.setSentDate(new Date());
			// 设置邮件消息的主要内容
			Multipart mailContent = mailInfo.getContent();
			mailMessage.setContent(mailContent);
			// 发送邮件
			Transport.send(mailMessage);
			return true;
		} catch (MessagingException ex) {
			ex.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean sendHtmlMail(MailSenderInfo mailInfo) {
		// 判断是否需要身份认证
		MyAuthenticator authenticator = null;
		Properties pro = mailInfo.getProperties();
		// 如果需要身份认证，则创建一个密码验证器
		if (mailInfo.isValidate()) {
			authenticator = new MyAuthenticator(mailInfo.getUserName(),
					mailInfo.getPassword());
		}
		// 根据邮件会话属性和密码验证器构造一个发送邮件的session
		Session sendMailSession = Session
				.getDefaultInstance(pro, authenticator);
		try {
			// 根据session创建一个邮件消息
			Message mailMessage = new MimeMessage(sendMailSession);
			// 创建邮件发送者地址
			Address from = new InternetAddress(mailInfo.getFromAddress());
			// 设置邮件消息的发送者
			mailMessage.setFrom(from);
			// 创建邮件的接收者地址，并设置到邮件消息中
			Address to = new InternetAddress(mailInfo.getToAddress());
			// Message.RecipientType.TO属性表示接收者的类型为TO
			mailMessage.setRecipient(Message.RecipientType.TO, to);
			// 设置邮件消息的主题
//			String charset = mailInfo.getAttachFileNameCharset();
//			BASE64Encoder encoder = new BASE64Encoder();
//			mailMessage.setSubject("=?" + (charset == null ? "utf-8" : charset) + "?B?" + encoder.encode(mailInfo.getSubject().getBytes()) + "?=");
			mailMessage.setSubject(MimeUtility.encodeText(mailInfo.getSubject(), "UTF-8", "B"));
			// 设置邮件消息发送的时间
			mailMessage.setSentDate(new Date());
			// MiniMultipart类是一个容器类，包含MimeBodyPart类型的对象
			Multipart mainPart = new MimeMultipart();
			// 创建一个包含HTML内容的MimeBodyPart
			BodyPart html = new MimeBodyPart();
			// 设置HTML内容
			html.setContent(mailInfo.getContent(), "text/html; charset=utf-8");
			mainPart.addBodyPart(html);
			// 将MiniMultipart对象设置为邮件内容
			mailMessage.setContent(mainPart);
			// 发送邮件
			Transport.send(mailMessage);
			return true;
		} catch (MessagingException ex) {
			ex.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * @desc 带附件
	 * @param mailInfo
	 * @return
	 */
	public static boolean sendHtmlMailAffix(MailSenderInfo mailInfo) {
		// 判断是否需要身份认证
		MyAuthenticator authenticator = null;
		Properties pro = mailInfo.getProperties();
		// 如果需要身份认证，则创建一个密码验证器
		if (mailInfo.isValidate()) {
			authenticator = new MyAuthenticator(mailInfo.getUserName(),
					mailInfo.getPassword());
		}
		// 根据邮件会话属性和密码验证器构造一个发送邮件的session
		Session sendMailSession = Session
		.getDefaultInstance(pro, authenticator);
		try {
			// 根据session创建一个邮件消息
			Message mailMessage = new MimeMessage(sendMailSession);
			// 创建邮件发送者地址
			Address from = new InternetAddress(mailInfo.getFromAddress());
			// 设置邮件消息的发送者
			mailMessage.setFrom(from);
			// 创建邮件的接收者地址，并设置到邮件消息中
			Address to = new InternetAddress(mailInfo.getToAddress());
			// Message.RecipientType.TO属性表示接收者的类型为TO
			mailMessage.setRecipient(Message.RecipientType.TO, to);
			// 设置邮件消息的主题
//			String charset = mailInfo.getAttachFileNameCharset();
//			BASE64Encoder encoder = new BASE64Encoder();
//			mailMessage.setSubject("=?" + (charset == null ? "utf-8" : charset) + "?B?" + encoder.encode(mailInfo.getSubject().getBytes()) + "?=");
			mailMessage.setSubject(MimeUtility.encodeText(mailInfo.getSubject(), "UTF-8", "B"));
			// 设置邮件消息发送的时间
			mailMessage.setSentDate(new Date());
			// MiniMultipart类是一个容器类，包含MimeBodyPart类型的对象
			Multipart mainPart = new MimeMultipart();
			// 创建一个包含HTML内容的MimeBodyPart
			BodyPart html = new MimeBodyPart();
			
			// 设置HTML内容
			html.setContent(mailInfo.getContent(), "text/html; charset=utf-8");
			mainPart.addBodyPart(html);
			//添加附件
			 // 邮件附件的文件名
			String[] attachFileNames = mailInfo.getAttachFileNames();
			 // 邮件附件的地址
			String[] attachFilePaths = mailInfo.getAttachFilePaths();
			if(attachFilePaths != null) {
				int len = attachFilePaths.length;
				for (int i = 0; i < len; i++) {
					BodyPart attachBodyPart = new MimeBodyPart();
					String attachFilePath = attachFilePaths[i];
					String attachFileName = attachFileNames[i];
					DataSource source = new FileDataSource(attachFilePath);
					attachBodyPart.setDataHandler(new DataHandler(source));
//					String prefix = ;
					//添加附件的标题
					//这里很重要，通过下面的Base64编码的转换可以保证你的中文附件标题名在发送时不会变成乱码
//					attachBodyPart.setFileName("=?" + (charset == null ? "utf-8" : charset) + "?B?" + encoder.encode(attachFileName.getBytes()) + "?=");
					attachBodyPart.setFileName(MimeUtility.encodeText(attachFileName, "UTF-8", "B"));
					mainPart.addBodyPart(attachBodyPart);
				}
			}
			
			// 将MiniMultipart对象设置为邮件内容
			mailMessage.setContent(mainPart);
			// 发送邮件
			Transport.send(mailMessage);
			return true;
		} catch (MessagingException ex) {
			ex.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return false;
	}
}