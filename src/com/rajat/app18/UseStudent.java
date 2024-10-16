package com.rajat.app18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.rajat.beans18.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig18.class);
		Student st1 = container.getBean("student",Student.class);
		st1.display();
	}
}