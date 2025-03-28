package Recursion;
import java.util.*;
public class RatChasesCheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int maze[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            String str = sc.next();
            for(int j = 0; j < n; j++){
                maze[i][j] = str.charAt(j);
            }
        }
        int arr[][] = new int[m][n];
        maze(maze,m-1,n-1,0,0,arr);
        if(bool == false){
            System.out.println("NO PATH FOUND");
        }

    }
    private static void maze(int arr[][],int m,int n,int row,int col,int ans[][]){
        if(row < 0 || row >m || col < 0 || col > n || arr[row][col] == 'X'){
            return;
        }
        if(row == m && col == n){
            bool = true;
            ans[row][col] = 1;
            print(ans,m,n);
            return;
        }
        ans[row][col] = 1;
        arr[row][col] = 'X';
        maze(arr,m,n,row-1,col,ans);

        maze(arr,m,n,row+1,col,ans);

        maze(arr,m,n,row,col-1,ans);

        maze(arr,m,n,row,col+1,ans);

        ans[row][col] = 0;
        arr[row][col] = 'O';

    }
    static boolean bool;
    private static void print(int arr[][],int m,int n){

        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
