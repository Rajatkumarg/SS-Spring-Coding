package com.rajat.app13;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajat.beans13.Car;
import com.rajat.beans13.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig13.class);
		Student st = container.getBean("student",Student.class);
		st.display();
		Car car = (Car)container.getBean("mycar");
		car.display();
	}
}
