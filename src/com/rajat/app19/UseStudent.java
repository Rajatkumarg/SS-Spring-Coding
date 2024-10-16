package com.rajat.app19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.rajat.beans19.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig19.class);
		Student st1 = container.getBean(Student.class);
		st1.display();
	}
}
