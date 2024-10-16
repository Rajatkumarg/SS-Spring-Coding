package com.rajat.app9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans9.Customer;


public class UseCustomer {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf9.xml");
	Customer c = context.getBean("custObj", Customer.class);
	c.display();

}
}
