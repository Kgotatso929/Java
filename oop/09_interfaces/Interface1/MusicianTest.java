//Question 11, Lesson 5.1 - Interfaces
/* Create a class name it Kgotatso and have it look the same as the other artist 
classes */
/* Add an interface, implementation and a Test file */

public class MusicianTest {
    public static void main(String [] args) {
        Musician [] musicians = new Musician [] {new Kgotatso()};

	for(int i = 0; i < musicians.length; i++) {
		System.out.println("Name: "+musicians[i].getName());
		System.out.println("Lyrics: "+musicians[i].getLyrics());
	}
    }
}