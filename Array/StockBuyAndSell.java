package Array;
import java.util.*;
public class StockBuyAndSell {
    public static int profit(int arr []){
        //time complexity O(n)
        int buyPrice=arr[0];
        int maxProfit=0;
        for (int i=0; i<arr.length; i++){
            if(buyPrice < arr[i]){
                int profit=arr[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
                //maxProfit = Math.max(max , (arr[i]-buyPrice) );
            }
            else{
                buyPrice=arr[i];
            }
        }
        return maxProfit;
    }
    static int maxProfit(int prices[]){
        //Time Complexity O(n^2)
        int max = 0 ;
        for (int i=0; i< prices.length; i++){
            for (int j=i+1 ; j< prices.length; j++){
                if (prices[j] > prices[i]){
                    max = Math.max(max , (prices[j]-prices[i]) );
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]= {7,1,5,3,6,4};
        System.out.println("maximum profit is "+profit(arr));
        System.out.println("maximum profit is "+maxProfit(arr));
    }
}
