import java.util.Scanner;

public class Count {
    public static void main(String[]args)
    {
        int Digits=0, Letters=0;
        char Char;
        String string;
        Scanner scanner= new Scanner(System.in);
        string= scanner.nextLine();
        for(int i=0;i<string.length();i++)
        {
            Char= string.charAt(i);
            if(Character.isDigit(Char))
            {
                Digits++;
            }
            if(Character.isLetter(Char))
            {
                Letters++;
            }
        }
        System.out.println("The number of Digits in the given string"+Digits);
        System.out.println("The number of Letters in the given string"+Letters);
    }
}