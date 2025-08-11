import java.util.Scanner;
public class student {
    public static void main(String[]args){
        float[]marks=new float[8];
        float sum=0, avg;
        int s;
        Scanner scan=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Subject:");
        s=sc.nextInt();
        System.out.println("Enter Marks Obtained in " +s+" subjects:");
        for(int i=0;i<s;i++)
            marks[i]=sc.nextFloat();

        for(int i=0;i<s;i++)
            sum=sum+marks[i];
            avg=sum/s;
            System.out.println("\nGrade:=");
        if(avg>94)
            System.out.println("A");
        else if(avg>=90&&avg<94)
            System.out.println("A-");
        else if(avg>=87&&avg<90)
            System.out.println("B+");
        else if(avg>=83&&avg<87)
            System.out.println("B");
        else if(avg>=80&&avg<83)
            System.out.println("B-");
        else if(avg>=77&&avg<80)
            System.out.println("C+");
        else if(avg>=73&&avg<77)
            System.out.println("C");
        else if(avg>=70&&avg<73)
            System.out.println("C-");
        else if(avg>=67&&avg<70)
            System.out.println("D+");
        else if(avg>=63&&avg<67)
            System.out.println("D");
        else if(avg>=60&&avg<63)
            System.out.println("D-");
        else
            System.out.println("F");
    }
}