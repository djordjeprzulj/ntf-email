package edu.ftn.iis.soas.email.service;

import edu.ftn.iis.soas.domain.model.Notification;

public interface NtfEmailService {

	String send(Notification notification);
	
}
