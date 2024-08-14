// Change the previous example above so that the SuperX becomes an abstract class
abstract class SuperX{
	abstract void doSomething();
}

// Main class where SuperX is implemented anonymously
public class SuperMainx{
	public static void main(String [] args){

		// Implementing superX anonymously
		SuperX superx = new SuperX(){
			@Override
			public void doSomething(){
				System.out.println("Doing Something");
			}
		};

		//Calling the method from the abstract class
		superx.doSomething();
	}
}