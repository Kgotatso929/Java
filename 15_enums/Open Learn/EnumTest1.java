public class EnumTest1 {
	public static void main(String[] args) {
		Day day1 = Day.Monday;
		Day day2 = Day.Monday;
		 
		boolean res1 = day1.equals(day2);
		 
		System.out.println(day1+" equals "+day2+" is "+res1);
 
	}
 
}