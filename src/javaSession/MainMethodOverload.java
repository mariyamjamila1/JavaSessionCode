package javaSession;

public class MainMethodOverload {

	public void main() {
		System.out.println("main 1 method");
	}
	
	public void main(String a) {
		System.out.println("main 2 method" + a);
	}
//jvm is calling main method with no values  -- command line argument
	public static void main(String[] t) {
		System.out.println(t.length);
		System.out.println(t[0]);
		System.out.println("this is my java code");
		
		MainMethodOverload obj = new MainMethodOverload();
		obj.main("Testing");		
	}
	
	public static void main (int a[]) {
		System.out.println("Java code");
	}
}
