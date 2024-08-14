public class MusicianTest {
    public static void main(String[] args) {
        Musician[] musicians = new Musician[3];
        musicians[0] = new PuffDaddy();
        musicians[1] = new Beyonce();
        musicians[2] = new You(); // Adding an instance of your class here
        
        // Displaying information for each musician
        for (Musician musician : musicians) {
            System.out.println("Name: " + musician.getName());
            System.out.println("Lyrics: " + musician.getLyrics());
            System.out.println();
        }
    }
}
