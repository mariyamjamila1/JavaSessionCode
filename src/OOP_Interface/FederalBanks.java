package OOP_Interface;

public class FederalBanks extends Finance implements ChaseBank, BankofAmerica, WellsFargo{

	public static void main(String[] args) {

	}

	//WellsFargo Bank
	@Override
	public void savingsAcc(String name, int stateID) {
		System.out.println("Customer Name is: " +name + " State ID is:" + stateID);
	}

	@Override
	public void invest(String name, int accNumb, double income) {
		System.out.println("Customer Name is: " +name + " Account Number:" +accNumb+ " Income is:" + income);
	}

	@Override
	public void mortgage(String name, int accNumb, int creditScore) {
		System.out.println("Customer Name is: " +name + " Account Number:" +accNumb+ " Credit Score is:" + creditScore);
	}
	
	//Bank of America
	@Override
	public void debitCard(String name, int stateID) {
		System.out.println("Customer Name is: " +name + " State ID is:" + stateID);
	}

	@Override
	public void withDraw(int amount, int pin) {
		System.out.println("Enter the Amount You Would like to Withdraw: $" +amount +" Enter PIN:"+pin);
	}
	
	//Chase College
	public void studentCollege(String name, int collegeID) {
		System.out.println("Student Name is: " +name + " College ID is:" + collegeID);		
	}

	@Override
	public void creditCard(String name, int stateID, double income) {
		System.out.println("Customer Name is: " +name + " State ID is:" + stateID +" Income is:" + income);		
	}

	@Override
	public void grantLoans(String name, int creditScore) {
		System.out.println("Customer Name is: " +name + " Credit Score is:" + creditScore);
	}
	//Common Bank Service
	@Override
	public void depositCheck(int ID, int accNumb) {
		System.out.println("Customer ID is: " +ID + " Account Number:" +accNumb);
	}
}