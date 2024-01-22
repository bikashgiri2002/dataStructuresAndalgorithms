package Array;
import java.util.*;


public class inbuiltSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the elements:");
        for (int i=0;i<n; i++){
            num[i]= sc.nextInt();
        }
        Arrays.sort(num);
        //Arrays.sort(arr,start index,end index);end index is not exclusive
        //time complexity is O(nlogn)
        //Collection.reverseOrder();
        for (int i=0;i<n; i++){
            System.out.println(num[i]);
        }
    }
}
