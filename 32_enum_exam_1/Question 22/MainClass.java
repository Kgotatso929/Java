enum Directions{
	NORTH, SOUTH, WEST, EAST;

	//this is the constructor
	private Directions(){
		System.out.println(1);
	}
}

public class MainClass{
	public static void main(String [] args){
		Directions d1 = new Directions();
	}
}