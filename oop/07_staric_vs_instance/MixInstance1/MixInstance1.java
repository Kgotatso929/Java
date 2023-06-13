// Question 13, Lesson 3: Static vs Instance
// Fix the compilation error without changing the section in red.

package MixInstance1;

public class MixInstance1 {
    static int myVar = 4;
    static int myVar2 = 2;

    static int getDifference() {
        return myVar2 - myVar;
    }
}
