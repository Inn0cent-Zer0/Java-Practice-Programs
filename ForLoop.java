public class ForLoop {
    public static void main(String[]args)
    {
        System.out.print("{");

       for(int i=1;i<=100;i++)
        {
            System.out.print(i);
             System.out.print(",");
        }
         System.out.print("}");
        System.out.println();

        System.out.print("{");
        for(int i=100;i>=1;i--)
        {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.print("}");
        System.out.println();
        System.out.print("{");
        for(int i=0;i<=100;i+=7)
        {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.print("}");
        System.out.println();
        System.out.print("{");
        for(int i=1;i<=100;i+=1)
        {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.print("}");
        System.out.println();
        System.out.print("{");
        for(int i=1;i<=100;i+=2)
        {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.print("}");
        System.out.println();
        System.out.print("{");
        for(int i=0;i<=100;i+=3) {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.print("}");
        System.out.println();
        System.out.print("{");
        for(int i=100;i>=1;i-=4) {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.print("}");
        System.out.println();
        System.out.print("{");
        for(int i=2;i<=100;i+=4) {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.print("}");
        System.out.print("{");
        for(int i=100;i>=1;i-=11) {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.print("}");

    }
}