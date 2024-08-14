class SInger{
	//Instance method
	public String sing(){
		return "la";
	}
}

public class Tenor extends Singer(){
	public static String sing(){
		return "fa;"
	}
	public static void main(Sring [] args){
		Tenor t = new Tenor();
		Singer s = new Tenor();
		System.out.println(t.sing() + " " a.sing());
	}
}