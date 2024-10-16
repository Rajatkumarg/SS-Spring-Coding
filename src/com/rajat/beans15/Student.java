package com.rajat.beans15;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")//or @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Student {
	public Student() {
		System.out.println("Creating Student object...");
	}
	public void display() {
		System.out.println("I'm a Student bean ");
	}
}
