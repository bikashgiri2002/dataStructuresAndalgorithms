package Array;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[j]){
                continue;
            }
            j++;
            nums[j]=nums[i];
        }
        return ++j;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
