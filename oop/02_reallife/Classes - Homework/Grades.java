//Class D: This represents grades of the student.
public class Grades {
    public int grades;
    public int finalgrades;

    //The method:
    public void finalgrades() {
        grades = 80;
        System.out.println("Final Grade" + grades);

        //Create an instance / object and its method
        Student student = new Student();
        student.studentinformation();

    }
    public int getfinalgrades() {
        return grades;
    }
    
}