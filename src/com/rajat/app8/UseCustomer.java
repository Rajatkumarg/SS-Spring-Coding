package com.rajat.app8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans8.Customer;


public class UseCustomer {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf8_1.xml");
	Customer c = context.getBean("custObj", Customer.class);
	c.display();

}
}
