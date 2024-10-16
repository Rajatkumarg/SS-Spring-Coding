package com.rajat.app12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajat.beans12.Car;
import com.rajat.beans12.Student;

public class UseStudent {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.register(com.rajat.beans12.Student.class);//tell spring that Student class has to be managed by container
		container.register(com.rajat.beans12.Car.class);
		container.refresh();//initialize container so that container create student bean and perform DI
		Student st = container.getBean("student",Student.class);
		st.display();
		Car car = (Car)container.getBean("mycar");
		car.display();
	}
}
