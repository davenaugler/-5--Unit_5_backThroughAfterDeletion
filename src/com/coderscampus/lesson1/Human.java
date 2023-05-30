package com.coderscampus.lesson1;

public class Human {
	
	// CLASS VARIABLES (class variables have 'static')
	static int TEENAGER_AGE = 13;
	static int ADULT_AGE = 19;
	static int SENIOR_AGE = 65;
	
	// because 'static' is not in front of int, then it means it belongs to an instance of this object.
	// INSTANCE VARIABLE (instance variables do not have 'static')
	int age;
	
	// It' not practical to hard code these numbers in the if and else if statements
	public String getStageOfLife () {
		if (age < TEENAGER_AGE) {
			return "Child";
		} else if (age < ADULT_AGE) {
			return "Teenager";
		} else if (age < SENIOR_AGE) {
			return "Adult";
		} else {
			return "Senior";
		}
		
	}
}
