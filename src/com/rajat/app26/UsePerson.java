package com.rajat.app26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajat.beans26.Person;

public class UsePerson {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig26.class);
		Person p = container.getBean(Person.class);
		System.out.println(p);
	}
}
