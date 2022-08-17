package constructorconcept;

import java.util.ArrayList;

public class Patient {

	int memberid;
	String name;
	String insurance;
	long phone;
	ArrayList<String>medList;
	
	public Patient(int memberid, String name) {
		this.memberid = memberid;
		this.name = name;
		
	}

	public Patient(int memberid, String name, String insurance) {
		this.memberid = memberid;
		this.name = name;
		this.insurance = insurance;
	}

	public Patient(int memberid, String name, String insurance, long phone) {
		this.memberid = memberid;
		this.name = name;
		this.insurance = insurance;
		this.phone = phone;
	}

	public Patient(int memberid, String name, String insurance, long phone, ArrayList<String> medList) {
		this.memberid = memberid;
		this.name = name;
		this.insurance = insurance;
		this.phone = phone;
		this.medList = medList;
	}
	
	
	
	
}
