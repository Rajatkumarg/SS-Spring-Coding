package com.rajat.app27;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajat.beans27.Person;

public class UsePerson {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig27.class);
		Person p = container.getBean(Person.class);
		System.out.println(p);
	}
}
