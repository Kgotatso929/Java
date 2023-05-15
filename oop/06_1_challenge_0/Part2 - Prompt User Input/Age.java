import java.util.Scanner;

public class Age {
  public static String age;

  public static void promptage() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age: ");
    age = scanner.nextLine();

  }

  public static String getage() {
    return age;

  }

}