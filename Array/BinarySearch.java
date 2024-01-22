package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements:");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number you wants to Search:");
        int key=sc.nextInt();
        int x=0;
        Arrays.sort(arr);
        int start=0, end=arr.length-1;
        while(start <= end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println(key+" is present at index "+mid);
                x++;
                break;
            }
            if (arr[mid]< key){
                start=mid+1;
            }
            if (arr[mid]> key){
                end=mid-1;
            }
        }
        if(x==0){
            System.out.println(key+" is not present in array");
        }
    }
}
