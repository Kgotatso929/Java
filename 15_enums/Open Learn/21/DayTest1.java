public class DayTest1 {
	public static void main(String[] args) {
		Day1[] values = Day1.values();
		 
		for(Day1 day:values){
			System.out.println(day + " : excitement level = " + day.getExcitment);
		}
	}
}
