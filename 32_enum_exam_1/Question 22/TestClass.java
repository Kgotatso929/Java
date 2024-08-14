Interface I {  }

public enum EnumA implements I { A, AA, AAA}; //1

class TestClass{
	public enum EnumB{
		B, BB, BBB;

		//This is the constructor 
		public Object clone(){										//2
			return B;
		}

		public static enum EnumC{C, CC, CCC};

		public static enum EnumD extends EnumC{ DDD}; //3


		public TestClas(){
			System.out.println(EnumC.CC.Index()); //5
		}

		public static void main(String [] args){
			System.out.println(EnumC.valueOf("ccc")); //5
			System.out.println(EnumC.CC.name())
		}
	}
}