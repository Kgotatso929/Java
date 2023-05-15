import java.util.Scanner;

public class Surname {
  public static String surname;

  public static void promptsurname() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your surname: ");
    surname = scanner.nextLine();

  }

  public static String getsurname() {
    return surname;

  }

}