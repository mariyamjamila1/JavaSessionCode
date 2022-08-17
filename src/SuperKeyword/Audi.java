package SuperKeyword;

public class Audi extends Car{

	int speed = 200;
	
	
	public Audi() {
		super();
		System.out.println("Audi...const");
	}

	public void start() {
		System.out.println("Audi -- start");
		super.start();
	}
	
	public void getSpeed() {
	System.out.println(speed);//200
	System.out.println(super.speed);//100 from Car class
	
		}
	public static void Refuel() {
		System.out.println("Audi --Refuel");
	}
	}

