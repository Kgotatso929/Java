public class Child extends Parent{
	
	static int sum ;
	int number;

	//Create a constructor
	public Child(){

		System.out.println("9. Printing the Child constructor \n");
	}

	public Child(int num1, int num2){
		int sum = num1 + num2;
		System.out.println("Sum is : " + sum);
	}

	//create a instance initializer
	{
		number = 10;
		System.out.println("8. Printing the Child instance initialization block " + "the child variable number is: " + number);
	}

	//create a static initialization block
	static{
		System.out.println("3. Printing Child static initialization block  \n");
	}

	public double getMoney(){
		return 20.00;
	}
}
