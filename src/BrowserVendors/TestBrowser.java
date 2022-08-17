package BrowserVendors;

import Browser.BrowserUtil;

public class TestBrowser {

	public static void main(String[] args) {
		
		Chrome c = new Chrome();
		c.click();
		c.launchURL();
		
		
		BrowserUtil br = null;
		//cross browser class
		String browserName = "chrome";
		if(browserName.equals("chrome")) {
			br = new Chrome();
		}
		else if(browserName.equals("firefox")) {
			br = new Firefox();
		}
		else if(browserName.equals("safari")) {
			br = new Safari();
		}
		else {
			System.out.println("pass right browser");
		}
		br.click();
	}

}
