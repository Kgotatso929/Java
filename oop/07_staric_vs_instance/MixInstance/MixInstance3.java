//Question 10, Lesson 3 Static vs Instance
// What is an instance method

package MixInstance;

public class MixInstance3 {
    int myVar;

    // By omitting the static keyword you make the method instance not static
    int getMyVar() {
        return myVar;
    }
}
