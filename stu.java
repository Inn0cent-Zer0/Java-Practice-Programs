import java.util.Scanner;

class stu {
    String Name, RollNo;
    int Mark1;
    int Mark2;
    int Mark3;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    void GetDetails() {

        System.out.println("<+><+><+><+><+><+>ENTER THE DETAILS OF STUDENT BELOW<+><+><+><+><+><+>");
        System.out.println("\n Student Name        :");
        Name = scanner.nextLine();
        System.out.println("\n Roll No             :");
        RollNo = scanner.nextLine();
        System.out.println("\n I Subject Mark      :");
        Mark1 = scanner.nextInt();
        System.out.println("\n II Subject Mark     :");
        Mark2 = scanner.nextInt();
        System.out.println("\n III Subject Mark    :");
        Mark3 = scanner.nextInt();

    }

    void Marks() {
        int total;
        float avg;
        total = Mark1 + Mark2 + Mark3;
        avg = (float) (total / 3.0);
        System.out.println("<+><+><+><+><+><+>DETAILS OF STUDENT BELOW<+><+><+><+><+><+>");
        System.out.println("\n Student Name        :" + Name);
        System.out.println("\n Roll No             :" + RollNo);
        System.out.println("\n I Subject Mark      :" + Mark1);
        System.out.println("\n II Subject Mark     :" + Mark2);
        System.out.println("\n III Subject Mark    :" + Mark3);
        System.out.println("\n Total Marks         :" + total);
        System.out.println("\n Average             :" + avg);
    }

}

