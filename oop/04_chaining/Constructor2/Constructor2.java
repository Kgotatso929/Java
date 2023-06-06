//Question 8 - Constructor Chaining - this()
/*Change the program the no args constructor call the name arg constructor
 * and passes in your name.
 */

public class Constructor2 {
    public Constructor2() {
        this("Kgotatso");
        System.out.println("Running name arg constructoer: ");
    }

    public Constructor2(String name) {
        System.out.println("Running name arg constructor: " + name);
    }
}