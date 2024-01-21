package Array;
import java.util.Scanner;


public class SelectionSort {
    public static void selectionSort(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        System.out.println("Sorted array is:");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
