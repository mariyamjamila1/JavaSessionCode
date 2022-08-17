package OOP_Interface;

public interface BankofAmerica {

	public void debitCard(String name, int stateID);
		
	public void withDraw(int amount, int pin);

	public void depositCheck(int ID, int accNumb);

}
