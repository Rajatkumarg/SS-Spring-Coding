package com.rajat.app30;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajat.beans30.EmailService;

public class UseEmailService {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig30.class);
		EmailService emailService = container.getBean(EmailService.class);
		emailService.sendEmails();
	}
}
