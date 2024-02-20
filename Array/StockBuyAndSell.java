package Array;
import java.util.*;
public class StockBuyAndSell {
    public static int profit(int arr []){
        int buyPrice=arr[0];
        int maxProfit=0;
        for (int i=0; i<arr.length; i++){
            if(buyPrice < arr[i]){
                int profit=arr[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
            else{
                buyPrice=arr[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[]= {7,1,5,3,6,4};
        System.out.println("maximum profit is "+profit(arr));
    }
}
