package exerciseCreateUserService;

public class UserService {
	
//	String[] stringInput = new String[3];
	
	public User createUser (String[] stringInput) {
		User user = new User();
		user.setUsername(stringInput[0]);
		user.setPassword(stringInput[1]);
		user.setName(stringInput[2]);
		return user;
		
	}

	 

}
