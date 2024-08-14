import java.util.function.Supplier;

public class Main{
	public static void main(String [] args){
		//create a supplier that supplies the integer 100.
		Supplier<Integer> integerSupplier = () -> 100;

		// get the integer from the supplier and print it to the console
		System.out.println(integerSupplier.get());
	}
}