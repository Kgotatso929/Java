class One{
	String one = "ONE";

	{
		one = one + "ONE";
	}

	enum Enums{
		ONE;

		One one = new One();

		{
			one.one = one.one + "ONE";
		}

		private Enums(){
			one.one = one.one + "ONE";
		}
	}
}