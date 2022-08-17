package constructorconcept;

import java.util.ArrayList;

public class TestComp {
	
	public static void main(String[] args) {
		
		Company c1 = new Company("IBM", "NY");
		System.out.println(c1.name +" " +c1.ceo +" "+ c1.empCount+" " +c1.sharePrice);
		
		Company c2 = new Company("Apple",10000, 500.44);
		System.out.println(c2.name +" " +c2.ceo +" "+ c2.empCount+" " +c2.sharePrice);

		c2.hq = "CA";
		
		System.out.println(c2.name +" " +c2.ceo +" "+ c2.empCount+" " +c2.sharePrice);

		Company c3 = new Company("ABC ltd");
		System.out.println(c3.name +" " +c3.ceo +" "+ c3.empCount+" " +c3.sharePrice);

	
		ArrayList<String> tomordersList = new ArrayList<String>();
		Customer cu4 = new Customer("Tom", "Payne", tomordersList);
		System.out.println(cu4.firstname + " "+ cu4.lastname + " " +cu4.ordersList);
		
		
	
	}
}
