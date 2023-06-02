package exerciseCreateUserService;


public class UserApplicaiton {

	public static void main(String[] args) {
		String[] stringInput = {"davenaugler@gmail.com", "password!", "Dave Naugler"};
		UserService userService1 = new UserService();
		User daveUser = userService1.createUser(stringInput);
		System.out.println("Username: " +daveUser.getUsername());
		System.out.println("Password: " +daveUser.getPassword());
		System.out.println("Name: " + daveUser.getName());

	}

}
