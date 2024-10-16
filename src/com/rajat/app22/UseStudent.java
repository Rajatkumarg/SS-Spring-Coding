package com.rajat.app22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.rajat.beans22.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig22.class);
		Student st = container.getBean(Student.class);
		st.display();
	}
}
