package OOP_Encapsulation;

public class TestEmpl {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		String n = e1.getName();
		System.out.println(e1.getName());
		
		e1.setAge(25);
		
		LoginPage lp = new LoginPage();
		lp.setUsername(null);
		System.out.println(lp.getUsername());
		
		}

}
