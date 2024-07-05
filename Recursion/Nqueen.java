package Recursion;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Nqueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queen=sc.nextInt();
        boolean board[][] = new boolean[queen][queen];
        n_queens(queen,board,0);
    }
    public static void n_queens(int n,boolean board[][],int row){
        if(n == 0){
            print(board);
            return;
        }
        for(int col = 0; col < board[row].length; col++){
                if(safe(board,row,col)){
                    board[row][col] = true;
                    n_queens(n-1,board,row+1);
                    board[row][col] = false;
                }

        }
    }

    public static boolean safe(boolean board[][],int row,int col){
        // left digonal.
        int r = row;
        int c = col;
        while(r>= 0 && c >= 0){
            if(board[r][c] == true){
                return false;
            }
            r--;
            c--;
        }
        // right digonal.
        int r1 = row;
        int c1 = col;
        while(r1 >= 0 && c1 < board[0].length ){
            if(board[r1][c1] == true){
                return false;
            }
            r1--;
            c1++;
        }
        // for column
        int r2 = row;
        int c2 = col;
        while(r2 >= 0){
            if(board[r2][c2] == true){
                return false;
            }
            r2--;
        }
        return true;
    }
    public static void print(boolean bool[][]){
        for(int i = 0; i < bool.length; i++){
            for(int j = 0; j < bool[i].length; j++){
                System.out.print(bool[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++++++");
    }


}
