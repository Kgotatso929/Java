//Define 3 Constructors
public class Constructor3{
	public Constructor3(){
		this("Peter", "Smith");
		System.out.println("Running a no argument constructor");
	}

	public Constructor3(String name, String surname){
		this(name, surname, "Programmer");
		System.out.println("Running name and surname constructor: Name: " + name + "Surname: " + surname);
	}

	public Constructor3(String name, String surname, String job){
		System.out.println(name + " " + surname + " is a " + job);
	}
}