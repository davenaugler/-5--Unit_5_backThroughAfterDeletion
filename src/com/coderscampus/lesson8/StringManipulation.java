package com.coderscampus.lesson8;

public class StringManipulation {

	public static void main(String[] args) {
		
		// FOR EACH LOOP
		for (String arg : args) {
			System.out.println(arg);
			
			String[] numbersArray = arg.split(",");
			for (String number : numbersArray) {
				System.out.println(number);
			}
//			System.out.println(numbersArray);
		}

	}

}
