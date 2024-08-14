// Change the example above so that SuperX becomes an abstract class
abstract class SuperX{
	abstract void doSomething();
}


// Main class where SuperX is implemented anonymously
public class SuperMainX{
	public static void main(String [] args){
		SuperX superx = new SuperX(){
			@Override
			public void doSomething(){
				System.out.println("Do something");
			}
		};

		// Calling the method from the abstract class
		superx.doSomething();
	}
}