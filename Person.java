import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
    }

    void UserIns() {
        short Age;
        double BasicPay, HRA, DA, IT, PF, NetPay, GrossPay;
        String Name, Emp_ID;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Employee");
        Name = scanner.nextLine();
        System.out.println("Enter the ID of the Employee");
        Emp_ID = scanner.nextLine();
        System.out.println("Enter the age of the Employee");
        Age = scanner.nextShort();
        System.out.println("Enter the Basic Pay of the Employee");
        BasicPay = scanner.nextDouble();
        HRA = (BasicPay * 10.0 / 100.0);
        DA = (BasicPay * 40.0 / 100.0);
        NetPay = BasicPay + HRA + DA;
        IT = (BasicPay * 40.0 / 100.0);
        PF = (BasicPay * 40.0 / 100.0);
        GrossPay = NetPay - (IT + PF);

        System.out.println("/-/-/-/-/-Employee Details/-/-/-/-/-/-/");
        System.out.println("Employee Name                   => " + Name);
        System.out.println("Employee ID                     => " + Emp_ID);
        System.out.println("Employee Age                    => " + Age);
        System.out.println("House Rental Allowance          => " + HRA);
        System.out.println("Dearness Allowance              => " + DA);
        System.out.println("NetPay                          => " + NetPay);
        System.out.println("Income Tax                      => " + IT);
        System.out.println("Provident Fund                  => " + PF);
        System.out.println("Gross Pay                       => " + GrossPay);
    }
}
