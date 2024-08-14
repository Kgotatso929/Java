public class Constructor3{
	//Here is the method
	public Constructor3(double num){
		System.out.println("The double value is: " + num);
	}
}

public class ConstructorTest3{
	public static void main(String [] args){
		Constructor3 constructing = new Constructor3(10.0);
	}
}