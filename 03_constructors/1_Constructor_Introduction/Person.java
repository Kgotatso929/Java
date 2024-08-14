//Here is ssimple of a class with a constructor
public class Person{
	//Instance variables
	String name;
	int age;


	//constructor with parameters
	public Person(String name, int age){
		this.name = name;
		this.age = age;


	}

	//Constructor without parameters (default values)
	public Person(){
		//default values
		this.name = "Unknown";
		this.age = 0;
	}

	//other methods and members can follow
	Person person1 = new Person(Alice, 30); // Using the constructor with parameters
	Person person2 = new Person();

	

}