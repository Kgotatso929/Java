public class Conversion implements Converter {
    // Declare and initialize two static variables, i and j, with values 5 and 7 respectively
    private static int i = 5;
    private static int j = 7;

    // Declare and initialize two instance variables, x and y, with values 6 and 8 respectively
    private int x = 6;
    private int y = 8;

    /* Declare two final static variables, var2 and var3. var2 should be of numeric type and var3 should 
    be of type String, and initialize them to 10 and "10" respectively. */
    private final static int var2 = 10;
    private final static String var3 = "10";

    // Declare one more final static variable, var1
    private final static String var1 = "Final Static Variable";

    
    public void converted(String input) throws NumberFormatException {
        // Attempt to parse the input string into an integer
        int convertedValue = Integer.parseInt(input);

        // Print the converted variable
        System.out.println("The Converted Value: " + convertedValue);
    }

    public static void main(String[] args) {
        // Create an object that will be used to call 
        Conversion convert = new Conversion();

        // Example input string
        String input = "123";

        // Call converted method
        convert.converted(input);

        // Print out the static variables
        System.out.println("Static variable i: " + i);
        System.out.println("Static variable j: " + j);

        // Print out the instance variables
        System.out.println("Instance variable x: " + convert.x);
        System.out.println("Instance variable y: " + convert.y);

        // Print out the final static variables
        System.out.println("Final static variable var1: " + var1);
        System.out.println("Final static variable var2: " + var2);
        System.out.println("Final static variable var3: " + var3);
    }
}
