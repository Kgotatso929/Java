public class EmployeeTest{
	public static void main(String [] args){
		Manager manager = new Manager("John Doe", 80000, "Enginering");
		Developer developer = new Developer("Jane Smith", 60000, "Java");

		System.out.println("Employee: ");
		manager.displayInfo();
		manager.manageTeam();

		developer.displayInfo();
		developer.code();
	}
}