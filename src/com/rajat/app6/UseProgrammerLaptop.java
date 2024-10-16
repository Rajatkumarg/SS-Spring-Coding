package com.rajat.app6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans6.Programmer;

public class UseProgrammerLaptop {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext
			("/com/rajat/resources/beanconfig1.xml","/com/rajat/resources/beanconfig2.xml");
	
	Programmer p = context.getBean(Programmer.class);
	System.out.println(p);
	
	//OR import all configuration file in one file
	context = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconfigAll.xml");
	p = context.getBean(Programmer.class);
	System.out.println(p);
}
}
