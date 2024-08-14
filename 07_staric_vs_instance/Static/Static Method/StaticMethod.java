public class StaticMethod{
	static int variable;

	//here below is the static method
	static int getVariable(){
		return variable;
	}

	public static void main(String [] args){
		//Calling a method without creating a instance
		int value = StaticMethod.getVariable();
		System.out.println("Static variable value: " + value);
	}
}