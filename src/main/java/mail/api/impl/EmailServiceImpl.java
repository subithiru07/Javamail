package mail.api.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import mail.api.entity.EmailDetails;
import mail.api.services.ServicesMail;
@Service
public class EmailServiceImpl implements ServicesMail{
	@Autowired
	private JavaMailSender javaMailSender;
	@Value("$spring.mail.username{}")
	private String sender;

	@Override
	public String sendMail(EmailDetails emailDetails) {
		try {
		SimpleMailMessage messages = new SimpleMailMessage();
		messages.setFrom(sender);
		messages.setTo(emailDetails.getRecipient());
		messages.setSubject(emailDetails.getSubject());
		messages.setText(emailDetails.getMsgBody());
		javaMailSender.send(messages);
		return "Mail sent to....";
		}
		catch (Exception e) {
			System.out.println(e);
			return "Error in sending mail";
		}
		
		
	}

}
