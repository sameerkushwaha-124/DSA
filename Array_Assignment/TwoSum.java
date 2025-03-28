package Array_Assignment;
import java.util.*;
public class TwoSum {
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]  = sc.nextInt();
        }
        Arrays.sort(arr);
        int target = sc.nextInt();

        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " and " + arr[right]);

                left++;
                right--; // Move both pointers to avoid duplicates
            } else if (sum < target) {
                left++; // Increase sum by moving the left pointer
            } else {
                right--; // Decrease sum by moving the right pointer
            }
        }
    }
}