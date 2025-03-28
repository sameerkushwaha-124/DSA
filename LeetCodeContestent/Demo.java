package LeetCodeContestent;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
//        System.out.println(luckyNumbers(new int[][]{{7,8},{1,2}}));

    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int min_idx = -1;
        for(int i = 0; i < row; i++){

            int min = Integer.MAX_VALUE;
            for(int j = 0;j < col; j++){
                if(min > matrix[i][j]){
                    min_idx = j;
                    min = matrix[i][j];
                }

            }
            if(min == Max(matrix,min_idx)){
                list.add(min);
            }
        }
        if(list.isEmpty())
            list.add(-1);
        return list;
    }
    public static int Max(int [][]arr, int col){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i][col] > max){
                max = arr[i][col];
            }
        }
        return max;
    }

}
