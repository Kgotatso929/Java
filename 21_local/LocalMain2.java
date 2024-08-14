public class Local2Main {
    public static void main(String[] args) {
        // Local class must be defined before it is instantiated
        class Local {
            Local() {
                System.out.println("Constructing");
            }
        }

        // Creating an instance of the local class
        Local localInstance = new Local();
    }
}
