public class MusicianTest {
	public static void main (String [] args) {
		Musician [] musicians = new Musician[] {new PuffDaddy(), new JohnLegend(), new Snoop()

		};

		for(int i = 0; i < musicians.length; i++) {
			System.out.println("Name: "+ musicians[i].getName());
			System.out.println("Lyrics: " + musicians[i].getLyrics());
		}
	}
}