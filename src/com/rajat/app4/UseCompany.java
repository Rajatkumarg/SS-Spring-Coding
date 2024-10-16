package com.rajat.app4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans4.Company;

public class UseCompany {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf4.xml");
	Company company = context.getBean("compId1",Company.class);
	System.out.println(company);
	company = context.getBean("compObj2",Company.class);
	System.out.println(company);
}
}
