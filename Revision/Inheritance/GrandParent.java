public class GrandParent {

	static int value ;
	int number;

	//Create a constructor
	public GrandParent(){
		System.out.println("5. Printing the GrandParent constructor \n");
	}

	//create a instance initializer
	{
		number = 10;
		System.out.println(" 4. Printing the Grandparent instance initialization block " + "the Grandparent variable number is: " + number);
	}

	//create a static initialization block
	static{
		value = 5; 
		System.out.println("1. Printing Grandparent static initialization block \n");
	}

	//The method that will be inherited by other classes
	public double getMoney(){
		return 100.00;
	}
	
}
