package com.rajat.app4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans4.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf4.xml");
		Student obj = context.getBean("stdObj1",Student.class);
		System.out.println(obj);
		obj = context.getBean("stdObj2",Student.class);
		System.out.println(obj);
		obj.getSubjectMarksMap().forEach((k,v)->System.out.println(k+" "+v));
		
		//from util xml config
		context = new ClassPathXmlApplicationContext("/com/rajat/resources/utilBean.xml");
		obj = context.getBean("stdObj2",Student.class);
		System.out.println(obj);
	}
}
