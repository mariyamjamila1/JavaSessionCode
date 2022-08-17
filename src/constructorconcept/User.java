package constructorconcept;

public class User {
	
	String id;
	String name;
	int age;
	boolean isActive;

	
public User(String id, String name) {
	this.id = id;
	this.name = name;
}
public User(String id, String name, int age) {
	this.id = id;
	this.name = name;
	this.age = age;
}

	public User(String id, String name, int age, boolean isActive) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.isActive = isActive;
}
	public static void main(String[] args) {
User u1 = new User ("101", "Tom");
User u2 = new User ("102", "Neel", 25);
User u3 = new User ("103", "AJ", 30, true);


	}

}
