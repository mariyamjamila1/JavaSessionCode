package constructorconcept;

public class Employee {

	String name;
	int age;
	double salary;
	boolean isPerm;
	
	//constructor of the class
	//const...name will be same as the class name
	//const...looks like a function but its not
	//const...can not return any value, no return type
	//const...can be overloaded...
	//const is used to create the object on the basis of given parameter
	//const is to prevent unnecessary creation of objects
	
	
//public Employee(int i) { //1 param const
//		
//		System.out.println("1 param const...");
//	}
//public Employee(int 1, String p) { //2 param const - 0
//	
//	System.out.println("2 param constructor...");
//}
	public Employee(String name, int age) { //default const - 0
		this.name = name;
		this.age = age; 
		}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Neel", 25);
		System.out.println(e1.name + " "+e1.age);
		
		
		
	}
}
		
		
//		Employee e1 = new Employee();
//		e1.name = "Tommy";
//		e1.age = 20;
//		e1.salary = 12.33;
//		e1.isPerm = true;
//		
//		Employee e2 = new Employee();
//		e2.name = "Liam";
//		e2.age = 25;
//		e2.salary = 15.33;
//		e2.isPerm = false;	
		
	

