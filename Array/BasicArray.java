package Array;
import java.util.*;

public class BasicArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the elements:");
        for (int i=0;i<n; i++){
            num[i]= sc.nextInt();
        }
        for (int i=0;i<n; i++){
            System.out.println(num[i]);
        }
    }
}
