// Question 8, Lesson 4 - Initializers
// Save the classes into respective separate files

public class Initializer {

    public Initializer() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance initialization block");
    }

    static{
        System.out.println("Static initialization block");
    }
}
