// Question 13 - Lesson 6.1 - Bean Standard
// A bean with hip hop properties that i personally listed abve

public class RapperBean1 implements java.io.Serializable {
	private int weight;
	private int shoeSize;
	private String eyeColour;
	private String name;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int pWeight) {
		weight = pWeight;
	}

	public int getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int pShoeSize) {
		shoeSize = pShoeSize;
	}
		
	public String getEyeColour() {
		return eyeColour;
	}

	public void setEyeColour(String pEyeColour) {
		eyeColour = pEyeColour;
	}

	public String getName() {
		return name;
	}

	public void setName(String pName) {
		name = pName;
	}

}