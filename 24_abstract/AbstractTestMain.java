public abstract class AbstractTest {
    public void doConcrete1() {
        System.out.println("Do concrete1");
    }

    public void doConcrete2() {
        System.out.println("Do Concrete 2");
    }

    abstract public void doSomething(); // Abstract method
}

public class ConcreteTest extends AbstractTest {
    @Override
    public void doSomething() {
        System.out.println("Doing something in ConcreteTest");
    }
}

public class AbstractTestMain {
    public static void main(String[] args) {
        AbstractTest test = new ConcreteTest(); // Instantiate the concrete subclass
        test.doSomething();
    }
}
