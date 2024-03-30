package recursion;

public class FindTheFirstOccurence {
    static int i=0;
    static int firstOccurence(int arr[],int key){
        if (arr[i] == key){
            return i;
        }
        else {
            i++;
        }
        if(i == arr.length){
            return -1;
        }
        return firstOccurence(arr,key);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,5};
        System.out.println(firstOccurence(arr,1));
    }
}
