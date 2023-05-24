//Class D represents Teacher:
public class Teacher {
    public String teacher;
    public String teacherName;

    public void teacherName() {
        teacher = "Mr. Mboweni";
        System.out.println("Teacher's Name: " + teacher);

        //Create an instance / object along with its method
        Grades grades = new Grades();
        grades.finalgrades = 80;
    }

    public String getteacherName() {
        return teacher;
    }
}