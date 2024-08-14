//Define the interface SuperX
interface SuperX{
	void doSomething();
}

// Main class where SuperX is implemented anonymously
public class SuperMainX{
	public static void main(String [] args){
		
		// Implementing Super X anonymously
		SuperX superX = new SuperX(){
			
			@Override
			public void doSomething(){
				System.out.println("Doing something");
			}
		};
		
		//Calling the method from the interface
		superX.doSomething();
	}
}