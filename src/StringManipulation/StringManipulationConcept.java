package StringManipulation;

import java.util.Arrays;

public class StringManipulationConcept {

	public static void main(String[] args) {

		
		String str ="this is my java code and i am so happy this worked";
		System.out.println(str.length());
		
		int len = str.length();
		int hi = len -1;
		int li = 0;
		
		System.out.println("li = " +0);
		System.out.println("hi = " +(len-1));
		System.out.println("length = " +len);
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(37));
//		System.out.println(str.charAt(38));//SIOB
		//System.out.println(str.charAt(-1));
		
		System.out.println(str.indexOf('t'));
		System.out.println(str.indexOf('i'));
		System.out.println(str.indexOf('i',str.indexOf('i')+1));
		System.out.println(str.indexOf('i',str.indexOf('i',str.indexOf('i')+1)+1));
		System.out.println(str.indexOf('i',str.indexOf('i',str.indexOf('i',str.indexOf('i')+1)+1)+1));

		
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("Java")); //-1 NA
		
		String mesg = "Welcome null";
		if (mesg.indexOf("Admin")!=-1) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		} 
		
		String st = "this is my first java code";
		System.out.println(st.toUpperCase());
		System.out.println(st);
		String st1 = "THIS IS MY JAVA PROGRAM";
		System.out.println(st1.toLowerCase());
		
		//trim:
		String s ="         Hello world     ";
		System.out.println(s.trim());

		//replace:
		String dob = "01-01-1990"; //01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		String t = "     hello selenium   ";
		System.out.println(t.replace(" ", ""));
		
		//contains:
		String m = "your user id is NaveenAutomation";
		System.out.println(m.contains("NaveenAutomation"));
		if(m.contains("NaveenAutomation")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//equals:
		//String literals/ when string value is declared directly
		String p = "hello selenium";
		String k = "hello selenium";//String p and k will be stored in heap memory
		System.out.println(p.equalsIgnoreCase(k));
		
		String h = new String("hello world"); //two objects will be created becaz of the "new" keyword
		String g = new String("hello world");//1 object created
		//SCP - String Constant Pool - does not allow duplicate values. all references will be pointing to same object/value
		//"hello world"
		System.out.println(h==g);//false
		System.out.println(p==k);//true
		
		System.out.println(h.equals(g));
		String n = "hello world"; //0
		System.out.println(h==n);//false
		System.out.println(h.equals(n));
		
		String nn = "hello world";//0
		System.out.println(n==n);
		
		String hh = new String("Hello Selenium");//2 objects created, one in heap and one in constant pool
		
		//
		String sp = "Sachin";
		sp = sp +" Tendulkar";
		System.out.println(sp);
		String sp1 = "Sachin"; //0 object will be created caz Sachin is already in SCP
		System.out.println(sp == sp1);
		
		//SubString:
		String test = "your order id is 12345";
		System.out.println(test.substring(17));
		System.out.println(test.substring(1, 12));
		System.out.println(test.substring(test.indexOf("is")+3, test.length()));
	
		//Split:
		String lang = "JAVA_PYTHON_JAVASCRIPT_RUBY";
		String l[] = lang.split("_");
		System.out.println(l[1]);
		//System.out.println(l[4]);//AIOB
		
		String empData = "Leyla;Rama;IBM;Pune;India;SDET2";
		String emp[] = empData.split(";");
		System.out.println(emp[0]);
		System.out.println(emp[2]);
		System.out.println(emp[3]);

		System.out.println(Arrays.toString(emp));
		for(String e : emp) {
			System.out.println(e);
		
		}
		System.out.println("-------------------");
		
		String pop = "seleniumhelloworldhellotesting";
		String p1[] = pop.split("hello");
		System.out.println(p1[0]);
		
		//
		String pool = "xXtestingXxXxXseleniumxXXpythonxXautomationX";
		String pl [] = pool.split("xX");
		System.out.println(pl[0].length());
		System.out.println(pl[1]);
		System.out.println(pl[2].length());
		System.out.println(pl[3]);
		System.out.println(pl[4]);

		

		
	
	
	}

}
