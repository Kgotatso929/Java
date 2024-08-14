// Main method
public class Anonymous01Main{
	public static void main(String [] args){

		final String name = "Mr X";

		Anonymous01 superX = new Anonymous01(){
			public void doSomethig(){
				System.out.println(name + "Do something..");
			}
		};

		// Calling the method
		superX.doSomething();
	}
}