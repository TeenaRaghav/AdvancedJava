package com.AdvancedJava.Prac;

public class Main {
	public static void main(String[] args) {
		Color c1 = Color.RED;
		
		System.out.println("Red Enum name: " + c1.name());
		System.out.println("Red Enum Value: " +c1.getValue());
		
		for(Color color : Color.values()) {
			System.out.println("Enum values :" + color.getValue());
		}
	}
}
