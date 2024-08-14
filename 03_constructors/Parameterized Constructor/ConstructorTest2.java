public class Constructor2{
	//This here is an instance method
	public Constructor2(int m){
		System.out.println("The value is: " + m);
	}
}

public class ConstructorTest2{
	public static void main (String [] args){
		Constructor2 constructing = new Constructor2(10);
	}
}