package Hashing;
import java.util.*;
public class FrequencyMap {
    public static void main(String[] args) {
        int[] arr = {5,1, 2, 2, 3, 1, 15, 4, 4, 4, 4};

        // 1. Calculate frequencies using a Map
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // iterating
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
