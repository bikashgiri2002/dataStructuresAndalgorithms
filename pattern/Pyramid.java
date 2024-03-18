package pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter row Size: ");
        int row=sc.nextInt();
        //pyramid logic
        for (int i=1; i<=row; i++){
            //space print
            for (int j=1; j<=row-i; j++){
                System.out.print("  ");
            }
            //star print
            for (int k=1; k<= 2*i-1; k++){
                System.out.print("* ");
            }
            //move to new line
            System.out.println();
        }
    }
}
