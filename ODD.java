public class ODD
{
   public static  void main(String[]args)
   {
      int num1;
      num1= Integer.parseInt(args[0]);
      if(num1%2==0)
      {
         System.out.println("The Entered number is an even number");
      }
      else
      {
         System.out.println("The Entered number is an odd number");
      }
   }

}