package Practice;

public class TestStudents {

	public static void main(String[] args) {

		Students st1 = new Students("H Atiya", "319245", true, 34);
		st1.getName();
		st1.setStCredits(24);
		st1.getStCredits();
		
	
	Students st2 = new Students("K Afrin", "245890", true, 60);
	st2.getName();
	st2.getStCredits();
	st2.setActive(false);
	
	Students st3 = new Students(null, null, false, 0);
	st3.setName("Saad Salmi");
	st3.getName();
	st3.setStID("157204");
	st3.getStID();
	st3.setActive(true);

	}
}
