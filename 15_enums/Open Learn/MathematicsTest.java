public class MathematicsTest{
	public static void main(String [] args){
		Mathematics mathematics1 = Mathematics.Addition;
		Mathematics mathematics2 = Mathematics.Subtract;
		
		boolean result = mathematics1.equals(mathematics2);
		
		System.out.println(mathematics1 + " equals " + mathematics2 + " is " + result); 
		
	}
}
