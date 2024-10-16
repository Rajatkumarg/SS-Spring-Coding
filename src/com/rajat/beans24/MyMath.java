package com.rajat.beans24;

import org.springframework.stereotype.Component;

@Component("myMathObj")
public class MyMath {

	public int add(int a, int b) {
		return a+b;
	}
}
