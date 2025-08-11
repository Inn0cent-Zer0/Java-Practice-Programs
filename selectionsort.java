import java.util.*;
public class selectionsort {
    public static void main(String[]args) {
        int a, N = 0;
        int arr[] = new int[N];
        N = arr.length;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\t\t+_+_+_+_+_+_//Bubble Sort//+_+_+_+_+_+_+");
        System.out.println("\n\t\tEnter the numbers of values to be entered:");
        a = scan.nextInt();
        for (int i = 0; i <= a; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            int small = i;
            for (int j = 1; j < arr.length; j++) {
                int temp;
                if (small > arr[j]) {
                    small = j;
                }
                temp = arr[small];
                arr[small] = arr[i];
                arr[i] = temp;
            }

        }
        for (int i = 1; i <= arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
