interface Printable{
	boolean isPrintable(int height, int limit)
}

public class Main{
	public static void main (String [] args){
		check((h, l) -> h.isEmpty(), 5);
	}

	private static void check(Printable p, int height){
		if(p.isPrintable(height, 10))
			System.out.println("printable");
		else
			System.out.println("not printabele");
	}
}