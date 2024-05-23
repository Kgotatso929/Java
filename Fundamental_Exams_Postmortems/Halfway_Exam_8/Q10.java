public class Q10{
	public static void main(String [] args){
		int movie = 1;
		switch (movie << 2 + movie){
			default:
				System.out.println("Godzilla");
				break;
			case 4:
				System.out.println("Titanic");
				break;
			case 5:
				System.out.println("Black Panther");
				break;		
		}
	}
}