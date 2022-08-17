package OOP_Inheritance;

public class Vehicle extends AutoMobile {

	int speed = 300;
	String name;
	int price;
	
	public Vehicle() {
		super();
		System.out.println(speed);
	}
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void engine() {
		System.out.println("Vehicle Engine");
	}
@Override
public void aeroDynamic() {
	System.out.println("Vehicle---AeroDynamic");
}
}
