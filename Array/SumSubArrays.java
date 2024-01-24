package Array;
import java.util.*;

public class SumSubArrays {
    public static void sumSubArray(int arr[]){
        int count=0;
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                int sum=0;
                for (int k=i; k<=j;k++){
                    sum=sum+arr[k];
                    System.out.print(arr[k]+", ");
                }
                System.out.println();
                System.out.println("sum of subarray is: "+sum);
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number of sub arrays is: "+count);
    }

    public static void main(String[] args) {
        int arr[]={2,4,5,7,8,9,11};
        sumSubArray(arr);
    }
}
