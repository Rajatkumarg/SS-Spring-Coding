package com.rajat.app5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans5.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf5.xml");
		Student obj = context.getBean("stdObj3",Student.class);
		System.out.println(obj);
		
		context = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf6.xml");
		obj = context.getBean("stdObj2",Student.class);
		System.out.println(obj);
	}
}
