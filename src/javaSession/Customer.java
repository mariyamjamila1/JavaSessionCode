package javaSession;

public class Customer {
	
			//can not create a method inside a method***
			//void means it cannot return anything***
			//1. no input and no return:
			//return type: void
	
	public void test() { //0 input parameter function
		System.out.println("Test method");
	
	}
	

	public void printMyName() {
		System.out.println("My name is Saad");
		String name = "Saad Salmi";
		System.out.println(name);
	}
	
	//2. no input and some return
	//return type: int
	public int getNumbers() {
		int num = 100;
		int num1 = 150;
		int num2 = 250;
		int sum = num+num1+num2;
		System.out.println(sum);
		return sum;
		
	}
	public String getTrainerName() {
		System.out.println("Get Trainer Name");
		String name = "Naveen";
		return name;
		
	}
	
	public int getBillAmount() {
		System.out.println("Print My Bill");
		int a = 100;
		int b = 200;
		int c = 300;
		int z = a+b+c;
		return z;
	}
	//3. some input and some return: two input parameter
	public int add(int a, int b) {
	System.out.println("Add Method");
	int total = a+b;
	return total;
	}
	
	public static void main(String[] args) {
		//create the object of the class:
		Customer obj = new Customer();
		obj.test();
		obj.printMyName();
		int s1 = obj.getNumbers();
		System.out.println(s1+10);
		String n1 = obj.getTrainerName();
		System.out.println(n1);
	
		int totalAmount = obj.getBillAmount();
		System.out.println(totalAmount + 50 -10);
		
		int t1 = obj.add(10, 30);
		System.out.println(t1);
		int t2 = obj.add(100, 2000);
		System.out.println(t2-150);

	}

}

