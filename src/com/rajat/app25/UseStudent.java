package com.rajat.app25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajat.beans25.Student;

public class UseStudent {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig25.class);
		Student obj = container.getBean(Student.class);
		obj.display();
		System.out.println(obj);
	}
}
