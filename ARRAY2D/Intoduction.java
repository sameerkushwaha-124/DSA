package ARRAY2D;
import java.util.*;
public class Intoduction {
    public static void main(String str[]){
        Scanner sc = new Scanner(System.in);
        int[] []nums = {{1},{11,2},{1,2,4}};
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j]);
            }
        }

        // if there is 2d array with start and end value like...
        int[][] arr = {{1,2},{13,2},{14,4}};
        // if you need to sort according to start value then you can do ..
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        System.out.println(Arrays.toString(arr));


    }
}
