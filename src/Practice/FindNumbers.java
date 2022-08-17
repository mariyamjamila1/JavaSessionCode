package Practice;

public class FindNumbers {
	
	//WAP to find out the MAX number from the given positive numbers

	public static void FindMaxNum(int x, int y, int z) {
		
		int max = 0;
		while (x>0 || y>0 ||z>0) {
			x--;
			y--;
			z--;
			max++;
		}
		System.out.println(max);
	}
	
	//WAP to find out the MIN number from the given numbers

	public static void FindMinNum(int a, int b, int c) {
		int min = 0;
		while(a>0 && b>0 && c>0) {
			a--;
			b--;
			c--;
			min++;
			
		}
		System.out.println(min);
	}
	//WAP to find out the SUM number of the given numbers

	public int FindSum(int j, int k) {
		int s = j + k;
		System.out.println(s);
		return s;
		
	}
	//WAP to divide two numbers and find quotient 
	public int Divide(int m, int l) {
		int d = m / l;
		System.out.println(d);
		return d;
	}
	//WAP to find total of three numbers
	public int getTotal(int f, int g, int h) {
		int totalAmnt = f + g + h;
		System.out.println("Your total Amount is: $" + totalAmnt);
		return totalAmnt;
		
	}
	//WAP to find product of two numbers

	public int FindProduct(int q, int r) {
		int p = q * r;
		System.out.println(p);
		return p;
		
	} 	
	//WAP to find out whether a number is ODD or EVEN 
	public int OddorEven(int n) {
		int num = n;
		if(num % 2 == 0) {
			System.out.println("Given Number is Even");
		}
		else {
			System.out.println("Given Number is Odd ");
		}
		return num;
		
	}
	//WAP a method to find out if he/she is eligible to﻿ vote
//	public int voterAge(int v) {
//		if(v>=18) {
//			System.out.println("He or She is Eligible to Vote");
//		}
//		else {
//			System.out.println("He or She is NOT Eligible to Vote");
//		}
//		return v;
//		
//	}
	public static void main(String[] args) {
		
		FindNumbers fn = new FindNumbers();
//		fn.FindMaxNum(60, 26, 58);
//		fn.FindMinNum(590, 560, 600); //static variables/methods should be accessed directly, through class name.
		
		FindNumbers.FindMaxNum(60, 40, 58);

		FindNumbers.FindMinNum(38, 18, 44);
		
		fn.FindSum(36, 74);
		
		fn.Divide(50, 3);
		
		fn.getTotal(100, 200, 3400);
		
		fn.FindProduct(50, 20);
		
		fn.OddorEven(11);
		
		//fn.voterAge(20);
	}

}
