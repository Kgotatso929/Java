public class Question16{
	public static void main(String[] args){
		int i = 10;
		if(i > 10 ? i++ : --1){
			System.out.print("Foo");
		} 
		if (i < 10)
			System.out.print("Bar");
	}
}