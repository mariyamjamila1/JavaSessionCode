package javaSession;

public class A {

	public static void main(String[] args) {
		
		System.out.println("A----- main");
		
		B.main(args);
		
		//results in stackoverflow because A calls B, B calls A...
	}

}
