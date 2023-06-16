// Question 12, Lesson 6.1 - Bean Standard
// A bean with hip hop properties would look as follows:

public class RapperBean implements java.io.Serializable {
	private int house;
	private int albums;
	private String realName;

	public int getHouses() {
		return house;
	}

	public void setHouses(int pHouses) {
		house = pHouses;

	}
	
	public int getAlbums() {
		return albums;
	
	}

	public void setAlbums (int pAlbums) {
		albums = pAlbums;
	
	}

	public String getRealName() {	
		return realName;

	}

	public void setRealName(String pRealName) {
		realName = pRealName;

	}
}

	