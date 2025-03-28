package LeetCodeContestent;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

class Solution {


    public static void main(String[] args) {
//        System.out.println(maximumSubarraySum(new int[]{-1, -2, -3, -4}, 2));
//        System.out.println(isPossibleToSplit(new int[]{1,1,1,1}));
//        System.out.println(minimumSubarrayLength(new int[]{2,1,8},11));
        System.out.println(maxVowels("abciiidef",3));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        int max = max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {

                    int sum = 0;
                    for (int p = i; p <= j; p++) {
                        sum = sum + nums[p];
                    }
                    max = Math.max(max, sum);
                }
            }
        }
        if (max == Integer.MIN_VALUE) {
            max = 0;
        }
        return max;
    }

    public static boolean isPossibleToSplit(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        int idxArr1[] = new int[nums.length / 2];
        List<Integer> list2 = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (list1.size() == nums.length / 2) {
                break;
            }
            if (!list1.contains(nums[i])) {
                list1.add(nums[i]);
                idxArr1[j++] = i;
            }
        }
        if(list1.size() != idxArr1.length){
            return false;
        }
//        for(int i= 0; i < list1.size();i++){
//            System.out.println(list1.get(i));
//        }
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != idxArr1[k]){
                k++;
                list2.add(nums[i]);
            }
        }
        if(list1.size() == list2.size()){
            for(int i = 0; i < list1.size() / 2; i++){
                if(list1.get(i) == list1.get(list1.size()-1-i) || list1.get(i) == list2.get(list2.size()-1-i)){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
    public static int minimumSubarrayLength(int[] nums, int m) {
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {

            int or = 0;
            for (int j = i; j < nums.length; j++) {
                or = or | nums[j];
                if (or >= m) {
                    if (len > (j - i + 1)) {
                        len = j - i + 1;
                    }
                }
            }
        }
        if(len ==  Integer.MAX_VALUE)
            return -1;
        return len;
    }
    public static int maxVowels(String s, int k) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < s.length()-k; i++){
            int count = 0;
            for(int j = i; j < i+k; j++){
                if(isVowel(s.charAt(j))){
                    count++;
                }
            }
            max = Math.max(count, max);
        }
        return max;
    }
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}
