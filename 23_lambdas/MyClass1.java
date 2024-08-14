//Change the res
public interface MyInterface{
	public double myMethod();
}

public class MyClass1{
	public static void main(String [] args){
		MyInterface myInterface = () -> {
			System.out.println("My first lambda");
			return 22.78;
		};
		System.out.println(myInterface.myMethod());
	}
}