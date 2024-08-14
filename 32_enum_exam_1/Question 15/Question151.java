public class Question151{

	enum Pets{
	DOG("D"),
	CAT("C"),
	FISH("F");

	static String prefix = "I am";
	String name;
	
	//constructor 
	Pets(String s){
		//name = prefix + s;
		System.out.println(name);
	}

	public String getData(){
		return name;
	}

	public static void main(String [] args){
		Pets petting = Pets.DOG();
	}
}
}
