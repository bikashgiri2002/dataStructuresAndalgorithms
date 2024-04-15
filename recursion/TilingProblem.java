package recursion;

import java.util.Scanner;

public class TilingProblem {
    public static int tilingProblem(int n){
        if (n==0 || n==1){
            return 1;
        }
        int verticalPossibilities=tilingProblem(n-1);
        int horizontalPossibilities=tilingProblem(n-2);
        //total possibilities
        return verticalPossibilities+horizontalPossibilities;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of board(2*n?): ");
        int n=sc.nextInt();
        System.out.print("No. of possible ways is "+tilingProblem(n));
    }
}
