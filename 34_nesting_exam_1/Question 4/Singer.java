Class Singer{
	public static String sing(){
		return "la";
	}
}

public class Tenor extends Singer{
	public static String sing(){
		return "fa";
	}

	public static void main(String [] args){
		Tenor t = new Tenor();
		Singer a = new Tenor();
		System.out.println(t.sing() +  " " + s.sing());
	}
}

