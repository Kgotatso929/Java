public class MyImpl implements ParentInt {

    public double getParentsMoney() {
    	return 150.00;
    }

    public double getGrandParentsMoney() {
    	return 100.00;
    }
    // Question 6 - Lesson 5.2 - Interface inheritance
    // Fix the program so that it compiles
    public double getChildsMoney() {
	return 50.00;
    }

}