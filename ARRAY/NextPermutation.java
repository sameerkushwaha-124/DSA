package ARRAY;
import java.util.Arrays;
public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {2,1,5,4,3,0,0};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
        public static void nextPermutation ( int[] arr){
            int idx = -1;
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] < arr[i + 1]) {
                    idx = i;
                    break;
                }
            }
            if (idx == -1) {
                reverse(arr, 0, arr.length - 1);
            } else {
                nextPerm(arr, idx);
            }
        }
    static void reverse ( int arr[], int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void nextPerm ( int arr[], int idx){
        for (int i = arr.length - 1; i > idx; i--) {
            if (arr[i] > arr[idx]) {
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        reverse(arr, idx + 1, arr.length - 1);
    }
}
