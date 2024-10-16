package com.rajat.beans12;

import org.springframework.stereotype.Component;

@Component//bidefault student bean is created for Student class, i.e bean name starts with lower
public class Student {
	public Student() {
		System.out.println("Creating Student object...");
	}	
	public void display() {
		System.out.println("I'm a Student bean");
	}
}
