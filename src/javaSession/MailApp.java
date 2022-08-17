package javaSession;

public class MailApp {
	
	int price; //copy of the var will be stored inside the object of this class
	static String name = "gmail"; //
	
	public void sendMail() {//copy of the var will be stored inside the object of this class
		System.out.println("send mail");
	}
	public static void sendInfo() { //CMA
		System.out.println("send info");
	}
	
	public static void main(String[] args) { //CMA because static in nature
		//how to call non static method
		//create the object
		MailApp ma = new MailApp(); //price, sendMail
		ma.sendMail();
		
		//how to call static method/vars: no need to use the object ref
		//1. using the class name
		MailApp.sendInfo();
		
		//2. call directly:
		sendInfo();
		//cannot call sendMail directly
		
		//3. call it by using object ref:
		ma.sendInfo();
		//not suggested
		
		
	}

}
