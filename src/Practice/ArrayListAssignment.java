package Practice;

import java.util.ArrayList;

public class ArrayListAssignment {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		ar.add(0, "blue");
		ar.add(1, "black");
		ar.add(2, "maroon");
		ar.add(4, "green");
		ar.add(5, "purple");
		
		for(int i=0; i<=ar.size(); i++) {
			System.out.println(i);
		}



	}

}
