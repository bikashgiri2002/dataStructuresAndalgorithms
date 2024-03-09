package bitManupulation;

import java.util.Scanner;

public class FastExponentiation {
    public static int fastExpo(int a, int n){
        int ans=1;
        while(n >0){
            if ((n & 1) == 1){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println("Enter the pow :");
        int pow=sc.nextInt();
        System.out.println(num+" power "+pow+" is "+fastExpo(num,pow));
    }
}
