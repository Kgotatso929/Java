interface DoNothing{
	default void doNothing(){
		System.out.println("Do Nothing");
	}
}

@FunctionalInterface
interface DontDoAnything extends DoNothing{
	@Override
	abstract void doNothing();
}

class LambdaTest{
	public static void main(String [] args){
		DontDoAnything beidle = () -> System.out.println("be idle");
		//call 
		beidle.doNothing();
	}
}
