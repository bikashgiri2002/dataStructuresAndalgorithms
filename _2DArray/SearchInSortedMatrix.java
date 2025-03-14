package _2DArray;

public class SearchInSortedMatrix {
    // Time complexity: O(m+n) where m is number of rows and n is number of columns.
    public static boolean search(int key,int matrix[][]){
        int row=0;
        int col= matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if (matrix[row][col] == key){
                System.out.println(key+" present at ("+row+","+col+")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println(key+" is not present");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        search(33,matrix);
    }
}
