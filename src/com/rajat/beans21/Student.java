package com.rajat.beans21;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("${student.roll}")
	private int roll;
	
	@Value("${student.name}")
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
