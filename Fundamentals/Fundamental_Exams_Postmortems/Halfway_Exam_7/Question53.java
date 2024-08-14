public class Question53{
	public static void main(String [] args){

		int a = 10, b = 15, c = 5;
		boolean bool = (a > b) ? ((a > c) ? false : true) : ((b > c) ? true : false);
		int age = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		int age2 = (a < b) ? ((a > c) ? a : c) : ((b < c) ? b : c);

		if(bool){
			System.out.println("Tom is " + age + " years old");
		}
		else {
			System.out.println("Tom is: " +  age2 + " years old");
		}
	}
}