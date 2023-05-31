/* Answering Question 6 in the Chaining this lessson */
package Constructor;

public class Constructor3 {
    public Constructor3() {
        System.out.println("Running no args constructor");
    }
    public Constructor3(String name) {
        this();
        System.out.println("Running name arg constructor: Name =" + name);
    }

}
