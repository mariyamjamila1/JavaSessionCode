package javaSession;

import java.util.ArrayList;

public class Application {
	//WAF that will return menu links on the page
	//parameter: page name
	//return: ArrayList<String> //links name would be in the form of string
	
	public ArrayList<String> getPageMenuLinks(String pageName) {
		
		System.out.println("Page name is: " + pageName);
		
		ArrayList<String> menuList = new ArrayList<String>();
		
		if(pageName.equals("loginpage")) {
			menuList.add("products");
			menuList.add("categories");
			menuList.add("price");
		}
		else if (pageName.equals("homepage")) {
			menuList.add("products");
			menuList.add("categories");
			menuList.add("price");
			menuList.add("search bar");
			menuList.add("cart items");
		}
		else if (pageName.equals("cart page")) {
			menuList.add("products");
			menuList.add("categories");
			menuList.add("price");
			menuList.add("information");
			menuList.add("seller");
	} else {
		System.out.println("Page not found" + pageName);
	}
		return menuList;
	}

	public static void main(String[] args) {
	 

	}

}
