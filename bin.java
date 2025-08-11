import java.util.Scanner;
public class bin {
    public static void main(String[]args){
        int dec,i=0,m=1,rem,bin=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Decimal Number:");
        dec=sc.nextInt();
        while(dec!=0){
            rem=dec%2;
            bin = bin+(rem*m);
            m*=10;
            dec/=2;
        }
        System.out.println("\nEquivalent Binary Number:="+bin);
    }
}
