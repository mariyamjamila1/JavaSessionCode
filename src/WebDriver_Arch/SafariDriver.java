package WebDriver_Arch;

public class SafariDriver implements WebDriver {

	public SafariDriver() {
		System.out.println("Launch Safari");
	}

	@Override
	public void findElement() {
		System.out.println("Find Element...");
	}

	@Override
	public void findElements() {
		System.out.println("Find Elements...");		
	}

	@Override
	public void click(String element) {
		System.out.println("click on Element..." +element);		
	}

	@Override
	public void SendKeys(String element, String value) {
		System.out.println("Send Keys to the Element..." + element + "Value:" +value);		
	}

	@Override
	public void get(String url) {
		System.out.println("Launch URL...");		
	}

	@Override
	public String getTitle() {
		return "Amazon Shopping";
	}

	@Override
	public void close() {
		System.out.println("Close Browser");
		
	}

}