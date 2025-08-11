import java.util.Scanner;
public class GradeBookTest {
    public static void main(String[]args)
    {
            GradeBook myGradeBook= new GradeBook();
                String Name;
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter the course name");
            Name= scanner.nextLine();
            System.out.printf(" Initial Course Name is: %s\n\n",myGradeBook.getCourseName());
            myGradeBook.setCourseName(Name);
            System.out.println();
            myGradeBook.displayMessage();

    }
}