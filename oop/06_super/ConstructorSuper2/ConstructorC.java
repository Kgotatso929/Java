//No 14 of the constructors super exercise.
/* Change the program: add a no args constructor to ConsC, Call that no args
 * from ConstructorTest4, The no args in ConstC must pass your name 
 * to the name args constructor in ConstC
*/

package ConstructorSuper2;

public class ConstructorC extends ConstructorB {
    public ConstructorC(String name){
        super(name, "Smith");
        System.out.println("Class C: " + name);
    }
    
    public ConstructorC() {
        this("YourName"); // Pass your name to the name argument constructor in ConstructorC
    }
}