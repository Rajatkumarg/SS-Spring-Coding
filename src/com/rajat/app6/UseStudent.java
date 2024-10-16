package com.rajat.app6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans6.Student;
//p-namespace in xml
public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf7.xml");
		Student obj = context.getBean("stdObj1",Student.class);
		System.out.println(obj);
		
		obj = context.getBean("stdObj2",Student.class);
		System.out.println(obj);
		
		obj = context.getBean("stdObj3",Student.class);
		System.out.println(obj);
		
		obj = context.getBean("stdObj4",Student.class);
		System.out.println(obj);
		
		obj = context.getBean("stdObj5",Student.class);
		System.out.println(obj);
		
		obj = context.getBean("stdObj6",Student.class);
		System.out.println(obj);
		
	}
}
