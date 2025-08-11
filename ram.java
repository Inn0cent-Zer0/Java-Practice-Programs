import java.util.*;
public class ram {
    public static void main(String[]args){
        int num1,num2,sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\t\t\t+_+_+_+_+_+_+_+_+_Simple Calculator_+_+_+_+_+_+_+");
        System.out.println("\n\t\t\tEnter The Value of First Integer:");
        num1= scan.nextInt();
        System.out.println("\n\t\t\tEnter The Value of Second Integer:");
        num2= scan.nextInt();
        sum=num1+num2;
        System.out.println("\n\t\t\tSum of Numbers "+num1+"and "+num2+" is "+sum);
        sum=num2-num1;
        System.out.println("\n\t\t\tDifference Between Numbers "+num1+"and "+num2+" is "+sum);
        sum=num1*num2;
        System.out.println("\n\t\t\tProduct  of Numbers "+num1+"and "+num2+" is "+sum);
        sum=num2/num1;
        System.out.println("\n\t\t\tDivision of Numbers "+num1+"and "+num2+" is "+sum);
        sum=num2%num1;
        System.out.println("\n\t\t\tModulus of Numbers "+num1+"and "+num2+" is "+sum);
      }
}