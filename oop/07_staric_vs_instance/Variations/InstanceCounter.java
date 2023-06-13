public class InstanceCounter {
    static int counter;

    public InstanceCounter() {
        counter++;
        System.out.println(" I Am Instance number: " + counter);
    }
}