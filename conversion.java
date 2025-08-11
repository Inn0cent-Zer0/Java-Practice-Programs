import java.util.*;
public class conversion {
    public static void main(String[]args)
    {
        int number;
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\t\t→→→→→→→→→→→//Conversion//←←←←←←←←←←←←←←←←");
        System.out.println("\n\t\tEnter the Integer value :");
        number = scan.nextInt();
        System.out.println("\n\t\tEnter the String value :");
        str = scan.nextLine();
        int stra = Integer.parseInt(str);
        System.out.println("This is the Conversion of String Value to Integer Value  is  "+stra);
        String anumber=Integer.toString(number);
        System.out.println("This is the Conversion ofInteger Value to  String Value is "+anumber);
    }
}