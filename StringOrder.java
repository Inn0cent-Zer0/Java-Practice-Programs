import java.util.Scanner;

public class StringOrder {
    public static void main(String[]args)
    {
        int Size;
        String Temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        Size= scanner.nextInt();
        String[] Str=new String[Size];
        System.out.println("Enter the "+Size+" elemenets  of the array");
        for(int i=0;i<Size;i++)
        {
           Str[i]= scanner.nextLine();
        }
        for(int i=0;i<Size;i++)
        {
            for(int j=0;j<Size;j++)
            {
              if(Str[j].compareTo(Str[i])<0)
              {
                  Temp = Str[i];
                  Str[i]=Str[j];
                  Str[j]=Temp;
              }
            }
        }
        System.out.print("{");
        for(int i=0;i<Str.length;i++)
        {
            System.out.print(Str[i]);
            System.out.print(",");
        }
        System.out.print("}");
    }
}