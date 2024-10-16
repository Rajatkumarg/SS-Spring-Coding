package com.rajat.app4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajat.beans4.Programmer;

public class UseProgrammer {
public static void main(String[] args) {

	ApplicationContext context=new ClassPathXmlApplicationContext("/com/rajat/resources/beanconf3.xml");
	System.out.println("Programmmer 1:");
	Programmer p1=(Programmer)context.getBean("prObj1");
	p1.writeCode();
	System.out.println("=======================");
	System.out.println("Programmer 2:");
	Programmer p2=(Programmer)context.getBean("prObj2",Programmer.class); 
	p2.writeCode();


}
}
