public class Example{
	//This is the static instance initializer
	static {
		System.out.println("Static initializer block executed");
	}

	// Instance initializer
	{
		System.out.println("Instance initializer block executed");
	}

	// Constrcutor
	public Example(){
		System.out.println("Constructor Executed");
	}

	// The void method
	public void ExampleMethod(){
		System.out.println("Void method executed");
	}

	{
		System.out.println("ordinary block within the method executed");
	}

	// Main method to demonstrate the execution flow
	public static void main(String [] args){
		System.out.println("Creating an instance of Example");
		Example example = new Example();
		example.ExampleMethod();

	}
}