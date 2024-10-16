package com.rajat.app28;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajat.beans28.Person;

public class UsePerson {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig28.class);
		Person p = container.getBean(Person.class);
		System.out.println(p);
	}
}
