class Question10{
	final int fi = 10;
}

public class B extends Question10{
	int fi  = 15;
	public static void main(String [] args){
		B b = new B();
		b.fi = 20;
		System.out.println(b.fi);
		System.out.println(((Question10)b).fi) ;
	}
}