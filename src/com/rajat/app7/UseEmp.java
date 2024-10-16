package com.rajat.app7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans7.Emp;

public class UseEmp {
	public static void main(String[] args) {

		// Eager initialization
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/rajat/resources/beanEagerInitConf.xml");
		System.out.println("Container started-1");
		Emp emp = context.getBean(Emp.class);
		System.out.println(emp.getName());

		// Lazy initialization
		System.out.println("-----------------------------------");
		context = new ClassPathXmlApplicationContext("/com/rajat/resources/beanLazyInitConf.xml");
		System.out.println("Container started-2");
		emp = context.getBean(Emp.class);
		System.out.println(emp.getName());
	}
}
