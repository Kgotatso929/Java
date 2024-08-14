public class InheritanceTest{
	public static void main(String [] args){
		MyImpl myVar = new MyImpl();

		System.out.println("======== The Child has =====");
		System.out.println("Grand Parents Money: " +myVar.getGrandParentsMoney());
		System.out.println("Parents Money: " +myVar.getParentsMoney());
		//System.out.println("Childs Money: " +myVar.getChildsMoney());
	}
}