import java.util.*;
public class bubblesort {
    public static void print(int arr[]) {
        for (int i = 1; i <= arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int a, N= 0;
        int arr[] = new int[N];
        N = arr.length;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\t\t+_+_+_+_+_+_//Bubble Sort//+_+_+_+_+_+_+");
        System.out.println("\n\t\tEnter the numbers of values to be entered:");
        a = scan.nextInt();
        for (int i = 1; i <= a; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }
        }
    print(arr);
    }
}