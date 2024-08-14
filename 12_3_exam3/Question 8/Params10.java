public class Params10{
	public static void main(String [] args){
		NameHolder10 nameHolder = new NameHolder10();

		nameHolder.setName("Peter");

		System.out.println("My name is: " + nameHolder.getName());
	}
}

class NameHolder10{
	private String name;

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
		name = name;
	}
}