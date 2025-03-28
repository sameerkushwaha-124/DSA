package Array_Assignment;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        // Input the size of the array
//        int N = sc.nextInt();
        int[] arr = {-1,0,1,2,-1,-4};

        // Input the array elements
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }

        // Input the target sum
//        int target = sc.nextInt();
        int target = 0;

        // Find and print the triplets
        findTriplets(arr, target);
    }

    public static void findTriplets(int[] arr, int target) {
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length; i++){
            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }
            int left = i+1;
            int right = arr.length-1;
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum > target){
                    right--;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    System.out.println(arr[i] + ", " + arr[left]+" and "+arr[right]);
                    left++;
                    right--;  // moving both pointer to avoid duplicates.
                }
            }

        }
    }
}
