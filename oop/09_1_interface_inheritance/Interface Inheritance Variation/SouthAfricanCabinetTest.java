public class SouthAfricanCabinetTest {
	public static void main (String [] args) {
		TheImplementation cabinet = new TheImplementation() ;
		
		System.out.println("  ----- Listed rank of cabinet members earnings -----  ");
		System.out.println("The President of South Africa         : " + cabinet.getPresidentSalary());
		System.out.println("The Deputy President of South Africa  : " + cabinet.getDeputyPresidentSalary());
		System.out.println("The Secretary General of South Africa : " + cabinet.getSecretaryGeneralSalary());
		System.out.println("The Member of parliament              : " + cabinet.getMemberOfParliamentSalary());
		
	}

} 