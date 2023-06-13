/* Question 11, Lesson 3: Static vs Instance
 * Original code below: Please note that this code below does not ave a main 
 * method therefore it will not run.
 * 
 * Public Class MixInstance {
 *      int myVar = 4;
 *      static int myVar2 = 2;
 * 
 *      int getDifference() {
 *          return myVar2 - myVar;
 *  }
 */


// Please provide a variation of this code
/* Please note that you will have to create a main method in a separate 
   file to see if this code will run
*/  

public class StaticInstanceVar {
    static int variation = 5;
    static int variation1 = 25;

    static int getDifference() {
        return variation1 - variation;
    }

    //The main method elow used to invoke and execute the code.
    public static void main(String[] args) {
        int difference = getDifference();
        System.out.println("Difference: " + difference);
    }
}
