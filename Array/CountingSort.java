package Array;
import java.util.*;

public class CountingSort {
    public static int biggest(int arr[]){
        int big=arr[0];
        for(int i=1; i<arr.length ;i++){
//            if (arr[i]>big){
//                big=arr[i];
//            }
            big=Math.max(big,arr[i]);
        }
        return big;
    }
    public static void countingSort(int arr[]){
        int big=biggest(arr);
        int count[]=new int[big+1];
        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j=0;
        for (int i=0;i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements:");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        countingSort(arr);
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+", ");
        }

    }
}
