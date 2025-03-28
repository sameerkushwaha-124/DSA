package Oops;
class Test01 {
    public static String longestPalindrome(String s) {
        String str1="";
        for(int i=0;i<s.length();i++){
            for(int j = s.length()-1;j>=0;j++){
                if(i==j){
                    String str = "";
                    for(int k =0;k<=j;k++){
                        str = str + s.charAt(k);
                    }
                    StringBuilder sb = new StringBuilder(str);
                    if(str.equals(sb.reverse())){
                        str1 = str;
                        break;
                    }
                }
                if(str1!=""){
                    break;
                }
            }
            if(str1!=""){
                break;
            }
        }
        return str1;
    }

    public static void main(String[] args) {
       String str =  longestPalindrome("BaaBB");
        System.out.println("hellow");
    }
}