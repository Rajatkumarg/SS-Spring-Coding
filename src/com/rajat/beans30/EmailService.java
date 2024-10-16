package com.rajat.beans30;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

	private DataSource dataSource;
	
	@Autowired
	public EmailService(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void sendEmails() {
		System.out.println(this.dataSource.getClass().getName());
		System.out.println(Arrays.toString(dataSource.getEmails()));
	}
}
