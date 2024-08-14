public class Garbage{
	//Let the class have an instance variable of type String called name
	private String name;

	/*Add a constructor to the class which has a paramete of String called ParamName. 
		in the constructor assign the paramName to the instance variable called name */
	public Garbage(String paramName){
		this.name = paramName;
	}

	//Override finalize method
	@Override

	protected void finalize() throws Throwable{
		try{
			System.out.println("Finalizing just before garbage collection");
		} finally {
			super.finalize();
		}
	}

}