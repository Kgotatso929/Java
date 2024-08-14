import java.util.function.Supplier;

public class Main{
	public static void main(String [] args){
		// Create a supplier that supplies the string "I am a supplier"
		Supplier<String> stringSupplier = () -> "I am a supplier";

		// get the string from the supplier and print it to the console.
		System.out.println(stringSupplier.get());
	}
}