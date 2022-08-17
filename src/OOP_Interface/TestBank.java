package OOP_Interface;

public class TestBank {

	public static void main(String[] args) {

		FederalBanks b = new FederalBanks();
		System.out.println("                                      ");
		b.manageFinance();
		System.out.println("                                      ");
		b.depositCheck(260156, 589345);
		System.out.println("                                      ");
		b.debitCard("Taha", 530219);
		System.out.println("                                      ");
		b.creditCard("Ellie", 405349, 70000.80);
		System.out.println("                                      ");
		b.invest("Sara", 407391, 78000.95);
		System.out.println("                                      ");
		b.grantLoans("Tre", 800);
		System.out.println("                                      ");
		b.mortgage("Mahi", 203918, 780);
		
		System.out.println("                                      ");
		//Top Casting
		
		ChaseBank cb = new FederalBanks();
		System.out.println("                                      ");
		cb.studentCollege("Sam", 301245);
		System.out.println("                                      ");
		cb.depositCheck(902748, 531094);
		System.out.println("                                      ");
		cb.creditCard("Jenni", 780546, 85000.90);
		System.out.println("                                      ");
		cb.grantLoans("Lina", 750);
		
		System.out.println("                                      ");
		
		WellsFargo wf = new FederalBanks();
		System.out.println("                                      ");
		
		wf.invest("Sara", 407391, 78000.95);
		System.out.println("                                      ");
		wf.mortgage("Mahi", 203918, 780);
		
		System.out.println("                                      ");
		
		BankofAmerica ba = new FederalBanks();
		System.out.println("                                      ");
		ba.debitCard("Amina", 108627);
		System.out.println("                                      ");
		ba.withDraw(250, 2202);
		
	}

}
