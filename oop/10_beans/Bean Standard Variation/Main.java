// A main class that will run the Bean standard

public class Main {
    public static void main (String [] args) {
    
    	// create an instance of the President Bean class
    	President president = new President();

   	// Set the values using the setter methods
   	president.setAge(65);
    	president.setEarnings(1000000.00);
    	president.setQualification("Masters in Politics and Political Philosophy");

    	// Retrieve values using getter methods
    	int age = president.getAge(); 
    	Double earnings = president.getEarnings();
    	String qualification = president.getQualification();

    	//Print the values
    	System.out.println("The presidents age is           : " + age);
    	System.out.println("The presidents earnings is      : " + earnings);
    	System.out.println("The presidents qualification is : " + qualification);
    }

}