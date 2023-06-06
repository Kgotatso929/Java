//Answering Question 10, of 2.1 Constructors intro 
/* Change the program above such that constructorTest2 program calls the 
no args constructor */

public class Constructor3 {
    public Constructor3() {
        System.out.println("Constructing without a name");
    }
    
    public Constructor3(String name) {
        System.out.println("Constructing Name: " + name);
    }
}
