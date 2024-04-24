package edu.ftn.iis.soas.email.service.impl;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import edu.ftn.iis.soas.domain.model.Notification;
import edu.ftn.iis.soas.email.service.NtfEmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class NtfEmailServiceImpl implements NtfEmailService {

	private final JavaMailSender javaMailSender;
	
	@Override
	public String send(Notification notification) {
		
		log.info("notification to be sent by email");
		
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(notification.getDestination());
        message.setSubject("Test Email");
        message.setText(notification.getPayload());

		javaMailSender.send(message);
		log.info("email sent successfully to " + notification.getDestination());
		return "OK";
	}

}
