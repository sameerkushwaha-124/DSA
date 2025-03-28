package Recursion;
import java.util.*;
public class LongestPelindromicSubstring {
    public static String longestPalindrome(String str){
        // my brain..
        int n = str.length();
        String max_string = "";
        for(int i = 0 ; i < n; i++){
            for(int j = i + 1; j < n; j++){
                String curr = str.substring(i,j+1);
                if(isPelindrom(curr)){
                    if(max_string.length() < curr.length()){
                        max_string = curr;
                    }
                }
            }
        }
        return max_string;
    }
    public static boolean isPelindrom(String str){
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abcba"));
    }
}
