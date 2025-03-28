package CodingBlocks;

import java.util.Arrays;
import java.util.Scanner;

public class WoodCuttindMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Number of trees
        int n = scanner.nextInt();
        // Input: Heights of trees
        int[] treeHeights = new int[n];
        for (int i = 0; i < n; i++) {
            treeHeights[i] = scanner.nextInt();
        }

        // Sorting the array of tree heights
        Arrays.sort(treeHeights);

        // Input: x meters of wood
        int x = scanner.nextInt();

        // Binary search to find the maximum height of the saw blade

        int low = 0;
        int high = treeHeights[n - 1];
        while (low < high) {
            int mid = (low + high + 1) / 2;

            // Calculate the total wood that can be cut at height 'mid'
            long totalWood = 0;
            for (int height : treeHeights) {
                if (height > mid) {
                    totalWood += height - mid;
                }
            }

            // Adjust the search space based on the total wood cut
            if (totalWood >= x) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(low);
    }
}
