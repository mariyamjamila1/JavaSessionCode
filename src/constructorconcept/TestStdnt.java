package constructorconcept;

import java.util.ArrayList;

public class TestStdnt {

	
	public static void main(String[]args) {
		
		Student s1 = new Student("7011", "Saad", "Salmi");
		System.out.println(s1.id+" " +s1.first_name + " "+s1.last_name);
		
		Student s2 = new Student("8090", "Khadi", "Afrin", "kafrin@gmail.com");
		System.out.println(s2.id+" " +s2.first_name + " "+s2.last_name+ " "+ s2.email);
		
		
		
		ArrayList<String>s3classList = new ArrayList<String>();
		s3classList.add("Science");
		s3classList.add("Comp Sci");
		s3classList.add("Eng");
		s3classList.add("History");
		Student s3 = new Student("2015", "Humu", "Atiya", "humuatiya2015@gmail.com", true, s3classList);
		System.out.println(s3.id+" " +s3.first_name + " "+s3.last_name+ " "+ s3.email+ " "+ s3.isfull_time + " "+ s3classList);
	}
}
