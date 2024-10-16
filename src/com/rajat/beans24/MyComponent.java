package com.rajat.beans24;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

	@Value("#{myMathObj.add(10,20)}")
	private int result;
	
	public void showResult() {
		System.out.println("Sum is "+result);
	}
}
