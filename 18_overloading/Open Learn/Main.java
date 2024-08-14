public class Main {
    public static void main(String[] args) {
        // Create an instance of the JohnOver class
        JohnOver johnOver = new JohnOver();

        // Call the getJohnName() method and print the result
        String johnName = johnOver.getJohnName();
        System.out.println("John's name is: " + johnName);

        // Call the getPeterName() method and print the result
        String peterName = johnOver.getPeterName();
        System.out.println("Peter's name is: " + peterName);
    }
}
