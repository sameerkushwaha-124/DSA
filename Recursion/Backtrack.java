package Recursion;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Backtrack {
    public static void main(String[] args) {



//         combination
        int n = 4, k = 2;
//        List<List<Integer>> result = new ArrayList<>();
//        backtrack1(result,new ArrayList<>(),n,k,1);
//        System.out.println(result);

//        permutation.
        List<List<Integer>> perm = new ArrayList<>();
        backtrack2(perm,new ArrayList<>(),new int[]{1,2,3});
        System.out.println(perm);

    }
    private static void backtrack0(List<String> result,
                                   String comb,int n,int k,int start){
        if(comb.length() == k){
            System.out.print(comb + ",");
//            result.add(comb);
            return;
        }
        for(int i = start; i <= n; i++){
            comb = comb + i;
            backtrack0(result,comb,n,k,i+1);
            comb = comb.substring(0,comb.length());
        }
    }
    private static void backtrack1(List<List<Integer>> result,
                                  List<Integer> comb,int n,int k,int start){
        if(comb.size() == k){
            result.add(new ArrayList<>(comb));
            return;
        }
        for(int i = start; i <= n; i++){

            comb.add(i);
            backtrack1(result,comb,n,k,i+1);
            comb.remove(comb.size()-1);
        }
    }
    private static void backtrack2(List<List<Integer>> perm, List<Integer> result,
                          int nums[]){
        if(result.size() == nums.length){
            perm.add(new ArrayList<>(result));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(result.contains(nums[i])){
                continue;
            }
            result.add(nums[i]);
            backtrack2(perm,result,nums);
            result.remove(result.size()-1);
        }
    }
}
