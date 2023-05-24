//Class B: Represents Department;
public class Department {
        public String department;

        //Initialize the variable and print it out
        public void facultyDepartment() {
                department = "Economics Faculty";
                System.out.println("The Department: " + department);

                //Create an instance / object and its method for the next chain
                Teacher teacher = new Teacher();
                teacher.teacherName = "Mr Mboweni";
        }

        public String getFacultyDepartment() {
                return department;
        }

}