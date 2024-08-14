public class Constructor1{
	public Constructor1(){
		System.out.println("Doing construction");
	}
}

public class ConstructorTest1{
	public static void main(String [] args){
		Constructor1 constructing = new Constructor1();
		Constructor1 constructor = new Constructor1();
	}
}