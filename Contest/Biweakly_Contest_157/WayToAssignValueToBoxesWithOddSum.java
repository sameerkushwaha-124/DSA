package Contest.Biweakly_Contest_157;

public class WayToAssignValueToBoxesWithOddSum {
    // Remember You Can Assign values only 1, 2 to the boxes

    public static int countOddSumWays(int n) {
        return countWays(n, 0);
    }

    // sumParity: 0 for even, 1 for odd
    private static int countWays(int n, int sumParity) {
        if (n == 0) {
            return sumParity == 1 ? 1 : 0;
        }

        // Pick 1 → flips parity
        int pick1 = countWays(n - 1, sumParity ^ 1);
        // Pick 2 → keeps parity
        int pick2 = countWays(n - 1, sumParity);

        return pick1 + pick2;
    }

    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            System.out.println("n = " + n + ", Odd Sum Ways = " + countOddSumWays(n));
        }
    }
}
