package ARRAY;

public class MergeAlternately {
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
        public static void main(String args[])
        {
            String word1="abcrt";
            String word2="pqre";
            String str=mergeAlternately(word1,word2);
            System.out.println(str);
        }
    }

