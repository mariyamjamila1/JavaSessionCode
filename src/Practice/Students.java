package Practice;

public class Students {

	private String name;
	private String stID;
	private boolean isActive;
	private int stCredits;
	
	
	public Students(String name, String stID, boolean isActive, int stCredits) {
		this.name = name;
		this.stID = stID;
		this.isActive = isActive;
		this.stCredits = stCredits;
	}
	public String getName() {
		System.out.println("Student Name is: " + name);

		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStID() {
		System.out.println("Student ID is: " +stID);
		return stID;
	}
	public void setStID(String stID) {
		this.stID = stID;
	}
	public boolean isActive() {
		if(stCredits >60) {
			System.out.println("Student has graduated and is no longer Enrolled!");
		}
		return isActive;
	}
	public void setActive(boolean isActive) {
		
		if(isActive == true) {
			System.out.println("Congratulations on your Enrollment!");
		}

		this.isActive = isActive;
	}
	public int getStCredits() {
		System.out.println("Student has: " + stCredits + " Credits");
		if(stCredits >=60) {
			System.out.println("This student has completed 60 Credits, ready to gradute!");
		}

		return stCredits;
	}
	public void setStCredits(int stCredits) {
		this.stCredits = stCredits;
	}
	
}
