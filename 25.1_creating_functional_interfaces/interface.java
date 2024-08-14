@FunctionalInterface
public interface Increment {
    // Abstract method
    int increment(int number);
}

public class Main {
    public static void main(String[] args) {
        // Using a lambda expression to define the increment method
        Increment incrementer = number -> number + 1;

        // Testing the increment method
        System.out.println("Incrementing 10: " + incrementer.increment
    }
}