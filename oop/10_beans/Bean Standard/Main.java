public class Main {
	public static void main (String [] args) {
		//Create an instance of the RapperBean class
		RapperBean rapper = new RapperBean();
		
		// Set the values using the setter methods
		rapper.setHouses(3);
		rapper.setAlbums(5);
		rapper.setRealName("John Doe");
		
		// Retrieve values using getter methods
		int houses = rapper.getHouses();
		int albums = rapper.getAlbums();
		String realName = rapper.getRealName();
		
		// Print the values
		System.out.println("Number of houses: " + houses);
		System.out.println("Number of albums: " +albums);
		System.out.println("Real name: " + realName);
		
	}
}
