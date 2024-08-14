public class Main{
	public static void main(String [] args){
		// Using a lambda expression to implement MyInterface
		MyInterface myInterface = (message) -> System.out.println("Message: " + message);

		//Call the method
		myInterface.myMethod("Hello, Functional Interface");
	}
}