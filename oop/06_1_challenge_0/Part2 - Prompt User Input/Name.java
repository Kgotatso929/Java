import java.util.Scanner;

public class Name {
  public static String name;

  public static void promptname() {
    // Create a scanner class so that the console can read your input
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    name = scanner.nextLine();

  }

  public static String getname() {
    return name;

  }

}