// Question 10, Lesson 4 - Initializers
/* Change the class initializer test to print the following: 
 * Static initialization block.
- Instance initialization block.
- Constructor
- Instance initialization block.
- Constructor
- Instance initialization block.
- Constructor

 */

public class InitializerTest {
    public static void main (String [] args) {
        for (int i = 0; i < 3; i++) {
            new Initializer();
        }
    }
}