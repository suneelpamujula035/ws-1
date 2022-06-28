package com.example.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendSimpleEmail(String toEmail, String body, String subject)
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("suneelpamujula@gmail.com");
		message.setTo(toEmail);
		message.setSubject(subject);
		message.setText(body);
		javaMailSender.send(message);
		System.out.println("Mail sended successfully..");
	}
	
	public void sendSimpleEmailToMutipleMails(String[] toEmail, String body, String subject)
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("suneelpamujula@gmail.com");
		message.setTo(toEmail);
		message.setSubject(subject);
		message.setText(body);
		javaMailSender.send(message);
		System.out.println("Mails sended successfully..");
	}

	public void sendEmailWithAttachment(String toEmail, String body, String subject) throws MessagingException 
	{

		MimeMessage mimeMessage = javaMailSender.createMimeMessage();

		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

		mimeMessageHelper.setFrom("suneelpamujula@gmail.com");
		mimeMessageHelper.setTo(toEmail);
		mimeMessageHelper.setText(body);
		mimeMessageHelper.setSubject(subject);

		FileSystemResource fileSystem = new FileSystemResource("C:\\cert\\67487629.jpg");

		mimeMessageHelper.addAttachment(fileSystem.getFilename(), fileSystem);

		javaMailSender.send(mimeMessage);
		System.out.println("Mail with attachment Send...");

	}
	
//	public void sendEmailWithAttachment(String toEmail, String body, String subject)
//			throws IOException, MessagingException {
//		String from = "suneelpamujula@gmail.com";
//		String host = "smtp.gmail.com";
//
//		Properties properties = System.getProperties();
//
//		properties.put("mail.smtp.host", host);
//		properties.put("mail.smtp.port", "465");
//		properties.put("mail.smtp.ssl.enable", "true");
//		properties.put("mail.smtp.auth", "true");
//		Session session = Session.getInstance(properties, new Authenticator() {
//
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication(from, "pqchyulsvupoiyfr");
//			}
//		});
//
//		MimeMessage message = new MimeMessage(session);
//		message.setFrom(from);
//		message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
//		message.setSubject(subject);
//
//		MimeMultipart multipart = new MimeMultipart();
//		String path = "C:\\cert\\67487629.jpg";
//		MimeBodyPart textBodyPart = new MimeBodyPart();
//		MimeBodyPart fileBodyPart = new MimeBodyPart();
//		textBodyPart.setText(body);
//		File file = new File(path);
//		fileBodyPart.attachFile(file);
//		multipart.addBodyPart(fileBodyPart);
//		multipart.addBodyPart(textBodyPart);
//
//		message.setContent(multipart);
//
//		Transport.send(message);
//
//		System.out.println("Mail with attachment sended successfully..");
//	}


}
