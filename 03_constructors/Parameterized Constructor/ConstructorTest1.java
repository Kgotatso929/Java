public class Constructor1{
	public Constructor1(String name){
		System.out.println("Constructing Name: " +name);
	}
}

public class ConstructorTest1{
	public static void main(String [] args){
		Constructor1 construct = new Constructor1("Kgotatso");
	}
}