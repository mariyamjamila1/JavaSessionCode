package HashMapConcept;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		//
		//Key-value pair format
		//does not maintain the order
		//int h= hashcode("Tom)//1234567
		//int index = mod(h)-->3
		//threshold = 8 o(N) -- after threshold value of 8 is crossed the entire linked list will be converted to binary tree internally
		//log of n - binary. better than 0(n)
		//8times for each segment
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		
		empMap.put("Tom", 100);
		empMap.put("Peter", 200);
		empMap.put("Lisa", 300);
		empMap.put("Ravi", 400);
		empMap.put("Naveen", 500);
		//empMap.put("Naveen", 200);
		empMap.put(null, 500);
		empMap.put(null, 600);
		
		//hashmap will always be calculated based on keys


		//System.out.println(empMap.get("Naveen"));
		
		empMap.forEach((k,v) -> System.out.println(k+":"+v));
	}

}
