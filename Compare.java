import java.util.Scanner;
public class Compare {
    public static void main(String[]args)
    {
        int num1,num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value");
        num1= scanner.nextInt();
        System.out.println("Enter the second value");
        num2= scanner.nextInt();
        System.out.println(" "+num1+" + "+num2+" ="+(num1+num2));
        System.out.println(" "+num1+" - "+num2+" ="+(num1-num2));
        System.out.println(" "+num1+" * "+num2+" ="+(num1*num2));
        System.out.println(" "+num1+" / "+num2+" ="+(num1/num2));
        System.out.println(" "+num1+" % "+num2+" ="+(num1%num2));
        System.out.println("The average of "+num1+" and "+num2+" is  " +((num1+num2)/2));
        if(num1==num2)
        {
            System.out.println("The first value "+num1+" is equal to the second value"+num2);
        }
        else if(num1<num2)
        {
            System.out.println("The first value "+num1+" is lesser than the second value "+num2);
        }
        else {
            System.out.println("The first value "+num1+" is greater than the second value "+num2);
        }

    }
}