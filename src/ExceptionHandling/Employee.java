package ExceptionHandling;

public class Employee {

	String name = "Naveen";
	//Throwable we have two child classes, Error and exception are child of throwable.
	//exception, because of your code
	//error, issue in system/ram/infrastructure
	//with throwable you can handle both exception and error
	//Throwable is the child of Object class
	
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			Employee e = new Employee();
			e = null;
			System.out.println(e.name); //NPE
			int i =9/0;//AE
			
			System.out.println("Hello");
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming...");
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
		System.out.println("BYE");
		
		
		}
		
	}


