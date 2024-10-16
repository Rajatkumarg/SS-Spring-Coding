package com.rajat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rajat.beans14.Car;
import com.rajat.beans14.Student;

@Configuration
public class AppConfig14 {

	@Bean("rk")
	public Student student() {//bidefault spring ioc create bean as singleton
		return new Student();
	}
	
	@Bean
	public Car getCar() {
		return new Car();
	}
}
