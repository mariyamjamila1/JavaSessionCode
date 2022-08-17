package ExceptionHandling;

public class FianllyBlock {

	public static int getMarks(String stName) {
		System.out.println("Student Name is: " + stName);
	if(stName.equals("Vijay")) {
		try {
			int i = 9/3;
			System.exit(1);//Shut down JVM
			return 90;
		}catch(ArithmeticException e) {
			System.out.println("AE is coming");
		return 20;
		}finally {//
			System.out.println("inside the finally block");
			//return 10;
		}
		
	}
	else if (stName.equals("Amaan")) {
		return 95;
	}
	else if (stName.equals("Priyanka")) {
		return 100;
	}else {
		System.out.println("Student is not found" +stName);
		return -1;
	}
	
	}
	
	public static void main(String[] args) {

		
//		System.out.println("A");
//		System.out.println("A");
//		System.out.println("A");
//		
//		try {
//			int i = 9/0;
//		}
//		catch(ArithmeticException e) {
//			System.out.println("AE is coming");
//			e.printStackTrace();
//		}
//		finally {//with the finally word it will always come in the finally block whether or not exception is there
//			System.out.println("Inside the finally block");
//		}
//		System.out.println("Bye");
	}

}
