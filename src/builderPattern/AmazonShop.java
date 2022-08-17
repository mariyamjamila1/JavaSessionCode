package builderPattern;

public class AmazonShop {
	
	public void login() {
		System.out.println("login to app");
	}
	public void login(String un, String pw) {
		System.out.println("login with:"+ un + pw);
	}
	public void search() {
		System.out.println("display all the products");
	}
	public void search(String prodName, String color) {
		System.out.println("display all the products with:" + prodName + color);
	}
	public void search(String prodname, String color, int price) {
		System.out.println("display all the products with:" + prodname + color + price);
}
	public void addtoCart(String prodName) {
		System.out.println("add to cart:" + prodName);
}
	public void makePayment(long ccn, int cvv) {
		System.out.println("make payment with:" + ccn +cvv);
	}
	public void genOrderId(int orderNumb) {
		System.out.println("Your order number is:" + orderNumb);
	}
}