import java.util.Scanner;

public class Salary {
  public static double salary;

  public static void promptsalary() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your monthly salary: ");
    salary = scanner.nextDouble();
  }

  public static double getsalary() {
    return salary;

  }

}