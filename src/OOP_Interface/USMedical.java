package OOP_Interface;

public interface USMedical extends WHO{
	
	int min_fee = 10;
	//vars are static and final by default
	
	// can not have method body
	//meaning no method body --> abstract method
	//
	
	public void cardioServices();
	public void cardioServices(int a); 
	
	public void physioServices();
	
	public void neuroServices();
	
	public void emergencyServices();
	
	
	//1. can have a static method with method body
	public static void billing() {
		System.out.println("FH ----billing");
	}
	
	//2. can have default method with method body:
	default void medicalDevelopment() {
	System.out.println("US Medical Development");
	}
}
