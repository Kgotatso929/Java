public class ConstructorOverload{
	private int value;
	private String name;

	//Constructor with no paramateres
	public ConstructorOverload(){
		this.value = 0;
		this.name = "default";
	}

	//Constructor with one paramter
	public ConstructorOverload(int value){
		this.value = value;
		this.name = "Custom";
	}

	//Constructor with two parameters
	public ConstructorOverload(int value, String name){
		this.value = value;
		this.name = name;
	}
}