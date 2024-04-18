package divideAndConqure;

import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        //left side
        mergeSort(arr,si,mid);
        //right side
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si,j=mid+1,k=0;
        while(i<=mid && j<=ei){
            if (arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //extra elements in left hand side
        while(i<=si){
            temp[k++]=arr[i++];
        }
        //extra elements in right hand side
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy to main array
        for ( k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the size of Array: ");
//        int n=sc.nextInt();
        int arr[]={1,3,4,9,3,9,9};
//        System.out.println("Enter the elements of Array:");
//        for (int i=0; i<arr.length; i++){
//            arr[i]=sc.nextInt();
//        }
        mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted Array is:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
