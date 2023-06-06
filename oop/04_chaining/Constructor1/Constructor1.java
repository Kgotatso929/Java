/* Perform the following steps, save the files Constructorr.java into 
 * the folder
 */

public class Constructor1 {
    public Constructor1() {
        System.out.println("Running no args constructor");
    }

    public Constructor1(String name) {
        this();
        System.out.println("Running name arg constructor: Name =" + name);
    }
}