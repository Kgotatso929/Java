public class StaticVsInstance00 {
    public static void main(String[] args) {
        Counter01 counter1 = new Counter01();

        counter1.count();  // counter1 is now 1
        counter1.count();  // counter1 is now 2
        counter1.count();  // counter1 is now 3
        counter1.count();  // counter1 is now 4


        System.out.println("Counter1 is at: " + counter1.getCounter());

        Counter01 counter2 = new Counter01();


        counter2.count();  // counter2 is now 100246
        counter2.count();  // counter2 is now 100247
        counter2.count();  // counter2 is now 100248
        counter2.count();  // counter2 is now 100249

        System.out.println("Counter2 is at: " + counter2.getCounter());
    }
}

class Counter01 {
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void count() {
        counter++;
    }
}
