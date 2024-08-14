public class Params20{
	public static void main(String [] args){
		NameHolder20 nameHolder = new NameHolder20();

		nameHolder.setName("Peter");

		System.out.println("My name is: " + nameHolder.getName().toString());
	}
}

//A utility of a helper class
class NameHolder20{
	private String name;

	public String getName(){
		return name;
	}

	public void setName(String name){
		name = name;
	}
}