public class MyClass2 {
    public static void main(String[] args) {
        // Create an instance of MyLambda
        MyInterface myLambda = new MyLambda();
        
        // Call the testingLambda method
        myLambda.testingLambda();
        
        // Lambda expression for myMethod
        MyInterface myInterface = new MyInterface() {
            @Override
            public void testingLambda() {
                // Not used in this context
            }

            @Override
            public double myMethod() {
                System.out.println("My first lambda");
                return 22.78;
            }
        };
        System.out.println(myInterface.myMethod());
    }
}
