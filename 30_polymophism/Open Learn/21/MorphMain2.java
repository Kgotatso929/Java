public class MorphMain2 {
    public static void main(String[] args) {
        // Create an instance of EnglishBook and assign it to a variable named inst1
        EnglishBook inst1 = new EnglishBook();

        // Re-assign the instance of target back to instance 1 
        inst1 = (EnglishBook)target;

        // Create a variable named target and assign the instance of EnglishBook to it
        Book target = inst1;

        // Just to confirm the assignments
        System.out.println("inst1 is an instance of: " + inst1.getClass().getName());
        System.out.println("target is an instance of: " + target.getClass().getName());
    }
}

class Book {
    // This class is intentionally left empty
}

class EnglishBook extends Book {
    // This class is intentionally left empty
}
