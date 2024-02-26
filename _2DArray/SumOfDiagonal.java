package _2DArray;

public class SumOfDiagonal {
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        //time complexity O(n^2)
//        for (int i=0; i< matrix.length; i++){
//            for (int j=0; j<matrix[0].length; j++){
//                if (i == j){
//                    sum+=matrix[i][j];
//                } else if (i+j == matrix.length-1) {
//                    sum+=matrix[i][j];
//                }
//            }
//        }
        //time complexity O(n)
        for (int i=0; i< matrix.length; i++){
            sum+=matrix[i][i];
            if (i != matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][]={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        System.out.println(diagonalSum(matrix));
    }
}
