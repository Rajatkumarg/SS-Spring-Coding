package com.rajat.app29;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajat.beans29.Employee;
import com.rajat.beans29.Student;

public class UseStudent {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig29.class);
		Student s = container.getBean(Student.class);
		System.out.println(s);
		
		Employee e = container.getBean(Employee.class);
		System.out.println(e);
	}
}
