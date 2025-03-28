package Recursion;

/*
Input: s = "ababccc"
Output: 5
Explanation: One way to split maximally is ['a', 'b', 'ab', 'c', 'cc']. Splitting like ['a', 'b', 'a', 'b', 'c', 'cc'] is not valid as you have 'a' and 'b' multiple times.
Example 2:

Input: s = "aba"
Output: 2
Explanation: One way to split maximally is ['a', 'ba'].
Example 3:

Input: s = "aa"
Output: 1
Explanation: It is impossible to split the string any further.  */
import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class Max_Count_Of_Substring_Unique {
    public static void main(String[] args) {
        String s  = "ababccc";
        int max_substring_unique = backtrack(0,s,new HashSet<>());
        System.out.println(max_substring_unique);
    }
    public static int backtrack(int i, String s, HashSet<String> set){
        if(i == s.length()){
            return 0;
        }
        int maxSplits = 0;
        for(int j = i + 1; j <= s.length(); j++){
            String substring = s.substring(i,j);
            if(!set.contains(substring)){
                set.add(substring);
                int splits = 1 + backtrack(j, s, set);
                maxSplits = Math.max(maxSplits, splits);
                set.remove(substring);
            }
        }
        return maxSplits;
    }
}
