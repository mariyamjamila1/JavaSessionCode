package OOP_Interface;

public interface WellsFargo {
	
	public void savingsAcc(String name, int stateID);
	
	public void invest(String name, int accNumb, double income);

	public void mortgage(String name, int accNumb, int creditScore);
	
	public void depositCheck(int ID, int accNumb);
	
}
