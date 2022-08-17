package OOP_Inheritance;

public class NYU_SoA extends NYU{
	
	@Override
	public void earnED() {
		System.out.println("Earn Quality Education at NYU SoA");
	}
	@Override
	public void earnMasters() {
		System.out.println("Earn Master's Degree in Arts"); //Overridden

	}
		public void earnDualDegree() {
			System.out.println("Earn Dual Degrees at NYU SoA"); //individual
		}
}
