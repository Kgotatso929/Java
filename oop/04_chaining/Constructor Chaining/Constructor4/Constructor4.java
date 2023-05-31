/* Answering Question 9 in the Chaining this lesson */

package Constructor4;

public class Constructor4 {
    public Constructor4() {
        this("Kgotatso", "Petlele");
        System.out.println("Running no args constructor");
    }
    public Constructor4 (String name, String surname) {
        System.out.println("Running name arg constructor: Name: " + name + ", Surname: "+ surname);
    }
    
}
