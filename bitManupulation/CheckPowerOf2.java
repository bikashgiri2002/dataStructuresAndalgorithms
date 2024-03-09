package bitManupulation;

import java.util.Scanner;

public class CheckPowerOf2 {
    public static boolean checkPow(int num){
        if ((num & num-1) == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        boolean x=checkPow(n);
        if (x){
            System.out.println(n+" is power of 2");
        }
        else {
            System.out.println(n+" is not power of 2");
        }
    }
}
