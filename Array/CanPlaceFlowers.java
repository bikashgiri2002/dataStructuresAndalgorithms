package Array;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        boolean result;
        if(n == 0)
            result = true;
        else
            result = false;
        if(flowerbed.length == 1 && n == 1){
            if(flowerbed[0] == 0)
                return true;
            else
                return false;
        }
        if(flowerbed[0] == 0 && count < n){
            if(flowerbed[1] != 1){
                flowerbed[0] = 1;
                count++;
                result = true;
            }else{
                result = false;
                flowerbed[0] = 0;
            }
        }
        if(flowerbed[flowerbed.length-1] == 0 && count < n){
            if(flowerbed[flowerbed.length-2] != 1){
                flowerbed[flowerbed.length-1] = 1;
                count++;
                result = true;
            }else{
                result = false;
                flowerbed[flowerbed.length-1] = 0;
            }
        }
        int i = 1;
        while(count < n && i < flowerbed.length-1){
            if(flowerbed[i] != 1){
                int temp = flowerbed[i];
                flowerbed[i] = 1;
                if(flowerbed[i-1] != 1 && flowerbed[i+1] != 1){
                    count++;
                    result = true;
                }else{
                    result = false;
                    flowerbed[i] = temp;
                }
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,0,0,1,0,0};
        System.out.println(canPlaceFlowers(arr,1));
    }
}
