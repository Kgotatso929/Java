public class Main1 {
	public static void main (String [] args) {
		// create an instance of the RapperBean1 class
		RapperBean1 rapper = new RapperBean1();
		
		//Set the values using the setter methods
		rapper.setWeight(75);
		rapper.setShoeSize(8);
		rapper.setEyeColour("Dark Brown");
		rapper.setName("Kgotatso");

		//Retrieve values using the getter methods
		int weight = rapper.getWeight();
		int shoeSize = rapper.getShoeSize();
		String eyeColour = rapper.getEyeColour();
		String name = rapper.getName();

		//Print the values
		System.out.println("The rappers weight is    : " + weight);	
		System.out.println("The rappers shoe size is : " + shoeSize);
		System.out.println("The rappers eye colour is: " + eyeColour);
		System.out.println("The rappers name is      : " + name);

	}
}	