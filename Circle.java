import java.util.Scanner;

class cwh
{
    private float radius;
    float getRadius(float rad)
    {
        return radius;
    }
    void setRadius(float a)
    {
        radius=a;
    }
    void setArea(float area)
    {
        if(area==(3.141f)*radius*radius)
        {
            System.out.println("The area of the circle is "+area);
        }
        else
        {
            System.out.println("Be Careful"+area+"is not the area of the circle");
        }
    }
    void setPerimeter(float Perimeter)
    {
        if(Perimeter==4f*3.14f*radius)
        {
            System.out.println("The perimeter of the rectangle"+Perimeter);
        }
        else
        {
            System.out.println("Be Careful"+Perimeter+"is not the area of the rectangle");
        }
    }
}
public class Circle {
    public static void main(String[]args)
    {
        cwh circle= new cwh();
        float rad,area,peri;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the radius value");
        rad= scanner.nextFloat();
        System.out.println("Enter the Area value");
        area= scanner.nextFloat();
        circle.setArea(area);
        System.out.println("The Radius of the circle"+circle.getRadius(rad));
        System.out.println("Enter the Perimeter value");
        peri= scanner.nextFloat();
        circle.setRadius(peri);
    }
}