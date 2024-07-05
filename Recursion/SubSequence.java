package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int arr[] = {1,2,3};

        subSeq(result,new ArrayList<>(),arr,0);
        System.out.println(result);
    }
    private static void subSeq(List<List<Integer>> list, List<Integer> result, int arr[], int idx){
        if(idx == arr.length   ){
            list.add(new ArrayList<>(result));
            return;
        }
        result.add(arr[idx]);
        subSeq(list,result,arr,idx+1);
        result.remove(result.size()-1);
        subSeq(list,result,arr,idx+1);
    }

}
