package Array;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The size of array:");
        int n=sc.nextInt();
        int arr[]=new int[5];
        System.out.println("Enter the Elements:");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println("Sorted array is:");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+", ");
        }

    }
}
