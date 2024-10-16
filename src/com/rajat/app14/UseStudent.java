package com.rajat.app14;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajat.beans14.Car;
import com.rajat.beans14.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig14.class);
		Student st = container.getBean("rk",Student.class);
		st.display();
		Car car = (Car)container.getBean("getCar");
		car.display();
	}
}
