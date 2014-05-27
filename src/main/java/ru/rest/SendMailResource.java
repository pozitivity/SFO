package ru.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
@Path("/sendmail")
@Scope("request")
public class SendMailResource {

	@Autowired
	private MailSender mailSender;
	
	@GET
	@Path("sendMailReg")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response sendTestMail(@QueryParam("to") String to, 
			@QueryParam("subject") String subject, 
			@QueryParam("text") String text) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(to);
		mailMessage.setSubject(subject);
		mailMessage.setText(text);
        mailSender.send(mailMessage);
		return Response.ok().build();
	}
}