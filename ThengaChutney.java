import java.util.Scanner;

public class ThengaChutney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Size, Even = 0, Odd = 0;
        System.out.println("Enter the size of the Number Array");
        Size = scanner.nextInt();
        int[] Numberr = new int[Size];
        System.out.println("Enter " + Size + " ELements");
        for (int i = 0; i < Size; i++) {
            Numberr[i] = scanner.nextInt();
        }
        for (int i = 0; i < Size; i++) {
            if ((Numberr[i] % 2) == 0) {
                System.out.println("The Number " + Numberr[i] + " is Even");
                Even += 1;
            } else {
                System.out.println("The Number " + Numberr[i] + " is Odd");
                Odd += 1;
            }
        }
        System.out.println("Even : " + Even + "\nOdd : " + Odd);
    }
}
