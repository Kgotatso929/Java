public class Conversion implements Converter{
	public void converted(String input) throws NumberFormatException{
		// Pasring the variable input into an integer and sorting it into an appropriate variable type
		int convertedValue = Integer.parseInt(input);

		//print out the converted variable
		System.out.println("Converted value: " + convertedValue);

	}

	public static void main(String [] args){
		//Create an instance
		Conversion convert = new Conversion();
		String input = "5000";

		// Invoke and call the input value
		convert.converted(input);
	}
}