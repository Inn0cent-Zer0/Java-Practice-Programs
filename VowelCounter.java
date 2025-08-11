import java.util.Scanner;

public class VowelCounter {
    public static void main(String[]args)
    {
        int counta=0,counte=0,counti=0,counto=0,countu=0;
        String string;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a string");
        string=scanner.nextLine();
       for(int i=1;i<string.length();i++)
        {
            char c= string.charAt(i);
         if(c=='A'||c=='a')
         {
            ++counta;
         }
         if(c=='E'||c=='e')
         {
             ++counte;
         }
           if(c=='O'||c=='o')
         {
             ++counto;
         }
         if(c=='U'||c=='u')
         {
             ++countu;
         }
         if(c=='I'||c=='i')
         {
             ++counti;
         }
         i++;
        }
        System.out.println("The Total number of A present in the given String is  "+counta);
        System.out.println("The Total number of E present in the given String is  "+counte);
        System.out.println("The Total number of O present in the given String is  "+counto);
        System.out.println("The Total number of U present in the given String is  "+countu);
        System.out.println("The Total number of I present in the given String is  "+counti);

    }
}