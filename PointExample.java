class Point
{
    double x,y,z;
    public void main(String[] args)
    {
        double x,y,z;
        double x1 = this.x;
        double y1=this.y;
       double z1= this.z;
       System.out.println(x1);
       System.out.println(y1);
       System.out.println(z1);
    }
}
public class PointExample {
    public static void main(String[]args)
    {
        Point D= new Point();
        D.x=1.1;
        D.y=12.12;
        D.z=34.89;
        System.out.println("The x value is "+D.x);
        System.out.println("The y value is "+D.y);
        System.out.println("The z value is "+D.z);

    }
}