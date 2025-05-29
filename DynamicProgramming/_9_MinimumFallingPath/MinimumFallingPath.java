package DynamicProgramming._9_MinimumFallingPath;

public class MinimumFallingPath {
    public int minFallingPathSum(int[][] matrix) {
        // ham start karenge last row ke kisi bhi ek element se...starting row ke kisi bhi ek element tak.
        int n = matrix[0].length;
        int m = matrix.length;
        int min = Integer.MAX_VALUE;

        // Recursion..
        // for(int j = 0; j < n; j++){
        //     min = Math.min(recursion(matrix, m-1, j), min);
        // }
        //  return min;

        // Memoization.. (Top Down)
        // int dp[][] = new int[m][n];
        // for(int arr[] : dp){
        //     Arrays.fill(arr, -1);
        // }
        // for(int j = 0; j < n; j++){
        //     min = Math.min(memo(matrix, m-1, j, dp), min);
        // }
        //  return min;



        // Tabulation (Bottom Up)
        // return tabulation(matrix, m, n);


        // Space Optimization..
        return spaceOpt(matrix, m, n);
    }

    public int recursion(int grid[][], int i, int j) {
        // base case aur out of bound wala case likh lo
        if (j < 0 || j >= grid[0].length) {
            return Integer.MAX_VALUE / 100;
        }
        if (i == 0) {
            return grid[i][j];
        }

        // traverse all the paths..
        int up = grid[i][j] + recursion(grid, i - 1, j);
        int leftDigonal = grid[i][j] + recursion(grid, i - 1, j - 1);
        int rightDigonal = grid[i][j] + recursion(grid, i - 1, j + 1);

        // do the final calculation..
        return Math.min(up, Math.min(leftDigonal, rightDigonal));
    }

    // Memo (Top Down)
    public int memo(int grid[][], int i, int j, int dp[][]) {
        if (j < 0 || j >= grid[0].length) {
            return Integer.MAX_VALUE / 100;
        }
        if (i == 0) {
            return grid[i][j];
        }

        if (dp[i][j] != -1)
            return dp[i][j];

        int up = grid[i][j] + memo(grid, i - 1, j, dp);
        int leftDigonal = grid[i][j] + memo(grid, i - 1, j - 1, dp);
        int rightDigonal = grid[i][j] + memo(grid, i - 1, j + 1, dp);

        return dp[i][j] = Math.min(up, Math.min(leftDigonal, rightDigonal));
    }

    // Tabulation (Buttom Up)
    public int tabulation(int grid[][], int m, int n) {
        int dp[][] = new int[m][n];

        // base case toh ho gya..
        for (int j = 0; j < n; j++) {
            dp[0][j] = grid[0][j];
        }

        // traverse all paths..
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int up = grid[i][j] + dp[i - 1][j];

                int leftDigonal = grid[i][j];
                if (j > 0) {
                    leftDigonal += dp[i - 1][j - 1];
                }else{
                    leftDigonal += Integer.MAX_VALUE/100;
                }
                int rightDigonal = grid[i][j];
                if (j < n - 1) {
                    rightDigonal += dp[i - 1][j + 1];
                }else{
                    rightDigonal += Integer.MAX_VALUE/100;
                }

                // taking mininum (final calculation)
                dp[i][j] = Math.min(up, Math.min(leftDigonal, rightDigonal));
            }
        }

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            min = Math.min(min, dp[m - 1][j]);
        }
        return min;
    }
    // Space Optimization.
    public int spaceOpt(int grid[][], int m, int n) {
        int prev[] = new int[n];

        // base case toh ho gya..
        for (int j = 0; j < n; j++) {
            prev[j] = grid[0][j];
        }

        // traverse all paths..
        for (int i = 1; i < m; i++) {
            int curr[] = new int[n];
            for (int j = 0; j < n; j++) {
                int up = grid[i][j] + prev[j];

                int leftDigonal = grid[i][j];
                if (j > 0) {
                    leftDigonal += prev[j - 1];
                }else{
                    leftDigonal += Integer.MAX_VALUE/100;
                }
                int rightDigonal = grid[i][j];
                if (j < n - 1) {
                    rightDigonal += prev[j + 1];
                }else{
                    rightDigonal += Integer.MAX_VALUE/100;
                }

                // taking mininum (final calculation)
                curr[j] = Math.min(up, Math.min(leftDigonal, rightDigonal));
            }
            prev = curr;
        }

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            min = Math.min(min, prev[j]);
        }
        return min;
    }
}
