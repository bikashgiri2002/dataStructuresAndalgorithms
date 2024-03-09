package bitManupulation;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        //even of without arithmetic operator
        if((num & 1) == 0){
            System.out.println(num+" is even");
        }
        else {
            System.out.println(num+" is odd");
        }

    }
}
