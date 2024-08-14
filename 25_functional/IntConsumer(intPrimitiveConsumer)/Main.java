import java.util.function.IntConsumer;

public class Main{
	public static void main(String [] args){
		// Create an IntConsumer that accepts an int and prints it to the console.
		IntConsumer intPrimitiveConsumer = (number) -> System.out.println(number);

		// Use the consumer to accept the int 94 and print it to the console
		intPrimitiveConsumer.accept(94);
	}
}