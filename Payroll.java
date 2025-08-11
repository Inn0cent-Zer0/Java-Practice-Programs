import java.util.Scanner;

public class Payroll {
    public static void main(String[]args)
    {
        double FIX,SST,PS,RP,HI,BP;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Basic Pay");
        BP= scanner.nextDouble();
        FIX= BP*(15.0/100.0);
        SST= BP*(6.2/100.0);
        PS= BP*(3.0/100.0);
        HI=BP*(5.75/100.0);
        RP= BP*(8.5/100.0);
        System.out.println("-/-/-/-/-/-/-//Pay Roll//-/-/-/-/-/-");
        System.out.println("Basic Pay               :   "+BP);
        System.out.println("Federal Income Tax      :   "+FIX);
        System.out.println("Social Security Tax     :   "+SST);
        System.out.println("Payroll Savings         :   "+PS);
        System.out.println("Retireent Pension       :   "+RP);
        System.out.println("Health Insurance        :   "+HI);
    }
}