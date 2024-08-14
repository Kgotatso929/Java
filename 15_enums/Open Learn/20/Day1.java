public enum Day1 {
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3);
	THURSDAY(4);
	FRIDAY(5);
	SATURDAY(6);
	SUNDAY(7);
	 
	Day(int level){
		excitement = level;
	}
	 
	private int excitement;
	 
	public int getExcitement(){
		return excitement;
	}	
}
