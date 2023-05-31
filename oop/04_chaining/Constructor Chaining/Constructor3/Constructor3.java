/* Answering Question 8 in the Chaining this lessson */
package Constructor3;

public class Constructor3 {
    public Constructor3() {
        this("Kgotatso"); //Call the name argument constructor with the name "Kgotatso"
        System.out.println("Running no args constructor");
    }

    public Constructor3(String name) {
        System.out.println("Running name arg constructor: " + name);
    }
}
