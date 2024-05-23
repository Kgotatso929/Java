public class Question40{
	public static void main(String [] args){

		double a = 5.0;
		float f  = 2.0f;
		double d = a * f;

		switch((int)d){
			case((int)10.0):
				System.out.println("The answer is:  " + d);
				break;

			case(int)	9.5:
				d = a * a + d;
				System.out.println("The answer is: "  + d);
				break;

			case(int)	11.0:
				d = a + a;
				System.out.println("The answer is: " + d);
				break;

			default:
				System.out.println("None of the above.");
				break;
		}
	}
}