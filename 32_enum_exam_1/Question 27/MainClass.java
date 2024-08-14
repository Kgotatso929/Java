enum MyEnums{
	A, B;

	int i = 888;
}

public class MainClass{
	public static void main(String [] args){
		MyEnums.B.i = 999;
		System.out.println(MyEnums.A.i);
	}
}