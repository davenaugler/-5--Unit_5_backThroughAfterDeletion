package com.coderscampus.lesson4;

import com.coderscampus.lesson3.User;

public class UserApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		
		// WHAT IT USED TO LOOK LIKE W/O AN ARRAY
//		User daveUser = userService.createUser("davenaugler@gmail.com", "password!");
		
//		User user1 = userService.createUser("user1", "password1");
//		User user2 = userService.createUser("user2", "password2");
//		User user3 = userService.createUser("user3", "password3");
//		User user4 = userService.createUser("user4", "password4");
//		User user5 = userService.createUser("user5", "password5");
		
		
		// WHAT IT LOOKS LIKE USING AN ARRAY
		// Arrays allow us to store multiple objects (or primitives) into 
		// ONE variable - Note: an Array is one type of Data Structure
		User[] users = new User[5];
		
		for (int i = 0; i < 5; i++) {
			users[i] = userService.createUser("user" + (i+1), "password" + (i+1));
		}
		System.out.println(users);
		
		
//		users[0] = userService.createUser("user1", "password1");
//		users[1] = userService.createUser("user2", "password2");
//		users[2] = userService.createUser("user3", "password3");
//		users[3] = userService.createUser("user4", "password4");
//		users[4] = userService.createUser("user5", "password5");
		

		
		

	}

}