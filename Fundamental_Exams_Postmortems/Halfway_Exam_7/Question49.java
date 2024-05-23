public class Question49{
	public static void main(String [] args){
		int a = 5;
		double b = 2.0;
		b *= 5 + 5;

		if(b++ == b){
			a++;
			b++;
			System.out.println(b + " " + a);

		}
		if((a += b * a) == (b * a + a) || (a++ > b++)){
			System.out.println(a + " " + b);
		}
		else{
			System.out.println(a + " " + a);
		}
		//System.out.println(b + " " + a);
	}
}