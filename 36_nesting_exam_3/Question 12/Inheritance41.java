public class Inheritance41{
	private Number value = 5;

	public Number getValue(){
		return value;
	}
}

public class Inheritance42 extends Inheritance41{
	@Override
	public Integer getValue(){
		return (Integer)super.getValue();
	}

}