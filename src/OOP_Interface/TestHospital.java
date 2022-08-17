package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.dentalServices();
		fh.cardioServices();
		fh.emergencyServices();
		fh.medicalInsurance();
		fh.entServices();
		fh.neuroServices();
		fh.medicalResearch();
		fh.billing();
		fh.medicalDevelopment();
		fh.covid19Vaccanation();
		System.out.println("Minimum Fee is $" + FortisHospital.min_fee);
		
		System.out.println("Minimum Fee is $" + USMedical.min_fee);
		
		//Top Casting: child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.neuroServices();
		us.physioServices();
		us.emergencyServices();
		
		UKMedical uk = new FortisHospital();
		uk.dentalServices();
		uk.emergencyServices();
		uk.entServices();
		
		//down casting:

	}

}
