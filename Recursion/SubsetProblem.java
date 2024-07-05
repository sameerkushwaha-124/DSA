package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetProblem {
    public static void main(String str[]){
        int target = 0;
        int arr[] = {-1,0,1,2,-1,-4};
//        subset(arr,target,new ArrayList<>(),0);
//        subsetProblem(arr,"",target,0,0);

    }
    private static void subset(int arr[], int target, List<Integer> list,int idx){
        if(target == 0){
            System.out.println(list);
            return;
        }
        if(idx > arr.length)
            return;
        subset(arr,target,list,idx+1);
        list.add(arr[idx]);
        subset(arr,target-arr[idx],list,idx+1);
        list.remove(list.size()-1);

    }

    private static void subsetProblem(int arr[], String str,int target,int idx,int sum){
       if(idx >= arr.length)
           return;
       if(sum == target)
       System.out.println(str);
        subsetProblem(arr,str,target,idx+1,sum);
        subsetProblem(arr,str+arr[idx],target,idx + 1,sum+arr[idx]);
    }
    private static void printStirng(String str){
        for(int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}
