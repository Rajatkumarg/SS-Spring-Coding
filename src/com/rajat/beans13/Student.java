package com.rajat.beans13;

import org.springframework.stereotype.Component;

@Component
public class Student {
	public Student() {
		System.out.println("Creating Student object...");
	}	
	public void display() {
		System.out.println("I'm a Student bean ");
	}
}
