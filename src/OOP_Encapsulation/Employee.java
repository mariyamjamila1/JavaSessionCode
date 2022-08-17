package OOP_Encapsulation;

public class Employee {

	private String name;
	private int age;
	
	//getter and setter:
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int setAge(int age) {
		return age;

	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "Naveen";
	}

}
