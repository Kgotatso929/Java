public class Nested{
	class Inner{
		Inner(){
			System.out.println("Hello I am constructing");
		}
	}

	public static void main(String [] args){
		//Create an instance that will be used to print.
		Nested nesting = new Nested();

		//Create an instance of the inner class
		Inner innereds = nesting.new Inner();

	}
}