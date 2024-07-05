package Recursion;

public class Strings {
    public static void main(String args[]){
        String str = "babad";
        subSet(str,"");
    }
    private static void subSet(String str,String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

            char ch = str.charAt(0);
            subSet(str.substring(1),ans+ch);
            subSet(str.substring(1),ans);
    }
}
