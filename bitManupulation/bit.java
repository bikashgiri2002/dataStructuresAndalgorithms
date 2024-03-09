package bitManupulation;

import java.util.Scanner;

public class bit {
    public static int getIthBit(int num,int i){
        int x=1<<i;
        if ((num & x) == 0){
            return 0;
        }
        else {
            return 1;
        }
    }
    public static int setIthBit(int num,int i){
        int x=1<<i;
        return num | x;
    }
    public static int clearIthBit(int num,int i){
        int x=~(1<<i);
        return num & x;
    }
    public static int updateIthBit(int num, int i, int bitValue){
        if (bitValue == 0)
            return clearIthBit(num,i);
        else
            return setIthBit(num,i);
    }
    public static int clearLastIBit(int num,int i){
        int x=~(0)<<i;
        return num & x;
    }
    public static int clearRangeOfBit(int num,int i,int j){
        int x=(~(0)<<j+1) | ((1<<i)-1);
        return num & x;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.print("Enter the index: ");
        int i=sc.nextInt();
        System.out.println(i+"th bit of "+num+" is "+getIthBit(num,i));
        System.out.println("result of "+i+"th bit set is "+setIthBit(num,i));
        System.out.println("result of "+i+"th bit clear is "+clearIthBit(num,i));
    }
}
