//Answering Question 9: 
/* Change the program that name-arg constructor to accept name and surname
 * and passes in my name "Kgotatso" and surname "Petlele" as separate 
 * arguments
 */

public class Constructor3 {
    public Constructor3() {
        this("Kgotatso", "Petlele");
        System.out.println("Running no args constructor: ");
    }
    public Constructor3 (String name, String surname) {
        System.out.println("Running name arg constructor: Name: " + name + ", Surname: "+ surname);
    }

}