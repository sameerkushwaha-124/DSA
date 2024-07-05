package Recursion;
import java.util.ArrayList;
import java.util.List;
public class NQueens {
    public static void main(String[] args){
        char board[][] = new char[4][4];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> result = new ArrayList<>();
        queens(board,0,result);
        System.out.println(result);

    }
    static void queens(char board[][],int row,List<List<String>>
            result){
        if(row == board.length){
            result.add(inListString(board));
            return;
        }
        for(int col = 0; col < board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                queens(board,row+1,result);
                board[row][col] = '.';
            }
        }
    }
    static List<String> inListString(char[][] board){
        List<String> ls = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            String row = new String(board[i]);
            ls.add(row);
        }
        return ls;
    }
    static boolean isSafe(char board[][],int row,int col){
        // check virtical row.
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // for checking left diagonal.
        int max_left = Math.min(row,col);
        for(int i = 0; i <= max_left; i++){
            if(board[row-i][col - i] == 'Q'){
                return false;
            }
        }
        // for checking right diagonal.
        int max_right = Math.min(row,board.length-1-col);
        for(int i = 0; i <= max_right; i++){
            if(board[row - i][col + i] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
