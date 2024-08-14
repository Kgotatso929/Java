public class MorphMain {
    public static void main(String[] args) {
        // Create an instance of Morph named morph1
        Morph morph1 = new Morph();

        // Create a variable called target of type Object and initialize it to null
        Object target = null;

        // Assign the instance of Morph to the variable target
        target = morph1;

        // Re-assign the instance of target back to morph1 with casting
        morph1 = (Morph) target;

        // Just to confirm the re-assignment
        System.out.println("morph1 is an instance of: " + morph1.getClass().getName());
    }
}
