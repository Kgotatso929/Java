public class inheritance31{
	private Integer value = 5;

	public Integer getValue(){
		return value;
	}
}

public class Inheritance32  extends inheritance31{

	@Override
	public Number getValue(){
		return super.getValue();
	}
}