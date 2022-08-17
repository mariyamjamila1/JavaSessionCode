package OOP_Inheritance;

public class NYU_SoE extends NYU{
	
	public void earnED() {
		System.out.println("Earn the Highest Level of Education"); //inherited
	}
	@Override
	public void earnMasters() {
		System.out.println("Earn Master's Degree at NYU SoE"); //Overridden
		
	}
	public void AccDegree() {
		System.out.println("Earn Accreditted Degree in Engineering"); //individual
		
}
}
