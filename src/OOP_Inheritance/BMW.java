package OOP_Inheritance;

public class BMW extends Car {
	
	int speed = 200;
	public BMW() {
		super();
		System.out.println("testing");
	}
	//Method Overriding: poly + morphism: RunTime(Dynamic) while Overloading is compileTime
	//when you have a method in the parent class and the same method in the child class with:
	//1. method name should be the same
	//2. same number of parameters
	//3. same types of parameters
	//4.same sequence of parameters
	//5. same return type
	//multiple inheritance not allowed in java
	//multi level inheritance is allowed in java
	//static method cannot be overridden, but can be overloaded
	
	@Override 
	public void start() {
		System.out.println("BMW -----start");	
		
	}
	@Override
	public void engine() {
		System.out.println("BMW Engine");
	}
	
	public void autoParking() {
		System.out.println("BMW -----autopark");
		
	}
	public void autoStart() {
		System.out.println("BMW -----auto-start");
		
	}
	@Override
	public void aeroDynamic() {
		System.out.println("BMW---AeroDynamic");
	}
	//method hiding
	//public static void run() {
		//System.out.println("BMW -----run");
	}	
	

