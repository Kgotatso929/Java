public class Exampl1{
	public static void main(String [] args){
		//Assigning a vaue to a variable on a condition
		int score = 75;
		String grade = (score >= 60 ? "Pass" : "Fail");

		System.out.println(grade);
	}
}