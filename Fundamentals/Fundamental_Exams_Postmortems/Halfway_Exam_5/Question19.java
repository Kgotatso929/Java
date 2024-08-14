public class Question19{
	public static void main(String [] args){
		mbyte b = 1;
		char c = 1;
		short s = 1;
		int i = 1;


		short s += 1;
		int i = b + b;
		short s += i;

		System.out.println(s);
		System.out.println(b);
		System.out.println(s);

	}
}