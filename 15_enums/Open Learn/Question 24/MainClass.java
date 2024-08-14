enum EnumOne{
	ONE;
	{
		System.out.println("ONE");
	}

	enum EnumTWO{
		TWO;
		{
			System.out.println("TWO");
		}
	}
}

public class MainClass{
	public static void main(String [] args){
		System.out.println(EnumOne.EnumTWO.TWO);
	}
}