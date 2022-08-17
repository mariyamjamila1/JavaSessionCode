package constructorconcept;

import java.util.ArrayList;

public class Student {

	String id;
	String first_name;
	String last_name;
	String email;
	boolean isfull_time;
	ArrayList<String>classList;
	
	
	public Student(String id, String first_name, String last_name) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
	}


	public Student(String id, String first_name, String last_name, String email) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}


	public Student(String id, String first_name, String last_name, String email, boolean isfull_time) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.isfull_time = isfull_time;
	}


	public Student(String id, String first_name, String last_name, String email, boolean isfull_time,
			ArrayList<String> classList) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.isfull_time = isfull_time;
		this.classList = classList;
	}
	
	
	
}
