package com.rajat.app24;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajat.beans24.MyComponent;

public class UseMyComponent {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(com.rajat.config.AppConfig24.class);
		MyComponent obj = container.getBean(MyComponent.class);
		obj.showResult();
	}
}
