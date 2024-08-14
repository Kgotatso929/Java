class Base{
	void methodA(){
		System.out.println("base - MethodA");
	}
}

class Sub extends Base{
	public void methodA(){
		System.out.println("sub - MethodA");
	}

	public void methodB(){
		System.out.println("sub - MethodB");
	}

	public static void main(String args[] ){
		Base b = new Sub();
		b.methodA(); //2
		b.methodB(); //3
	}
}