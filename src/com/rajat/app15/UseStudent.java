package com.rajat.app15;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajat.beans15.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig15.class);
		Student st1 = container.getBean("student",Student.class);
		Student st2 = container.getBean("student",Student.class);
		st1.display();
		st2.display();
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println("objects are equal ? "+(st1==st2));
	}
}
