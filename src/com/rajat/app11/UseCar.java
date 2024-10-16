package com.rajat.app11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans10.Customer;
import com.rajat.beans11.Car;


public class UseCar {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf11.xml");
	Car c = context.getBean("carObj", Car.class);
	c.drive();
	System.out.println("---------------");
	//To shutdown container
	ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf11.xml");
	c = container.getBean("carObj", Car.class);
	c.drive();
//	container.close(); OR
	container.registerShutdownHook();//destroy related method called on close with JVM 
}
}
