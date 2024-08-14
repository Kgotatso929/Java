interface Calculable{
	double calculate(double a, double b);
	
	default double performOperation(double a, double b, Operation op){
		return op.execute(a, b);
	}
}

interface Operation{
	double execute(double a, double b);
}

public class Main{
	public static void main(String [] args){
		Calculable calculable = (a, b) -> a * b;
		Operation res =(a, b) -> a + b;

		System.out.println("Result: " + calculable.performOperation(5, 3, res));
	}
}