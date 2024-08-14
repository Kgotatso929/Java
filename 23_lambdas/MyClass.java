public interface MyInterface {
    public int myMethod();
}

public class MyClass {
    public static void main(String[] args) {
        MyInterface myInterface = () -> {
            System.out.println("My first lambda");
            return 9;
        };
        System.out.println(myInterface.myMethod());
    }
}
