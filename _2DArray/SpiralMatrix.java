package _2DArray;
import java.util.Scanner;

public class SpiralMatrix {
    public static void spiralMatrix(int matrix[][]){
       int startRow=0;
       int endRow= matrix.length-1;
       int startColumn=0;
       int endColumn=matrix[0].length-1;
       while(startRow <= endRow && startColumn <= endColumn){
           //top line
           for (int j=startColumn; j<= endColumn; j++){
               System.out.print(matrix[startRow][j]+", ");
           }
           // right
           for(int i= startRow+1; i<= endRow; i++){
               System.out.print(matrix[i][endColumn]+", ");
           }
           //bottom
           for (int j=endColumn-1; j>=startColumn; j--){
               if (startColumn == endColumn){
                   break;
               }
               System.out.print(matrix[endRow][j]+", ");
           }
           //left
           for (int i=endRow-1; i>= startRow+1; i--){
               if (startRow == endRow){
                   break;
               }
               System.out.print(matrix[i][startColumn]+", ");
           }
           startRow++;
           startColumn++;
           endRow--;
           endColumn--;
       }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of row: ");
        int row=sc.nextInt();
        System.out.print("Enter the size of column: ");
        int column=sc.nextInt();
        int matrix[][]= new int[row][column];
        System.out.println("Enter the data in matrix");
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        spiralMatrix(matrix);
    }
}
