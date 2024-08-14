//Example of the Java bean.
import java.io.Serializable;

public class PersonBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	//no argument constructor
	public PersonBean(){

	}

	//Getter for name
	public String getName(){
		return name;
	}

	//Setter for name
	public void setName(String name){
		this.name = name;
	}

	//getter for age
	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}
}