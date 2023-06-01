package exerciseCreateUsePojo;

public class User {

	private String username;
	private String password;
	private String name;
	
	// Constructor (is a special method)
	// type in the name of the class we're using
	// in the method signature pass in any arguments 
	// that you are using and add type in scope
	User (String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
	String getUserInfo () {
		return "Username: " + username + " ||" + " Password: " + password + " ||" + " Name: " + name;
	}
	
	
	// Getters and Setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
