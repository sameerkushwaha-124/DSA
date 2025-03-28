package Array_Assignment;

import java.util.*;
public class InversionOfArray {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =  new  int[n];
        for(int i = 0 ; i  < n; i++){
            arr[i] = sc.nextInt();
        }
        int nums[] = new int[n];
        recurr(arr,0, nums);
        for(int i = 0 ; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void recurr(int arr[],int idx,int nums[]){
        if(idx == arr.length){
            return;
        }

        nums[arr[idx]] = idx;
        recurr(arr,idx+1,nums);
    }
}
