//Answering Question 10, 2.2 Constructor Chaining Exercise

public class Constructor4 {
    public Constructor4() {
        this("Your Name", "Your Surname", "Unspecified");
        System.out.println("Running no args constructor");
    }

    public Constructor4(String name, String surname) {
        this(name, surname, "Unspecified");
        System.out.println("Running 2 args constructor - Name: " + name + " Surname: " + surname);
    }

    public Constructor4(String name, String surname, String jobDescription) {
        System.out.println(name + " " + surname + " is a " + jobDescription);
        System.out.println(
            "Running 3 args constructor - Name: " + name + " Surname: " + surname + " Job Description: " + jobDescription);
    }
}