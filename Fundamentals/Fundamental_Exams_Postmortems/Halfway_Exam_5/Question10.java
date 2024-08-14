public class Question10{
	public static void main(String [] args){
		int x = 4;
		long y = x * 4 - x++ + --x;

		if(y < 10)
			System.out.println("A");

		else
			System.out.println("B");

		else
			System.out.println("C");
	}
}