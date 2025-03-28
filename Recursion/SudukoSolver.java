package Recursion;

public class SudukoSolver {
    public static void main(String[] args) {
        char board[][] ={{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};
        solve(board,0,0);
    }
    public static void solve(char board[][],int row,int col){
        if(row == 9){
            print(board);
            return;
        }
        if(col == 9){
            solve(board,row+1,0);
            return;
        }
        if(board[row][col] != '.'){
            solve(board,row,col+1);
            return;
        }
        for(int i = 1; i <= 9; i++){
            if(isSafe(board,row,col,i)){
                board[row][col] = (char)(i+'0');
                solve(board,row,col+1);
                board[row][col] = '.';
            }
        }
    }
    public static void print(char ch[][]){
        for(int i = 0; i < ch.length; i++){
            for(int j = 0 ; j < ch[i].length;j++){
                System.out.print(ch[i][j]+",");
            }
            System.out.println();
        }
    }    public static boolean isSafe(char[][] board,int row,int col,int x){
        // colmn wise checking
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == (char)(x+'0')){
                return false;
            }
        }
        // row wise checking
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == (char)(x+'0')){
                return false;
            }
        }
        // square matrix.
        int i = row - row % 3 ;
        int j = col - col % 3 ;
        for(int k = i; k < i + 3; k++){
            for(int l = j ; l < j + 3; l++){
                if(board[k][l] == (char)(x + '0')){
                    return false;
                }
            }
        }
        return true;
    }
}
