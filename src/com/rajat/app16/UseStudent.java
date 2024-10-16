package com.rajat.app16;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.rajat.beans16.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig16.class);
		Student st1 = container.getBean("getStudent",Student.class);
		Student st2 = container.getBean("getStudent",Student.class);
		st1.display();
		st2.display();
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println("objects are equal ? "+(st1==st2));
	}
}
