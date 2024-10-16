package com.rajat.app23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.rajat.beans23.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig23.class);
		Student st = container.getBean("st1",Student.class);
		st.display();
		st = container.getBean("st2",Student.class);
		st.display();
	}
}
