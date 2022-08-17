package OOP_Inheritance;

public class TestUni {

	public static void main(String[] args) {
		
		NYU n = new NYU();
		n.earnED();
		n.earnMasters();
		
		System.out.println("---------------------------");
		
		NYU_SoS s = new NYU_SoS();
		s.earnED();
		s.earnBS();
		s.earnMasters();
		
		System.out.println("---------------------------");
		
		NYU_SoA a = new NYU_SoA();
		a.earnED();
		a.earnMasters();
		a.earnDualDegree();
		
		System.out.println("---------------------------");
		
		NYU_SoE e = new NYU_SoE();
		e.earnED();
		e.earnMasters();
		e.AccDegree();
		
	}

}
