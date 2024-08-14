import java.util.function.Consumer;

public class Main{
	public static void main(String [] args){
		//Create a consumer that accepts an integer and prints it to the console.
		Consumer<Integer> integerConsumer = (number) -> System.out.println(number);

		// Use the consumer to accept the integer 35 and print it to the console
		integerConsumer.accept(35);
	}
}