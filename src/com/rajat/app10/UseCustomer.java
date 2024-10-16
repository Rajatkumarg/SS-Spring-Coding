package com.rajat.app10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans10.Customer;


public class UseCustomer {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf10.xml");
	Customer c = context.getBean("custObj", Customer.class);
	c.display();

}
}
