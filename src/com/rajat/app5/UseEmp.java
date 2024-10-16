package com.rajat.app5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans5.Emp;
public class UseEmp {
	public static void main(String[] args) {
		
		ApplicationContext container=new 	ClassPathXmlApplicationContext("/com/rajat/resources/beanconf5.xml");
		Emp e=(Emp)container.getBean("empObj");
		System.out.println(e);
	}

}
