package StringManipulation;

public class StringBufferandStringBuilder {

	public static void main(String[] args) {

		//Strings are immutable
		
		//mutable - supports multi threaded env, sequential
		StringBuffer sf = new StringBuffer("hello");
		System.out.println(sf);
		sf.append("hi");
		System.out.println(sf);
		
		//mutable - builder is improved version of buffer. fastest
		StringBuilder sb = new StringBuilder("testing");
		System.out.println(sb);
		sb.append("hi");
		System.out.println(sb);
		
	}

}
