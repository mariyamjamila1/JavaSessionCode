package WebDriver_Arch;

public class AmazonTest {
	
	static WebDriver driver; //null 
	
	public static void main(String[] args) {

		//Chrome
		//Firefox
		//Safari
//		ChromeDriver driver = new ChromeDriver();
		
		//Cross Browser Logic
		
		String browser = "safari";
		if(browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			 driver = new FireFoxDriver();
			 
		}
		else if(browser.equalsIgnoreCase("safari")) {
			 driver = new SafariDriver();
		}
		else {
			System.out.println("Please pass the right browser name: " +browser);
		}
		driver.get("https://www.amazon.com");
		driver.click("Sign In");
		
		driver.SendKeys("emailID ", "mariyam.jamila@gmail.com");
		driver.SendKeys("password ", "Mari1234");
		driver.click("Login");
		
		String title = driver.getTitle();
		System.out.println("Page title is:" +title);
		
		//act vs exp result: checkpoint/verification point
		if(title.contentEquals("Amazon Shopping")) {
			System.out.println("Correct title: PASS");
		}
		else {
			System.out.println("incorrect title: FAIL");
		}
		//Automation testing = Automation Steps +Checkpoint(Verification/Assertion/Soft/Hard/ Act vs Exp Result)
		
		driver.close();
	}

}
