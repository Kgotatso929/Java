// This is a dmeonstration of Encapsulation
public class Encapsulation{
	// Two private instance variables
	private String name;
	private String surname;

	public String getName(){
		return name;
	}

	public String getSurname(){
		return surname;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}
}