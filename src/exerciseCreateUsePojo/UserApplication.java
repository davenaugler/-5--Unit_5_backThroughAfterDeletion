package exerciseCreateUsePojo;

public class UserApplication {

	public static void main(String[] args) {
		User daveNaugler = new User("davenaugler", "Password!", "Dave");
		System.out.println(daveNaugler.getUserInfo());
	}

}
