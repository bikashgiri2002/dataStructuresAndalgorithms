import java.util.Arrays;

public class RemoveDuplicateArray2 {
    public static int removeElement(int[] arr){
        int result = 0;
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if(count > 2){
                for(int j = i; j < arr.length-1; j++){
                    arr[j] = arr[j+1];
                }
                count--;
            }
            if(arr[i] == arr[i-1]){
                count++;
                result++;
            }else{
                count = 1;
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(arr));
        int k = removeElement(arr);
        System.out.println((Arrays.toString(arr)).substring(0,k));
    }
}
