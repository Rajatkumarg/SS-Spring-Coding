package com.rajat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import com.rajat.beans16.Student;


@Configuration
public class AppConfig16 {

	@Bean
	@Scope("prototype")
	public Student getStudent() {
		return new Student();
	}
}
