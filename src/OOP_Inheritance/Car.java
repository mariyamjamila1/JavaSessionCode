package OOP_Inheritance;

public class Car extends Vehicle {
	
	int speed = 100;
	String name;
	int price;
	
	public Car() {
		super();
		System.out.println(speed);
	}
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	//final:
	//1. to provide constant variables
	//2. to prevent inheritance
	//3. to prevent method overriding
	
	public void start() {
		System.out.println("Car -----start");
		
	}
	public void stop() {
		System.out.println("Car -----stop");
	}
	public void refuel() {
		System.out.println("Car -----refuel");
	}	
	public static void run() {
		System.out.println("Car -----run");
	}	
	
	private void billing() {
		System.out.println("Car ---billing");
	}
	@Override
	public void aeroDynamic() {
		System.out.println("Car---AeroDynamic");
	}
}
