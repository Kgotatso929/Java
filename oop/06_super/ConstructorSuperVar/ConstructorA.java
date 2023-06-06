package ConstructorSuperVar;

public class ConstructorA {
    public String name;
    public String surname;
    public String job;

    public ConstructorA (String name, String surname, String job) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        System.out.println("Class A: " + name + " " + surname + " " + job);
    }
}