import java.util.Scanner;

public class Ex_1 {
    public static void main(String[]args)
    {
        String Garment,Reply;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Is it raining Outside?");
        Reply= scanner.nextLine();
        Reply=Reply.toUpperCase();
        if(Reply.equals("YES"))

        {
            Garment="Umbrella";

        }
        else
        {
            Garment="Overcoat";
        }
        System.out.println("Take an "+Garment+" !");
    }
}
