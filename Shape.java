import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        int Option;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Choose from the below following ");
        System.out.println("Press 1 to Find the Total Area of a Rectangle");
        System.out.println("Press 2 to Find the Total Area of a Circle");
        System.out.println("Press 3 to Find the Total Area of a Triangle");
        System.out.println("Press 4 to Exit the process");

        Option = scanner.nextInt();

        switch (Option) {
            case 1 -> {
                rectale re = new rectale();
                double Length, Breadth;
                System.out.println("Enter the Length of Rectangle");
                Length = scanner.nextDouble();
                System.out.println("Enter the Breadth of  Rectangle");
                Breadth = scanner.nextDouble();
                re.rect(Length, Breadth);
            }
            case 2 -> {
                cirle ci = new cirle();
                System.out.println("Enter the Radius of the Circle");
                double Radius = scanner.nextDouble();
                ci.circl(Radius);
            }
            case 3 -> {
                Triangle tria = new Triangle();
                System.out.println("Enter the Length of Triangle");
                int Length = scanner.nextInt();
                System.out.println("Enter the Breadth of  Triangle");
                int Breadth = scanner.nextInt();
                tria.tri(Length, Breadth);
            }
            default -> {
                System.out.println("Please enter an valid Option");
            }

        }

    }
}