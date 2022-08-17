package WebDriver_Arch;

public interface WebDriver extends SearchContext {

	public void findElement();
	
	public void findElements();
	
	public void click(String element);
	
	public void SendKeys(String element, String value);
	
	public void get(String url);
	public String getTitle();
	public void close();
}
