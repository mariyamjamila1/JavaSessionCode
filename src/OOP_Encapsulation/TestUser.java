package OOP_Encapsulation;

public class TestUser {

	public static void main(String[] args) {
		//create : post
		User u1 = new User("Nikita", 25, true);
	//Retrieve: GET
	System.out.println(u1.getName());
	System.out.println(u1.getAge());
	System.out.println(u1.isActive());
	System.out.println("--------------------");
	//update: for ex. same user is no longer Active...
	u1.setActive(false);
	System.out.println(u1.getName());
	System.out.println(u1.getAge());
	System.out.println(u1.isActive());
	//Update: PUT/Set
	u1.setName("Nikita Kapoor");
	u1.setActive(true);
	u1.setAge(30);

	System.out.println("--------------");
	System.out.println(u1.getName());
	System.out.println(u1.getAge());
	System.out.println(u1.isActive());

	Login l1 = new Login("naveen", "naveen123");
	System.out.println(l1.getUsername() + ":" + l1.getPassword());
	
	Login l2 = new Login("nikita", "Nikita15623");
	l2.setPassword("Niki8640");
	
	System.out.println(l1.getUsername() + ":" + l1.getPassword());
	System.out.println(l2.getUsername() + ":" + l2.getPassword());
	
	}
}
