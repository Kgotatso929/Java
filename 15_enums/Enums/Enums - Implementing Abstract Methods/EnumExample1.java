//Enums can implment abstract methods 
public class EnumExample1{
	public static void main(String [] args){
		//print the direcion for SOUTH
		System.out.println(Compass.SOUTH.getDirection());
	}

enum Compass{
	NORTH{
		public String getDirection(){
			return "Up";
		}
	},
	//This is the implementation
	SOUTH{
		public String getDirection(){
			return "Down";
		}
	},
	EAST{
		public String getDirection(){
			return "Right";
		}
	},
		WEST{
		public String getDirection(){
			return "Left";
		}
	};
	//The abstract method
	public abstract String getDirection();
}
}
