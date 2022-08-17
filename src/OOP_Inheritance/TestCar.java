package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();//overridden method
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.engine();
		b.aeroDynamic();
		BMW.run();
		
		System.out.println("---------------");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		Car.run();
		
		System.out.println("---------------");
		
		Audi a = new Audi();
		a.theftSafety(); //individual
		a.start();//inherited 
		a.stop();//inherited 
		a.refuel();//inherited 
		a.engine();
		
		System.out.println("---------------");
		
		AutoMobile au = new AutoMobile();
		au.aeroDynamic();
		
		
		System.out.println("---------------");
		Truck t = new Truck();
		t.heavyLoading();
		
		System.out.println("---------------");
		
		//Top Casting
		Car c1 = new BMW();//child class object can be referred by parent class ref variable
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		Vehicle v1 = new BMW();//child class object can be referred by Grandparent class ref variable
		v1.engine();
		//reference type check will be failed for autoparking method becaz autoparking is a method of BMW while c1 is coming from Car class
		//start, stop, refuel, and engine can be access because they are from parent/grandparent class
		
		//down casting: we don't use downcasting, java will throw an exception 
	//	BMW b1 = (BMW) new Car();
		
	
		
	}

}
