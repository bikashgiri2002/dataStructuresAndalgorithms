package Array;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {3,5,2,1,4};
        int i= 0;
        while( i <arr.length){
            if (arr[i] != i+1){
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp ;
            } else {
                i++;
            }
            ArrayPrint.arrayPrint(arr);

        }
        ArrayPrint.arrayPrint(arr);
        System.out.println(Arrays.toString(arr));
    }
}
