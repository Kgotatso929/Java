public class Main{
	public static void main(String [] args){
		//Create an instance that will be used to print.
		Nested nesting = new Nested();

		//Create an instance of the inner class
		Inner innereds = outerInstance.new Inner();

	}
}