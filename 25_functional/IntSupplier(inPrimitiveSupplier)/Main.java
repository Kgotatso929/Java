import java.util.function.IntSupplier;

public class Main{
	public static void main(String [] args){
		// Create an IntSupplier that supplies that int 47
		IntSupplier intPrimitiveSupplies = () -> 47;

		// Get the int from the supplier and print it to the console
		System.out.println(intPrimitiveSupplies.getAsInt());
	}
}
