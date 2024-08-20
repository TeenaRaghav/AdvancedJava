package com.AdvancedJava.Prac;

import java.lang.reflect.Method;

public class MyClass {
	
	@MyCustomAnnotation(value = 10)
	public void sayHello() {
		System.out.println("my custom annotation");
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		MyClass h = new MyClass();
		Method methodVal = h.getClass().getMethod("sayHello");
		
		System.out.println("value is: " + methodVal.getAnnotation(MyCustomAnnotation.class).value());
	}
}
