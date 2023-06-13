// Question 18, Lesson 3: Static vs Instance
// Instruction is to change the program to print "I am instance number: 1"

public class InstanceCounter {
	
	static int counter;
	
	public InstanceCounter(){
		counter++;
		System.out.println("I am instance number:"+counter);
	}

}
