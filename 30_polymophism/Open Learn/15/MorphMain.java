public class MorphMain{
	public static void main(String [] args){

		// Create an instance of Morph named Morphing
		Morph morph1 = new Morph();

		//Create a variable called target of type Object and initialize it to null
		Object target = null;

		//Assign the instance of Morph to variable target
		target = morph1;

		// Just to confirm the assignment
		System.out.println("Target is an instance of: " + target.getClass().getName());
	}
}