public class Main {
  public static void main (String [] args) {
    Name.promptname();
    Surname.promptsurname();
    Age.promptage();
    Salary.promptsalary();

    System.out.println("Your name is: " + Name.getname());
    System.out.println("Your surname is: " + Surname.getsurname());
    System.out.println("Your age is: " + Age.getage());
    System.out.println("Your salary is: " + Salary.getsalary() + " Per Month");

  }

}