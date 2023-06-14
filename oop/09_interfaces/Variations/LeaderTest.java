public class LeaderTest {
    public static void main(String[] args) {
        Leader[] leaders = new Leader[] {new MartinLutherKingJnr(), new MalcomX(), new NelsonMandela()};
        
        for (int i = 0; i < leaders.length; i++) {
            System.out.println("Name: " + leaders[i].getName());
            System.out.println("Famous Qoute: " + leaders[i].getFamousQoute());
        }
    }
}