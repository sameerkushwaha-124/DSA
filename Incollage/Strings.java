package Incollage;

public class Strings {
    public static String mergeAlternately(String word1, String word2) {
        String str = "";
        if (word1.length() >=word2.length()) {
            int i;
            for (i = 0; i < word2.length(); i++) {
                str = str + word1.charAt(i) + word2.charAt(i);
            }
            str = str + word1.substring(i, word1.length());
        } else {
            int i;
            for (i = 0; i < word1.length(); i++) {
                str = str + word1.charAt(i) + word2.charAt(i);
            }
            str = str + word2.substring(i, word2.length());
        }
        return str;
    }

    public static void ReverseOrder(){
        String ar="Hello.My.Name.Is.Sameer";
        String arg[]=ar.split("\\.");
        String sen="";
        for(int i=arg.length-1;i>=0;i--)
        {
            if(i>=1) {
                sen = sen + arg[i] + ".";
            }
            else{
                sen=sen+arg[i];
            }
        }
        System.out.println(sen);
    }
    public static void main(String args[])
    {
//        String word1="abcrt";
//        String word2="pqre";
//        String str=mergeAlternately(word1,word2);
//        System.out.println(str);

        ReverseOrder();
    }
}
