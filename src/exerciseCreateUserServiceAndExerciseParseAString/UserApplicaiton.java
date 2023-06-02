package exerciseCreateUserServiceAndExerciseParseAString;


public class UserApplicaiton {

	public static void main(String[] args) {
		
		// Create User Service Exercise
		String[] stringInput = {"davenaugler@gmail.com", "password!", "Dave Naugler"};
		UserService userService1 = new UserService();
		User daveUser = userService1.createUser(stringInput);
		System.out.println("Username: " +daveUser.getUsername());
		System.out.println("Password: " +daveUser.getPassword());
		System.out.println("Name: " + daveUser.getName());
		
		System.out.println("---------------------------------------------------------");
		
		// Parse a String Exercise 
		UserService userService2 = new UserService();
		String[] inputs = userService2.parseText("davenaugler@gmail.com,password1234,Dave Naugler!!");
		for (int i = 0; i < inputs.length; i++) {
			System.out.println(inputs[i]);
		}
	}

}
