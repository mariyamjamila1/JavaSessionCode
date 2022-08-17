package javaSession;

public class PayMent {
	
	public void payment(String type, String expiring_month) {
		
		System.out.println(type+""+expiring_month);
		
		
		
		
	}
	
public void payment(int ccv, String org) {
		

	System.out.println(ccv+""+org);
	
	
	
		
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PayMent pay= new PayMent();
		pay.payment("visa", " chase");
		
		pay.payment(332, "    may");
		PayMent payType=new PayMent();

	}

}
