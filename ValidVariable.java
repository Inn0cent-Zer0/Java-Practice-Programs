import java.util.Scanner;

public class ValidVariable {
    public static void main(String[]args)
    {
        String string;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Valid variable");
        string=scanner.nextLine();
       for(int i=0;i<string.length();i++)
       {
           char Char = string.charAt(i);
           if(!Character.isLetter(Char)&&Character.isDigit(Char))
           {
               System.out.println("Terminating");
               break;
           }
           else
           {
               System.out.println("The Entered Variable is a valid variable");
           }
       }

    }
}