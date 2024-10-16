package com.rajat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rajat.beans28.Car;
import com.rajat.beans28.Person;

@Configuration
public class AppConfig28 {

//	@Bean
//	public Person person() {
//		return new Person(car(),"RK");
//	}
	//OR
	@Bean
	public Person person(Car c) {
		return new Person(c,"RK");
	}
	
	@Bean
	public Car car() {
		return new Car("Ferrari");
	}
	
	
	
}
