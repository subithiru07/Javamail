package mail.api.services;

import org.springframework.stereotype.Service;

import mail.api.entity.EmailDetails;
@Service
public interface ServicesMail {
	
	public String sendMail(EmailDetails emailDetails);

}
