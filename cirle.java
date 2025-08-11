import static java.lang.Math.PI;
import static java.lang.Math.pow;

class cirle {
    double Area;

    public static void main(String[] args) {
    }

    public double circl(double radius) {
        Area = 2 * PI * pow(radius, 2);
        System.out.println("The Total Area of the circle is " + Area);
        return Area;
    }
}