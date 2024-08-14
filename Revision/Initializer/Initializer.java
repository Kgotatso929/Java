public class Initializer {
	int NUMBER1;

	public Initializer(){
		System.out.println("Constructor");
	}

	public Initializer(int sum){
		System.out.println("The sum is " + sum);
	}
	
	{
		NUMBER1 = 6;
		System.out.println("Instance initialization block." + NUMBER1 + "and " + NUMBER);
	}


	public void math(int a, int b){
		int sum = a + b;
		System.out.println("the total is: " + sum);
	}
}
