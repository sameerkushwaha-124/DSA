package Hashing;
/*
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.



Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 */
import java.util.*;
public class UniqueOccurrence {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each value
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        Set<Integer> countSet = new HashSet<>();

        // Check if the counts are unique
        for (int count : countMap.values()) {
            if (!countSet.add(count)) {
                return false; // Duplicate count found
            }
        }

        return true; // All counts are unique
    }

    public static void main(String[] args) {
        
    }
}
