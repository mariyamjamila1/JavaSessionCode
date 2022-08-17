package constructorconcept;

import java.util.ArrayList;

public class PatientData {


	public static void main(String[] args) {
		
		Patient p1 = new Patient(208, "Tom");
		System.out.println(p1.memberid + " "+ p1.name);
		
		Patient p2 = new Patient(900, "Jen", "MetroPLus");
		System.out.println(p2.memberid + " "+ p2.name + " "+p2.insurance);
		
		Patient p3 = new Patient(870, "Ryan", "Medicare", + 9132008147l);
		System.out.println(p3.memberid + " "+ p3.name + " "+p3.insurance + " "+p3.phone);
		
		
		ArrayList<String>p4medList = new ArrayList<String>();
		p4medList.add("Metformin");
		p4medList.add("Tylenol");
		p4medList.add("Lisinopril");
		p4medList.add("Simvastatin");
		
		Patient p4 = new Patient(510, "Kiara", "Aetna", 7182034450l, p4medList);
		System.out.println(p4.memberid + " "+ p4.name+ " " +p4.insurance + " "+p4.phone+ " Patient's meds are: "+ p4medList.toString().replace("[","").replace("]",""));
		
	}

}
