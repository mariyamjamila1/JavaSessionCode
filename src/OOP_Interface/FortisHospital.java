package OOP_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical{

	static int min_fee = 20;
	
	public static void main(String[] args) {

	}
	//USMedical Services
	@Override
	public void cardioServices() {
		System.out.println("FH ---CardioServices");		
	}
	@Override
	public void cardioServices(int a) {//overloading and overriding together
		System.out.println("FH ---CardioServices 1 param");		
	}
	@Override
	public void physioServices() {
		System.out.println("FH ---physioServices");		
	}

	@Override
	public void neuroServices() {
		System.out.println("FH ---NeuroServices");
		
	}
	//IndianMedical Services
	@Override
	public void pediaServices() {
		System.out.println("FH ---pediaServices");		
	}

	@Override
	public void onclogyServices() {
		System.out.println("FH ---onclogyServices");		
	}
	//UKMedical Services
	@Override
	public void dentalServices() {
		System.out.println("FH ---DentalServices");		
	}

	@Override
	public void entServices() {
		System.out.println("FH ---EntServices");		
	}
	//Common Services
	@Override
	public void emergencyServices() {
		
	}
	public void medicalInsurance() {
		System.out.println("FH ---Medical insurance");
	}
	public void medicalTraining() {
		System.out.println("FH ---Medical Training");
	}
	
	public static void billing() {
		System.out.println("FH ----billing");
		}
	@Override
	public void medicalDevelopment() {
		USMedical.super.medicalDevelopment();
		UKMedical.super.medicalDevelopment();
	}
	@Override
	public void covid19Vaccanation() {
		System.out.println("FH --Covid 19 Vaccination");
		
	}
	
//		@Override
//		public void medicalDevelopment() {
//			System.out.println("FH Medical Development");
//			}
}
