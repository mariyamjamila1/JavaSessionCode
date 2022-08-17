package javaSession;

public class CondtionalOperators {
	
	
	public static void main(String[] args) {
	int grades = 80;
	if(grades >= 100) {
		if(grades >= 90);
		System.out.println("A Grade");
	}
	else if (grades<= 89) {
		if(grades >= 80);
		System.out.println("B Grade");
	}
	else if (grades<= 79) {
		if(grades >= 70);
		System.out.println("C Grade");
	}
	else if (grades<= 69) {
		if(grades >= 60);
		System.out.println("D Grade");
	}
	else {
		System.out.println("Failing Grade");
	}
	
	System.out.println("                                   ");
	
	int a = 80;
	int b = 90;
	int c = 100;
	
    if (a>b && a>c) {
    	System.out.println("A is the greatest");
    }
    else if (b>c) {
    	System.out.println("B is the greatest");
    	
    }
    else {
   	System.out.println("C is the greatest");
}
    
	System.out.println("                                   ");

//Using a switch case
    int printGrades = 90;
    switch (printGrades) {
	case 100:
		System.out.println("A Grade. Eligible for Scholarship");
		break;
	case 90:
		System.out.println("Grade B+");
		break;
	case 80:
		System.out.println("Grade C+");
		break;
	case 70:
		System.out.println("Grade D");
		break;
	default:
		System.out.println("Failing Grade");
		break;
	}
	}
}
