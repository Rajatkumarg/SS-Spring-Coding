package com.rajat.beans27;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name = "Rk";

	//Field injection using Autowired
//	@Autowired
//	private Car car1;
//	OR
    @Autowired
    @Qualifier("car1")
    private Car car;
	
	private House house;
	private Mobile mobile;
	
	public Person() {
		System.out.println("Person contructor called");
	}
	
	//constructor injection through Autowired
	@Autowired
	public Person(@Qualifier("mobile2") Mobile mobile) {
		System.out.println("Parameterised Person constructor called");
		this.mobile = mobile;
	}
	
	//setter injection using Autowired
	@Autowired
	public void setHouse(House house) {
		System.out.println("Setting House");
		this.house = house;
	}
	public String toString() {
		return "Name is "+name+" Car is "+car.carName()+" House is "+house+" Mobile is "+mobile;
	}
}
