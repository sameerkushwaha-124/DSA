package Recursion;

import java.util.*;

public class PP {

    public static void main(String[] args) {
        List<List<String>> ans= new ArrayList<>();
        Part("aab",new ArrayList<>(),ans,0);
        System.out.println(ans);
    }
    public static void Part(String ques,List<String> ll,List<List<String>> ans,int start){
        if(start == ques.length()){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=start;i<ques.length();i++){
            String s=ques.substring(1);
            if(isPalindrome(s)) {
                ll.add(s);
                Part(ques.substring(i), ll, ans,i+1);
                ll.remove(ll.size() - 1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
