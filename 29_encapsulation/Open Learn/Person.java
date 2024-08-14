// Parent class demonstrating encapsulation
public class Person {
    private String name;  // private variable

    public Person(String name) {
        this.name = name;
    }

    public String getName() {  // getter method for private variable
        return name;
    }

    protected void setName(String name) {  // setter method with protected access
        this.name = name;
    }
}

// Child class extending the Person class
class Student extends Person {
    private int grade;  // private variable

    public Student(String name, int grade) {
        super(name);  // calling the constructor of the parent class
        this.grade = grade;
    }

    public int getGrade() {  // getter method for private variable
        return grade
