package Array;

public class Prefix_sum_in_Sub_arrays {
    public static int prefix_sum(int arr[] ,int prearr[]){
//        for(int i=0;i<arr.length; i++){
//            int sum=0;
//            for(int j=0; j<=i; j++){
//                sum=sum+arr[j];
//            }
//            prearr[i]=sum;
//        }
        int max_sum= Integer.MIN_VALUE;
        prearr[0]=arr[0];
        for(int i=1;i<prearr.length; i++){
            prearr[i]=prearr[i-1]+arr[i];
        }
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++) {
                int sum = (i == 0) ? prearr[j] : prearr[j] - prearr[i - 1];
                if (sum>max_sum){
                    max_sum=sum;
                }
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[]={2,-4,5,7,-8,9,-11};
        int prearr[] =new int[arr.length];
        int ans=prefix_sum(arr,prearr);
        System.out.println(ans);
    }
}
