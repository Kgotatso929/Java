/* Question 13, Lesson 3: Static vs Instance - please provide a variation of the 
 * the original code.
 */

 /*  The original code has a compilation error, fix the compilationa error 
  * without changing section in red.
 */

 public class StaticInstanceVar1 {
    static int Kgs = 200;
    static int Kgs1 = 500;

    static int getDifference() {
        return Kgs1 - Kgs; 
    }

    public static void main (String [] args) {
        int change = getDifference();
        System.out.println("The Change is: " + change);
    }
 }