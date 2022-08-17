package javaSession;

public class Car {
	
String name;
int price;
String color;
static int wheels = 4; //common property VALUE not common property
//CMA = common memory allocation, wheels.
//static memory allocation  --- After jdk 1.8//MetaSpace dynamic memory
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 30;
		c1.color = "Red";
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 40;
		c2.color = "Blue";
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 20;
		c3.color = "Black";
		
		System.out.println(c1.name + " " +c1.price +" " +c1.color + " " +Car.wheels);
		
		//how to access static vars:
		//1. by using class name ***
		System.out.println(Car.wheels);
		
		//2. use it directly
		System.out.println(wheels);
		
		//3. can we access static var using object reference variable?
		System.out.println(c1.wheels);
	}

}
