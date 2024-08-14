public class Main{
	public static void main(String [] args){
		//Create the objects that will be used to instantiate the attributes created.
		Dog myDog = new Dog();

		//Instantiate the attributes, refernce the object.
		myDog.breed = "Pitbull";
		myDog.age = 5;

		//Call the method of the dog class
		myDog.bark();
	}
}