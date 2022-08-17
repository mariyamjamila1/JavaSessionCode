package OOP_Inheritance;

public class AutoMobile {
	int speed = 400;
	String name;
	int price;

	public AutoMobile() {
		super();
		System.out.println(speed);
	}
	public AutoMobile(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void aeroDynamic() {
		System.out.println("Automobile---AeroDynamic");
	}
}
