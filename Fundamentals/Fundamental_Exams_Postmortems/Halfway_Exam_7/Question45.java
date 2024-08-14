public class Question45{
	public static void main (String [] args){
		double a = 5.0;
		float f = 2.0f;
		double d = a * f;

						if(! (d == (a * d)) && (d++ == (f++ * a++)))
							System.out.println("The answer is: " + d);
						else
							System.out.println("The answer is: " + f);
						if(a == (d / f))
							System.out.println("The answer is: " + a);
						else
							System.out.println("None of the above. " + a);
	}
}