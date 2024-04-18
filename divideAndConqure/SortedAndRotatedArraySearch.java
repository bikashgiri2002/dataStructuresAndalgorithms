package divideAndConqure;

public class SortedAndRotatedArraySearch {
    public static int searchInRotation(int arr[],int key,int si,int ei){
        int mid =(si+ei)/2;
        if (arr[mid]==key){
            return mid;
        }
        //for left,or L1
        if (arr[si]<=arr[mid]){
            if (arr[si]<= key && key <=arr[mid]){
                return searchInRotation(arr,key,si,mid-1);
            }
            else {
                return searchInRotation(arr,key,mid+1,ei);
            }
        }
        //right side orL2
        else{
            if (arr[mid]<=key && key<= arr[ei]){
                return searchInRotation(arr,key,mid+1,ei);
            }
            else{
                return searchInRotation(arr,key,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int key=0;
        int n=searchInRotation(arr,0,0, 6);
        System.out.println(n);
    }
}
