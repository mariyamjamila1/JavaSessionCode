package OOP_Encapsulation;

public class LoginPage {
	//
	private String username;
	private String password;
	
	
	public String getUsername() {
		if (username ==null) {
			System.out.println("Username is null, please assign correct value.");
		}
		return username;
	}
	public void setUsername(String username) {
		if(username ==null) {
			System.out.println("username is null");
			return;
		}
		if(username.isEmpty()) {
			System.out.println("username is blank");
			return;
		}
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
