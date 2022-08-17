package OOP_Encapsulation;

public class Browser {
	
	public void launchChromeBrowser() {
		System.out.println("Launch Chrome");
		CheckOSCompatible();
		checkRamsize();
		checkChromeVersion();
		checkChromeServices();
		System.out.println("Chrome browser is launched");
	}
	public void CheckOSCompatible() {
		System.out.println("CheckOSCompatible");
	}
	public void checkRamsize() {
		System.out.println("checkRamsize");
	}
	public void checkChromeVersion() {
		System.out.println("checkChromeVersion");
	}
	public void checkChromeServices() {
		System.out.println("checkChromeServices");
	}
}
