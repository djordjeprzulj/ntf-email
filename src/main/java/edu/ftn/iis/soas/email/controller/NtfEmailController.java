package edu.ftn.iis.soas.email.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ftn.iis.soas.domain.model.Notification;
import edu.ftn.iis.soas.email.service.NtfEmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/email")
@RequiredArgsConstructor
@Slf4j
public class NtfEmailController {

	private final NtfEmailService ntfEmailService;
	
	@PostMapping("/send")
	public String send(@RequestBody Notification notification) {
		log.info("send request received");
		return ntfEmailService.send(notification);
	}
	
}
