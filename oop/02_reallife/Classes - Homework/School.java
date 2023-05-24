public class School {
    public String school;

    public void SchoolName() {
        school = "University of Johannesburg";
        System.out.println("Welcome to: " + school);

        //Create the object / instance an dthe method to call it
        Department department = new Department();
        department.facultyDepartment();
    }

    public String getSchoolName() {
        return school;
    }
}