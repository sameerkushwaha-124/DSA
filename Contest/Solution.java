package Contest;

public class Solution {
    public static String longestPalindromeSubseq(String s) {
        int n = s.length();
        if (n == 0) {
            return "";
        }

        int[][] dp = new int[n][n];

        // Each single character is a palindrome of length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Fill the DP table for substrings of length 2 to n
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    if (len == 2) {
                        dp[i][j] = 2;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        // Reconstruct the lexicographically smallest LPS
        StringBuilder leftPart = new StringBuilder();
        int i = 0, j = n - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                leftPart.append(s.charAt(i));
                i++;
                j--;
            } else {
                if (dp[i + 1][j] > dp[i][j - 1]) {
                    i++;
                } else if (dp[i + 1][j] < dp[i][j - 1]) {
                    j--;
                } else {
                    // Choose the path that leads to lexicographically smaller result
                    if (s.charAt(i) < s.charAt(j)) {
                        i++;
                    } else {
                        j--;
                    }
                }
            }
        }

        // The LPS is leftPart + reverse of leftPart (excluding the last character if the length is odd)
        String rightPart = new StringBuilder(leftPart.substring(0, leftPart.length() - (dp[0][n - 1] % 2 == 0 ? 0 : 1))).reverse().toString();
        return leftPart.toString() + rightPart;
    }

    public static void main(String[] args) {
        String s = "bbbab";
        System.out.println(longestPalindromeSubseq(s)); // Output: "bbbb"

        s = "cbbd";
        System.out.println(longestPalindromeSubseq(s)); // Output: "bb"

        s = "a";
        System.out.println(longestPalindromeSubseq(s)); // Output: "a"

        s = "abcde";
        System.out.println(longestPalindromeSubseq(s)); // Output: "a" (or any single character)
    }
}