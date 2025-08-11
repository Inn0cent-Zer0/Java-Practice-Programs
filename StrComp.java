import java.util.Scanner;

public class StrComp {
    public static void main(String[]args)
    {
        int num;
        String temp= null;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of String");
        num= scanner.nextInt();
        String [] strings= new String[num];
        for(int i=0;i<num;i++)
        {
            strings[i]= scanner.nextLine();
        }
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                if(strings[j].compareTo(strings[i])<0)
                {
                    temp=strings[i];
                    strings[i]=strings[j];
                    strings[j]=temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<num;i++)
        {
            System.out.print("[\t");
            System.out.print(strings[i]);
            System.out.print("\t]");
        }
        System.out.println();
    }
}