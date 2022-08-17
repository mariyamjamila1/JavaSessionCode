package javaSession;

public class MethodOverloading {
	
	public void orderPizza(String crust_type, String toppings, int size) {
		System.out.println(crust_type + toppings + size);
	}
	public void orderPizza(int building_num, int apt_num, String city, int zip) {
		System.out.println(building_num + apt_num + city + zip);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void bookAppointment(String name, int memberid, String gender) {
	System.out.println(name + memberid + gender);
	}

	public void  bookAppointment(String condition, String insurance, int date, int zipcode) {
	System.out.println(condition + insurance + date + zipcode);
	}

	public static void main(String[] args) {
		
		MethodOverloading ex= new MethodOverloading();
		
		ex.bookAppointment("Maryam  ", 123, "  Female");
		ex.bookAppointment("opthomology ", "Metroplus  ", 12345, 11103);
		
		ex.orderPizza("Hand Tossed","  Cheese, Pineapple, Jalapenos " , 14);
		ex.orderPizza(3506 +" "+ 2, " Astoria ", 11103);
		
	}

}
