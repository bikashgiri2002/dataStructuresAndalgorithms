package backtracking;

import Array.ArrayPrint;

public class BacktrackingArray {
    static ArrayPrint print=new ArrayPrint();
    public static void changeArray(int arr[],int i,int val){
        if(i==arr.length){
            return;
        }
        arr[i]=val;
        //function call step
        changeArray(arr,i+1,val+1);
        //backtracking step
        arr[i]=arr[i]-2;
    }
    public static void main(String[] args) {

        int n=5;
        int arr[]=new int[n];
        changeArray(arr,0,1);
        print.arrayPrint(arr);
    }
}
