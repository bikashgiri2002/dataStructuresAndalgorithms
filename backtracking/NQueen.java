package backtracking;

public class NQueen {
    public static void printBoard(char board[][]){
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][],int row,int column){
        //vertical up
        for (int i=row-1;i>=0;i--){
            if (board[i][column]=='Q'){
                return false;
            }
        }
        //left diagonal
        for (int i=row-1,j=column-1;i>=0&&j>=0;j--,i--){
            if (board[i][j]=='Q')
                return false;
        }
        //right diagonal
        for (int i=row-1,j=column+1; i>=0&&j< board.length;i--,j++){
            if (board[i][j]=='Q')
                return false;
        }
        return true;
    }
    public static void nQueen(char board[][],int row){
        if (board.length==row){
            System.out.println("Ans Board");
            printBoard(board);
            return;
        }
        for (int j=0;j<board.length;j++){
            if (isSafe(board,row,j)){
                board[row][j]='Q';
                nQueen(board,row+1);
                //backtracking step
                board[row][j]='x';
            }
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                board[i][j]='x';
            }
        }
        nQueen(board,0);
    }
}
