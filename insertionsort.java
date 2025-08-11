import java.util.*;
public class insertionsort {
    public static void sort(int arr[]){
         int N= arr.length;
         for(int i=0;i<N;i++){
             int j=i;
             int temp=arr[i];
             while(j>0&& temp<arr[j-1]){
                 arr[j]=arr[j-1];
                 j=j-1;
             }
             arr[j]=temp;
         }
    }
    public static void main(String[]args)
    {
        System.out.println("\n\t\t\tInsertion Sort");
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\t\t\tEnter the number of values that will be entered: ");
        n =scan.nextInt();
        System.out.println("\n\t\t\tEnter "+n+" Values :");
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();

        }
        sort(arr);
        System.out.println("\n\t\t\tAfter Sorting Numbers Using Insertion Sort :");
        for(int i=0;i<n;i++)
        {
            System.out.println("\t\t\t"+arr[i]+" ");
        }
        System.out.println( );
    }
}