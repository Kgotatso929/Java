// Question 10, Lesson 4 - Initializers


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