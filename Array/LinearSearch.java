package Array;
import java.util.*;
public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements:");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number you wants to Search:");
        int key=sc.nextInt();
        int x=0;
        for (int i=0; i<n; i++){
            if(arr[i]==key){
                System.out.println(key+" is present at index "+i);
                x++;
            }
        }
        if(x==0){
            System.out.println(key+" is not present in array");
        }
    }
}
