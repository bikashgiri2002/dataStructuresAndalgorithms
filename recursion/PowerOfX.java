package recursion;

public class PowerOfX {
    static int powerOf(int x,int n){
        //time complexity O(n)
        if(n==0){
            return 1;
        }
        return x*powerOf(x,n-1);
    }
    static int optimalPowerOf(int x,int n){
        //time complexity is O(log n)
        if(n==0){
            return 1;
        }
        int result=optimalPowerOf(x,n/2)*optimalPowerOf(x,n/2);
        if (n %2 !=0){
            result =x*result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(powerOf(2,10));
        System.out.println(powerOf(2,10));
    }
}
