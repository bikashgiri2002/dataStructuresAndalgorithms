package Array;

public class KadaneAlgorithems {
    public static void kadane(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for (int i=0; i<arr.length; i++){
            cs=cs+arr[i];
            if (cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("maximum sum is "+ms);
    }
    public static void main(String[] args) {
        int arr[]={2,-4,5,7,-8,9,-11};
        kadane(arr);

    }
}
