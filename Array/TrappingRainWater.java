package Array;
import java.util.*;

public class TrappingRainWater {
    public static int trappingRainWater(int arr[]){
        int sum=0;
        int rightHigh[]=new int[arr.length];
        int leftHigh[]=new int[arr.length];
        rightHigh[arr.length-1]=arr[arr.length-1];
        for (int i=arr.length-2; i>=0; i--){
            rightHigh[i]=Math.max(arr[i],rightHigh[i+1]);
        }
        leftHigh[0]=arr[0];
        for (int i=1; i<arr.length; i++){
            leftHigh[i]=Math.max(arr[i],leftHigh[i-1]);
        }
        for (int i=0; i<arr.length; i++){
            int waterHeight=Math.min(rightHigh[i],leftHigh[i]);
            sum += waterHeight-arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the height of building(only positive)");
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
            if(arr[i] <0){
                System.out.println("no negative number");
                i--;
            }
        }
        int sum=trappingRainWater(arr);
        System.out.println(sum);
    }
}