public class Question59{
	public static void main(String [] args){
		float val = 5f;
		String greeting;

		switch(val){
			case 2f:
				greeting = "Hello";

			case 3f:
				greeting = "Morning";

			case 4f:
				greeting = "Good night"	;

			case 5f:
				greeting = "Good day"	;

			default:
				greeting = "Good Evenining"	;
		}
		System.out.println(greeting);

	}
}