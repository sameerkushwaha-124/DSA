package Recursion;

public class LetterComb {
    public static void main(String[] args) {
        String[] d={"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
        String s="12";
        String ans="";
        letterComb(s,ans,d);
    }
    public static void letterComb(String s, String ans,String d[]){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        String p = d[ch - '0'];
        for(int i = 0 ; i < p.length(); i++){
            letterComb(s.substring(1),ans+p.charAt(i),d);
        }
    }
}
