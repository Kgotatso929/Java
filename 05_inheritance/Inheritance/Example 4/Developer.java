public class Developer extends Manager{
	private String programmingLanguage;

	//This below is a consructor that takes parameters
	public Developer(String name, double salary, String programmingLanguage){
		super(name, salary);
		this.programmingLanguage = programmingLanguage;
	}

	public void code(){
		System.out.println("Coding in " + programmingLanguage);
	}
}