package com.rajat.beans17;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("10")
	private int roll;
	
	@Value("Rk")
	private String name;
	
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
