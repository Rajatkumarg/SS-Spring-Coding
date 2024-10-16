package com.rajat.app11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans11.Bike;

public class UseBike {
public static void main(String[] args) {
	ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf11.xml");
    Bike bike = container.getBean("bikeObj", Bike.class);
	bike.drive();
	container.close();
	//for calling of init and destroy using annotation, we need to add some changes in xml at parent level
}
}
