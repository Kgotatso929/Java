public class ConstructorTest1{
	public static void main(String [] arg){
		Constructor1 construct = new Constructor1("Kgotatso");

		//To print the no argument constructor you need to create an instance for it
		Constructor1 constructing = new Constructor1();
	}
}

//Outlin ethe first constructor
public class Constructor1{
	public Constructor1(String name){
		System.out.println("Your name is: " + name);
	}
	public Constructor1(){
		this("Thomas");
		System.out.println("Running a no argument Constructor1");
	}
}
