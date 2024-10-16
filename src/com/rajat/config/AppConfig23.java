package com.rajat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rajat.beans23.Student;


@Configuration
@ComponentScan("com.rajat.beans23")
public class AppConfig23 {

	@Bean("st1")
	public Student student1() {
		return new Student(1,"Ram");
	}
	
	@Bean("st2")
	public Student student2() {
		return new Student(2,"Shyam");
	}
}
