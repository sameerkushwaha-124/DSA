package Incollage;
import java.util.Arrays;

public class Learning {
    public static void main(String[] args) {
        lastIndex(new int[]{7,6,9,4,11,2,5});
    }
    public static void lastIndex(int arr[]){
        int value = arr[0];
        int idx = arr.length-1;
        for(int i = arr.length-1; i >= 0; i--){
            if(value < arr[i]){
                int temp  = arr[idx];
                arr[idx--] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[idx];
        arr[idx] = arr[0];
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }

}
