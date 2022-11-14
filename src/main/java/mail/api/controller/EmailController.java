package mail.api.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mail.api.entity.EmailDetails;
import mail.api.services.ServicesMail;

@RestController
public class EmailController {
	@Autowired
	ServicesMail service;
	@PostMapping("/sendmail")
	public String sendMial(@RequestBody EmailDetails details) {
		
		System.out.println("Controller");
		
		String status = service.sendMail(details);
		return status;
	}

}
