public class Manager extends Employee{
	private String department;

	public Manager(String name, double salary, String department){
		super(name, salary);
		this.department = department;
	}

	public void manageTeam(){
		System.out.println("Managing " + department + " team");
	}
}