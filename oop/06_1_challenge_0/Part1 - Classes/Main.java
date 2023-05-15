public class Main {
  public static void main (String [] args) {
    GetName getName = new GetName();
    GetSurname getSurname = new GetSurname();
    GetAge getAge = new GetAge();
    GetSalary getSalary = new GetSalary();
    
    String name = getName.Name();
    String surname = getSurname.Surname();
    String age = getAge.Age();
    Double salary = getSalary.Salary();

    System.out.println("My name is " + name);
    System.out.println("My surname is " + surname);
    System.out.println("I am " + age + " years old");
    System.out.println("I earn " + salary + " every month ");

  }

}