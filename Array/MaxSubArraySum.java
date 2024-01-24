package Array;

public class MaxSubArraySum {
    public static void sumSubArray(int arr[]){
        int max_sum=Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                int sum=0;
                for (int k=i; k<=j;k++){
                    sum=sum+arr[k];
                    }
                System.out.println("current sub array sum= "+sum);
                if (sum>max_sum){
                    max_sum=sum;
                }
            }
        }
        System.out.println("maximum subarray sum="+max_sum);
    }

    public static void main(String[] args) {
        int arr[]={2,-4,5,7,-8,9,-11};
        sumSubArray(arr);
    }
}
