//Defining the constructor
public class Constructor2{
	public Constructor2(String name){
		System.out.println("Your name is: " + name);
	}

/*	public Constructor2(){
		this("Thomas Edison");
		System.out.println("Running a no constructor");
	}*/
}

//Defining the main method
public class ConstructorTest2{
	public static void main(String [] args){
		//Create an instance for the parameterized Constructor above
		Constructor2 constructing = new Constructor2("Martha");

		/*//If you want to print the other Constructor you must create another instance
		Constructor2 constructed = new Constructor2();*/
	}
}