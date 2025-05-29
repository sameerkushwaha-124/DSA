package TCS;

import java.util.*;

// Harshit Problem.
public class Day1 {
    public static void main(String[] args) {
        // order of insertion preserve karne ke liye use kiye hain
        LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<>();

        // given string
        String str = "swissmississippi";
        if(str.length() == 0){
            System.out.println("Invalid Input");
            return;
        }

        // storing frequency of character of string to the lhm.
        for(int i = 0 ;i < str.length(); i++){
            char ch = str.charAt(i);
            lhm.put(ch, lhm.getOrDefault(ch,0)+1);
        }

        // abb map aa gay hain
        System.out.println(lhm);

        int max = 0;
        char ch = 0;
        boolean bool = true;
        for(char key : lhm.keySet()){
            if(lhm.get(key) == 1){
                System.out.println(key +" : "+ lhm.get(key));
                bool = false;
                break;

            }
        }
        if(bool){
            System.out.println("None");
        }

        for(char key : lhm.keySet()){
            int freq = lhm.get(key);
            if(freq > max){
                max = freq;
                ch = key;
            }
        }

        if(max != 0){
            System.out.println(ch +":"+lhm.get(ch));
        }



    }
}
