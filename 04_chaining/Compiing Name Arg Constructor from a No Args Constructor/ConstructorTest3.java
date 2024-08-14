public class Constructor3{
	public Constructor3(int num){
		System.out.println("The value of the number are as follows: " + num);
	}

	public Constructor3(){
		this(10);
	}
}

public class ConstructorTest3{
	public static void main(String [] args){
		//Create an instance for the first constructor
		Constructor3 constructing  = new Constructor3(5);

		Constructor3 constructied = new Constructor3();
	}
}