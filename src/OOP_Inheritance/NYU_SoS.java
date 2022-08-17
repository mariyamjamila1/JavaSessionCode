package OOP_Inheritance;

public class NYU_SoS extends NYU{
	
	public void earnED() {
		System.out.println("Earn the Highest Level of Education"); //inherited
	}
	public void earnBS() {
		System.out.println("Earn Bachelor's Degree in Science"); //individual
	}

	@Override
	public void earnMasters() {
		System.out.println("Earn Master's Degree in Science"); //Overridden
	}

}
