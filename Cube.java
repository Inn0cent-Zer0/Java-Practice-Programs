public class Cube {
    public static void main(String[]args)
    {
        int cube,square;
        System.out.println("Number\tSquare\tCube\t");
        for(int count=0;count<=10;count++)
        {
            cube= count*count*count;
            square= count*count;
            System.out.printf("%d\t%d\t%d\t",count,square,cube);
            System.out.println();
        }
        System.out.println();
    }
}