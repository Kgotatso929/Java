public class Main{
	public static void main(String [] args){
		//create an object that will be used to instantiate the attributes
		Bicycle myBike = new Bicycle();

		//Instantiate the attributes
		myBike.color = "Red";
		myBike.year = 2010;

		//Call the method after instantiating / adding values to your attributes
		myBike.ride();
	}
}