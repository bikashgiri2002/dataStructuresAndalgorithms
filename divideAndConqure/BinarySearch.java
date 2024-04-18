package divideAndConqure;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]={2,5,3,6,7,8,1,25};
        Arrays.sort(arr);
        QuickSort q=new QuickSort();
        q.printArr(arr);
        System.out.print("\nEnter the number you wants to Search:");
        int key=sc.nextInt();
        int x=0;
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
