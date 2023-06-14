public class Initializer1 {
	
	public Initializer1(){
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Instance initialization block.");
	}
	
	static{
		System.out.println("Static initialization block.");	
	}
}
