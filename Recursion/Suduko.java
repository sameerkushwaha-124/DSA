package Recursion;
import java.util.*;
public class Suduko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suduko[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                suduko[i][j] = sc.nextInt();
            }
        }
        if (solve(suduko, n)) {
            System.out.println();
            print(suduko, n);
        } else {
            System.out.println();
            System.out.println("No solution exists.");
        }
    }

    private static void print(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static boolean solve(int arr[][],int n){
        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 0){
                    for(int k = 1; k <= 9; k++){
                        if(validity(arr,i,j,k)){
                            arr[i][j] = k;
                            if(solve(arr,n)){
                                return true;
                            }else{
                                arr[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean validity(int arr[][],int row,int col,int num){
        for(int i = 0; i < 9; i++){
            if(arr[i][col] == num){
                return false;
            }
            if(arr[row][i] == num){
                return false;
            }
            int str = (row / 3) * 3;
            int stc = (col / 3) * 3;
            for(int j = str; j < str+3; j++){
                for(int k = stc ; k < stc + 3; k++){
                    if(arr[j][k] == num){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
