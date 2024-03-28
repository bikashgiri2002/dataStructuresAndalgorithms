package recursion;

public class CheckArrayIsSortedOrNot {
    static boolean checkArray(int arr[], int i){
        boolean a=true;
        if (i == arr.length-1){
            return a;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        return checkArray(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr1[]={2,1,3,4,5};
        System.out.println(checkArray(arr,0));
        System.out.println(checkArray(arr1,0));

    }
}
