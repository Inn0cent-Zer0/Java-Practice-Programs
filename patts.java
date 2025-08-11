import java.util.*;
public class patts {
    public static void main(String[]args) {
        int opt , i,j, row, column, range = 1;
        Scanner scan = new Scanner(System.in);
        while (range!= 0) {
            System.out.println("\n\t+_+_+_+_+_+_+//Printing Patterns using for Loop//+_+_+_+_+_+");
            System.out.println("\n\tEnter from the options shown below");
            System.out.println("\n\t Press 1 to print Solid Rectangle  Star Pattern ");
            System.out.println("\n\t Press 2 to print Hollow Rectangle  Star Pattern ");
            System.out.println("\n\t Press 3 to print Half Pyramid   Star Pattern ");
            System.out.println("\n\t Press 4 to print Half Pyramid Number Pattern ");
            System.out.println("\n\t Press 5 to print 180°Half Pyramid Star Pattern ");
            System.out.println("\n\t Press 6 to print 180°Half Pyramid Number Pattern ");
            System.out.println("\n\t Press 7 to print Floyd's Triangle  Number Pattern ");
            System.out.println("\n\t Press 0 to  Exit the process");
            range = scan.nextInt();
            opt= scan.nextInt();

            switch (opt) {
                case 1 -> {
                    System.out.println("\n\t+_+_+_+_+_+_+//Solid Rectangle Star Pattern//+_+_+_+_+_+");
                    System.out.println("\n\tEnter the  column range :");
                    row = scan.nextInt();
                    System.out.println("\n\tEnter the  row range :");
                    column = scan.nextInt();
                    for (i = 1; i <= row; i++) {
                        for (j = 1; j <= column; j++) {
                            System.out.print("* ");
                        }
                        System.out.println(" ");
                    }
                }
                case 2 -> {
                    System.out.println("\n\t+_+_+_+_+_+_+//Solid Rectangle Star Pattern//+_+_+_+_+_+");
                    System.out.println("\n\tEnter the  column range :");
                    row = scan.nextInt();
                    System.out.println("\n\tEnter the  row range :");
                    column = scan.nextInt();
                    for (i = 1; i <= row; i++) {
                        for (j = 1; j <= column; j++) {
                            if (i == 1 || j == 1 || i == row || j == column) {
                                System.out.print("* ");
                            }

                        }
                        System.out.println(" ");
                    }
                }
                case 3 -> {
                    System.out.println("\n\t+_+_+_+_+_+_+//Solid Rectangle Star Pattern//+_+_+_+_+_+");
                    System.out.println("\n\tEnter the  row range :");
                    row = scan.nextInt();
                    for (i = 1; i <= row; i++) {
                        for (j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println(" ");
                    }
                }
                case 4 -> {
                    System.out.println("\n\t+_+_+_+_+_+_+//Solid Rectangle Star Pattern//+_+_+_+_+_+");
                    System.out.println("\n\tEnter the  row range :");
                    row = scan.nextInt();
                    for (i = 1; i <= row; i++) {
                        for (j = 1; j <= i; j++) {
                            System.out.print(j + " ");
                        }
                        System.out.println(" ");
                    }
                }
                case 5 -> {
                    System.out.println("\n\t+_+_+_+_+_+_+//Solid Rectangle Star Pattern//+_+_+_+_+_+");
                    System.out.println("\n\tEnter the  row range :");
                    row = scan.nextInt();
                    for (i = row; i >= 1; i--) {
                        for (j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println(" ");
                    }
                }
                case 6 -> {
                    System.out.println("\n\t+_+_+_+_+_+_+//Solid Rectangle Star Pattern//+_+_+_+_+_+");
                    System.out.println("\n\tEnter the  row range :");
                    row = scan.nextInt();
                    for (i = row; i >= 1; i--) {
                        for (j = 1; j <= i; j++) {
                            System.out.print(j + " ");
                        }
                        System.out.println(" ");
                    }
                }
                case 7 -> {
                    System.out.println("\n\t+_+_+_+_+_+_+//Solid Rectangle Star Pattern//+_+_+_+_+_+");
                    System.out.println("\n\tEnter the  row range :");
                    row = scan.nextInt();
                    int k = 1;
                    for (i = 1; i <= row; i++) {
                        for (j = 1; j <= i; j++) {
                            System.out.print(k + " ");
                            k++;
                        }
                        System.out.println(" ");
                    }
                }
            }
        }
    }
}