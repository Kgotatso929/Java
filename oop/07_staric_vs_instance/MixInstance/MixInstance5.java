// Question 11, Lesson 3: Static Vs Instance
// The following code is a mixture of instance and static variables and method.
// However the code wont run because it does not have a main method.

package MixInstance;

public class MixInstance5 {
    int myVar = 4;
    static int myVar2 = 2;

    int getDifference() {
        return myVar2 - myVar;
    }
}
