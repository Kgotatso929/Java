public class Params00{
	public static  void main(String [] args){
		NameHolder nameHolder = new NameHolder();

		nameHolder.setName("Peter");

		System.out.println("My name is: " + nameHolder.getName());
	}
}

class NameHolder{
	private String name;

	public String getName(){
		return name;
	}

	public void setName(String name){
		name = name;
	}
}