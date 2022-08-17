package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp = new LoginPage(); //child class object, this is when constructor is called
		lp.title();
		lp.url();
		lp.header();
		lp.loadingPage();
		lp.logo();
		Page.footer();
		LoginPage.footer();
		lp.doLogin("Admin", "Admin");
		System.out.println(Page.price);
		System.out.println(LoginPage.price);

		lp.name = "IBM";
		lp.timeOut = 15;
		System.out.println(lp.name + ":" + lp.timeOut);
		//top casting: child class object can be reffered by parent abstract class ref variable
		
		Page p = new LoginPage();
		p.title();
		p.url();
		p.header();
		p.loadingPage();
		
	
		
		//can not create object of abstract class
		//down casting is NA
		
//		Employee e = new Employee() {
//			
//		System s = new System();	
//		}
	}

}
