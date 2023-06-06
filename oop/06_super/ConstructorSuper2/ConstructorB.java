//No 14 of the constructors super exercise.
/* Change the program: add a no args constructor to ConsC, Call that no args
 * from ConstructorTest4, The no args in ConstC must pass your name 
 * to the name args constructor in ConstC
*/

package ConstructorSuper2;

public class ConstructorB extends ConstructorA {
    public ConstructorB(String name, String surname){
        super(name, surname, "Programmer");
        System.out.println("Class B: " + name + " " + surname);
    }    
}
