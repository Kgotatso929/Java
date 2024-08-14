//Using this method for constructor chaining. 
public class MyClass2{
	private int number;class

	public MyClass2(){
		//Calling another cnostructor with an argugment.
		this(0); //Calls the constructor below with an argument of 0.
	}

	public MyClass2(int number){
		this.number = number;
	}

	MyClass2 obj1 = new MyClass2();
}