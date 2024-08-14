public class SwitchEnum {
    enum Color
    {
        RED, GREEN, BLUE
    }
    public static void main(String[] args) {
        Color k;
        k = Color.GREEN;

        switch(k)
        {
            case RED:
                System.out.println("I am "+k);
                break;
            case GREEN:
                System.out.println("I am "+k);
                // Remove the duplicate GREEN case
                break;
            case BLUE:
                System.out.println("I am "+k);
                break;
        }
    }
}