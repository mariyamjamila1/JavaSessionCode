package EnumConcept;

public class BrowserUtil {

	public static void main(String[] args) {

		Browser browser = Browser.CHROME;
		
		if(browser == Browser.CHROME) {
			System.out.println("launch chrome");
		}
		
		Environment env = Environment.STAGE;
		System.out.println(env.getEnvValue()); 
		
		
		System.out.println(Constant.LOGIN_PAGE_TITLE);
	}

}
