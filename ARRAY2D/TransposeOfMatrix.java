package ARRAY2D;

public class TransposeOfMatrix {
    public static void main(String str[]){
        int arr[][] = {{1,2,3},{4,5,6}};
        int row =  arr[0].length;
        int column = arr.length;
        int nums[][] = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                nums[i][j] = arr[j][i];
            }
        }
        System.out.println();
    }
}
