public class Main {
    public static void main(String[] args) {
        // Create an instance of Rapper
        Rapper rapper = new Rapper();
        
        // Set properties
        rapper.setLyrical("Complex rhyme schemes");
        rapper.setFlow("Smooth and rhythmic");
        rapper.setPunchline("Witty and impactful");

        // Get and print properties
        System.out.println("Lyrical: " + rapper.getLyrical());
        System.out.println("Flow: " + rapper.getflow());
        System.out.println("Punchlines: " + rapper.getPunchline());
    }
}
