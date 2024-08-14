public abstract class interfaces20 implements Interfaces21, Interfaces22, Interfaces23{
	public void test02(){
		System.out.println("Test2");
	}

	public void test3(){
		System.out.println("Test3");
	}
}
interface Interfaces21{
	abstract void test01();
}

interface Interfaces22 extends Interfaces21{
	void test02();
}

interface Interfaces23 extends Interfaces22{
	public void test03();
}