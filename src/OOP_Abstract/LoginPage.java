package OOP_Abstract;

public class LoginPage extends Page{

	static int price = 20;

	public LoginPage() {
		System.out.println("Login Page Constructor");
	}
	@Override
	public void title() {
		System.out.println("Login Page --title");
	}

	@Override
	public void url() {
		System.out.println("Login Page --url");

	}

	@Override
	public void header() {
		System.out.println("Login Page --header");

	}
	public void loadingPage() {
		System.out.println("page --loading..." + 10);
	}
	public void doLogin(String un, String pwd) {
		System.out.println("login with: " +un +" : " + pwd);
	}
	

}
