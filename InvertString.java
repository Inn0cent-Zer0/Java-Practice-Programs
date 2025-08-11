import java.util.Scanner;

class InvertString {

    public static void main(String[] var0) {
        String string;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        string= scanner.nextLine();
        StringBuffer var1 = new StringBuffer(string);
        System.out.println(var1.reverse());
    }
}
