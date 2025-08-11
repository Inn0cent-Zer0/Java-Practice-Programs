public class GradeBook {
    private String CourseName="CS1212 Python Programming";

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
    public String getCourseName() {
        return CourseName;
    }
    public void displayMessage()
    {
        System.out.printf("Welcome to the Grade Book! for \n %s!\n",CourseName);
    }
}