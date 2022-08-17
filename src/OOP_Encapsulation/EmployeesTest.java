package OOP_Encapsulation;

public class EmployeesTest {

	public static void main(String[] args) {
			Employees e1 = new Employees("Mun", 1, 15.45, true, 'F');
			e1.setAge(3);
			e1.setName("Mun Mun");
			System.out.println(e1.getName());
			System.out.println(e1.getAge());
			System.out.println(e1.isActive());
			
			System.out.println("-----------------------------");
			
			Employees e2 = new Employees("Taha", 2, 12.50, false, 'F');
			System.out.println(e2.getName());
			System.out.println(e2.getAge());
			System.out.println(e2.isActive());
			e2.setName("Muntaha");
			System.out.println(e2.getName());



}
}