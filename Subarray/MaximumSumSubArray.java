package Subarray;
// kdanes algo to print sum as well as sub array with maximum value.
// (Important : null sub arr included[])
public class MaximumSumSubArray {
    public static void main(String[] args) {
        int start = 0;
        int ans_start = -1;
        int ans_last = -1;
        int arr[] = {-2,-3,-4,-2,-2,-1,-6,-3};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(sum == 0){
                start = i;
            }
            sum = sum + arr[i];

            if(sum < 0){
                sum = 0;
            }
            if(sum > max){
                max = sum;
                ans_start = start;
                ans_last = i;
            }
        }
        if(ans_last == 0 && ans_start == 0 ){
            System.out.println(-1);
            System.out.println(-1);
            return;
        }
        System.out.println(ans_start);
        System.out.println(ans_last);
    }
}
