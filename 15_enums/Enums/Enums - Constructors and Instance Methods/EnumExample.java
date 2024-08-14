//enums can have constructors and instance methods
public class EnumExample{
	public static void main(String [] args){
		//loop through all the values of the compass.
		for(Compass direction : Compass.values()){
			//print the name of the enum constant and is intsruction
			System.out.print(direction + " :");
			direction.printInstruction();
		}
	}

enum Compass{
	//You have constants that have arguments
	//Each value of the constant has a parameter passed to it
	NORTH("Move up"), SOUTH("Move down"), EAS("Move right"), WEST("Move Left");
	private final String instruction;

	//Define a constructor
	//Below is the enum constructor and is implicitly private
	private Compass(String instruction){
		this.instruction = instruction;
	}

	//Define an instance method
	public void printInstruction(){
		System.out.println(instruction);
	}
}

}