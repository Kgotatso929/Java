//Question 18, Lesson 3: Static vs Instance
// Instruction is to change the program to print "I am instance number: 1"

public class InstCounterTest {
	public static void main(String[] args) {
		new InstanceCounter();
		new InstanceCounter();
		new InstanceCounter();
		new InstanceCounter();
	}
}
