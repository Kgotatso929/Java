import java.util.function.Function;

public class Main{
	public static void main(String [] args){
		// Create a function that takes a ssring and returns its length
		Function<String, Integer> lengthFinderFunction = (str) -> str.length();

		// Apply the function to the string "FunctionLength" and print the result
		int length = lengthFinderFunction.apply("FunctionLength");
		System.out.println("The length of the string  'FunctionLength' is: " + length);
	