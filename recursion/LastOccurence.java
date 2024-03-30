package recursion;

public class LastOccurence {
    static int lastOccurence(int arr[],int key,int i){
        if (i==arr.length)
            return -1;
        int lastIndex=lastOccurence(arr,key,i+1);
        if(lastIndex == -1 && arr[i]== key){
            return i;
        }
            return lastIndex;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,3,4,5,5,6,6,7,8,1};
        System.out.println(lastOccurence(arr,9,0));
    }
}
