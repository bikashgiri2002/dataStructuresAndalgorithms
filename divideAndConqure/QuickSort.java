package divideAndConqure;

public class QuickSort {
    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for (int j=si;j<ei;j++){
            if(arr[j]<=pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[ei]=temp;
        return i;
    }
    public static void quickSort(int arr[],int si,int ei){
        if (si<ei){
            int pivotIndex=partition(arr,si,ei);

            quickSort(arr,si,pivotIndex-1);
            quickSort(arr,pivotIndex+1,ei);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,3,6,7,8,1,25};
        quickSort(arr,0, arr.length-1);
        printArr(arr);
    }
}
