import java.util.function.Consumer;

public class Main{
	public static void main(String [] args){
		// create a consumer that accepts a string and prints it to the console
		Consumer<String> stringConsumer = (message) -> System.out.println(message);

		// Use the consumer to accept the string "I am a consumer" and print it to the console.
		stringConsumer.accept("I am a consumer");

	}
}