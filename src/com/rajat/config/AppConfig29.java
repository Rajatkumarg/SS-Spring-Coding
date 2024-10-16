package com.rajat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.rajat.beans29.Employee;


@Configuration
@ComponentScan("com.rajat.beans29")
public class AppConfig29 {
	
	@Bean
	@Lazy
	public Employee emp() {
		return new Employee(101,"Nk");
	}
}
