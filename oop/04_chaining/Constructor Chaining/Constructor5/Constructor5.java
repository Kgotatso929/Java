/* Answering Question 10 in the Constructor Chaining lesson */
package Constructor5;

public class Constructor5 {
   public Constructor5() {
        this("Your Name", "Your Surname");
        System.out.println("Running no args constructor");
   }

   public Constructor5(String name, String surname) {
        this(name, surname, "Unspecified");
        System.out.println("Running 2 args constructor - Name: " + name + "Surname: " + surname);
   }

   public Constructor5(String name, String surname, String jobDescription) {
        System.out.println(name + " " + surname + " is a " + jobDescription);
        System.out.println("Running 3 args constructor - Name: " + name + " Surname: " + surname + " Job Description: " + jobDescription);
   }
}
