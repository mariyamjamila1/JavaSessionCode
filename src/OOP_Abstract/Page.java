package OOP_Abstract;

public abstract class Page {

	String name;
	int timeOut;
	static int price = 10;
	// 0 to 100% abstraction:
	//only non abs...methods --> 0% abstraction
	//only abs... methods ---> 100% abstraction
	// abs + non abs...methods --> partial abstraction
	//can not create the object abstract class
	//but const are allowed... and it will be called when you create the object of the child class
	
	public Page() {
		System.out.println("Page...Constructor");
	} 
	
	public abstract void title();
	
	public abstract void url();
	
	public abstract void header();

	public void loadingPage() {
		System.out.println("page --loading..." + 20);
	}
	
	public final void logo() {
		System.out.println("Page -- logo");
	}
	public static void footer() {
		System.out.println("Page -- footers");
	}
	private void loadHTML() {
		System.out.println("Page load html");
	}
	public void loadApp() {
		loadHTML();
	}
}
