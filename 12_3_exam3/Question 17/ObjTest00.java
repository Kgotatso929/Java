public class ObjTest00{
}

public class ObjTest01 extends Object{
}

public class ObjTest02 implements Object{
}

public class ObjTest03{
	static{
		ObjTest03 test = new ObjTest03();
		System.out.println((test instanceof Object));
	}

	public static void main(String [] args){

	}
}

public class ObjTest04 extends ObjTest03{
	public ObjTest04(){
		System.out.println("Hello1");
	}

	public static void main(String [] args){
		new ObjTest04();
		System.out.println("Hello2");
	}
}