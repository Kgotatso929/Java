enum MyEnums{
	A, B;

	int i = 888;
}

public class MainClass{
	public static void main(String [] args){
		MyEnums.B.i = 999;
		system.out.println(MyEnums.A.i);
	}
}