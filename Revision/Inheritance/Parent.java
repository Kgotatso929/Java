public class Parent extends GrandParent{
	
	static int value ;
	int value2;
	Parent p;

	//Create a constructor
	public Parent(){
		System.out.println("7. Printing the Parent constructor \n");
		//p = new Parent(); 
	}

	//create a instance initializer
	{
		value2 = 10;
		System.out.println("6. Printing the Parent instance initialization block " + "the Parent variable number is: " + value2);
	}

	//create a static initialization block
	static{
		value = 100;
		System.out.println("2. Printing Parent static initialization block \n");
	}

	public double getMoney(){
		return 50.00;
	}
	
}
