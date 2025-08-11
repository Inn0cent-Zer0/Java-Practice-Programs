public class AddTwo
{
    public static void main(String[]args)
    {
        int num1,num2;
        num1= Integer.parseInt(args[0]);
        num2= Integer.parseInt(args[1]);
        System.out.println("The Sum           is "+(num1+num2));
        System.out.println("The Product       is "+(num1*num2));
        System.out.println("The Difference    is "+(num1-num2));
        System.out.println("The Quotient      is "+(num1/num2));
        System.out.println("The Remainder     is "+(num1%num2));
    }
}