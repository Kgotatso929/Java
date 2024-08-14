public class Vehicle{
	public Vehicle(){
		System.out.println("Driving");
	}
}

public class ConstructorTest2{
	public static void main(String [] args){
		Vehicle driving = new Vehicle();
		Vehicle petrol = new Vehicle();
	}
}