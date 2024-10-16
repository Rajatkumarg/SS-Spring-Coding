package com.rajat.beans19;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	

	private int roll;
	private String name;
	
//	@Value("11")
//	public void setRoll(int roll) {
//		System.out.println("Setting roll "+roll);
//		this.roll = roll;
//	}
//	@Value("Nk")
//	public void setName(String name) {
//		System.out.println("Setting name "+name);
//		this.name = name;
//	}
	
	@Value("12")
	public void setData(int roll, @Value("Mk") String name) {
		System.out.println("Setting data "+roll+"  "+name);
		this.roll = roll;
		this.name = name;
	}
	
	public Student() {
		System.out.println("Creating Student object...");
	}	
	public void display() {
		System.out.println("I'm a Student bean "+this);
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
}
