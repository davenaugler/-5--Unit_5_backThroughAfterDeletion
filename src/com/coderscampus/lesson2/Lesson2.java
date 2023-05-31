package com.coderscampus.lesson2;

import com.coderscampus.lesson1.Human;

public class Lesson2 {
	
	public String someVariable = "Hi there";
	
	// Access Modifiers = private, public, protected 
	public static void main (String[] args) {
		
		Human daveNaugler = new Human();
//		daveNaugler.getAge();
		daveNaugler.setAge(32);
//		daveNaugler.age = 36;
		System.out.println(daveNaugler.getStageOfLife());
		
	}
	
}
 