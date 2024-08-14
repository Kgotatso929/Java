public class ElectricTest{
	public static void main(String [] args){
		//Create an object that will be used to invoke other methods
		ElectricCar test = new ElectricCar();

		//Calling the other methods
		test.start();
		test.accelerate();
		test.charge();
	}
}