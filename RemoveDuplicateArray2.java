import java.util.Arrays;

public class RemoveDuplicateArray2 {
    public static int removeElement(int[] nums){
                if(nums.length <= 1){
                    return nums.length;
                }
                int j = 2;
                for(int i = 1; i < nums.length; i++){
                    if(nums[i] != nums[j-2]){
                        nums[j] = nums[i];
                        j++;
                    }
                }
                return j;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(arr));
        int k = removeElement(arr);
        for(int i = 0; i < k; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
