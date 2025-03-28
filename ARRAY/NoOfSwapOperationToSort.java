package ARRAY;
import java.util.*;
public class NoOfSwapOperationToSort {
    // Calculate minimum swaps needed to sort an array
    public int getMinSwaps(int[] original) {
        int swaps = 0;
        int[] target = original.clone();
        Arrays.sort(target);

        // Map to track current positions of values
        Map<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < original.length; i++) {
            pos.put(original[i], i);
        }

        // For each position, swap until correct value is placed
        for (int i = 0; i < original.length; i++) {
            if (original[i] != target[i]) {
                swaps++;
                // Update position of swapped values
                int curPos = pos.get(target[i]);
                pos.put(original[i], curPos);
                original[curPos] = original[i];
            }
        }
        return swaps;
    }

    // Constants for bit manipulation

    public int getMinSwapsAdv(long[] nodes) {
        final int SHIFT = 20;
        final int MASK = 0xFFFFF;
        int swaps = 0;
        int levelSize = nodes.length;
        for (int i = 0; i < levelSize; i++) {

            // Encode value and index: high 20 bits = value, low 20 bits = index
            nodes[i] = ((long) nodes[i] << SHIFT) + i;
        }
        // Sort nodes by their values (high 20 bits)
        Arrays.sort(nodes);

        // Count swaps needed to match indices with original positions
        for (int i = 0; i < levelSize; i++) {
            int origPos = (int) (nodes[i] & MASK);
            if (origPos != i) {
                // Swap nodes and decrement i to recheck current position
                long temp = nodes[i];
                nodes[i--] = nodes[origPos];
                nodes[origPos] = temp;
                swaps++;
            }
        }
        return swaps;
    }
    public static void main(String[] args) {
        NoOfSwapOperationToSort sol = new NoOfSwapOperationToSort();
        long[] nodes = {4, 3, 2, 1};
        int swaps = sol.getMinSwapsAdv(nodes);
        System.out.println("Minimum swaps needed: " + swaps); // Output: 2
    }

}
