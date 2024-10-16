package com.rajat.app4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans4.Customer;

public class UseCustomer {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf4.xml");
		Customer cust = null;
		for (int i = 1; i <= 2; i++) {
			cust = context.getBean("custId" + i, Customer.class);
			System.out.println(cust.getName());
			System.out.println(cust.getAcc().getAcctId());
			System.out.println(cust.getAcc().getBalance());
		}
	}
}
