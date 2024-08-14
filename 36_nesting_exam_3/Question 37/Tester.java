abstract class Base{
	public Base(){}
	public Base(String s){}
}

final class Impl extends Base{

}

public class Tester{
	public static void main(String [] args){
		Base base 1 = new Base();
		Base base2 = new impl();
		new Impl().toString();
		((Base) new Impl()).toString();
	}
}