package Hashing;
import java.util.*;
public class TheLongestSubstring {
         public  int findTheLongestSubstring(String s) {
         // Map to store the first occurrence of each bitmask state
         HashMap<Integer, Integer> stateMap = new HashMap<>();
         stateMap.put(0, -1);

         int maxLen = 0;
         int state = 0;
         for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);


             if (c == 'a') {
                 state ^= 1 << 0; // Toggle the bit for 'a'
             } else if (c == 'e') {
                 state ^= 1 << 1; // Toggle the bit for 'e'
             } else if (c == 'i') {
                 state ^= 1 << 2; // Toggle the bit for 'i'
             } else if (c == 'o') {
                 state ^= 1 << 3; // Toggle the bit for 'o'
             } else if (c == 'u') {
                 state ^= 1 << 4; // Toggle the bit for 'u'
             }


             if (stateMap.containsKey(state)) {
                 maxLen = Math.max(maxLen, i - stateMap.get(state));
             } else {
                 // Store the first occurrence of this state
                 stateMap.put(state, i);
             }
         }

         return maxLen;
     }

    public static void main(String[] args) {
        TheLongestSubstring obj = new TheLongestSubstring();
        System.out.println(obj.findTheLongestSubstring("eleetminicoworoep"));
    }
}

