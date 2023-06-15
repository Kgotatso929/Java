// Question 2, Lesson 5.2 - Interface inheritance

public class InheritanceTest {
    public static void main (String [] args) {
    	MyImpl myVar = new MyImpl();

	System.out.println("===========the child has: ");
	System.out.println("Grand Parents Money: " + myVar.getGrandParentsMoney());
	System.out.println("Parents Money: " + myVar.getParentsMoney());
	System.out.println("Childs Money: " + myVar.getChildsMoney());
    }

}
