package com.rajat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.rajat.beans27.Car;
import com.rajat.beans27.House;
import com.rajat.beans27.Mobile;

@Configuration
@ComponentScan("com.rajat.beans27")
public class AppConfig27 {

	@Bean
	public Car car1() {
		System.out.println("car1 constructor called");
		return new Car();
	}
	@Bean
	public Car car2() {
		System.out.println("car2 constructor called");
		return new Car();
	}
	
	@Bean
	public Mobile mobile1() {
		return new Mobile();
	}
	
	@Bean
	public Mobile mobile2() {
		return new Mobile();
	}
	
	@Bean
	public House house1() {
		return new House();
	}
	
	@Bean
	@Primary
	public House house2() {
		return new House();
	}
	
}
