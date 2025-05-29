package DynamicProgramming._2_FrogJumpEasy;
import java.util.*;

public class FrogJump {
    public static void main(String[] args) {
        int[] height = {30,10,60 , 10 , 60 , 50};
        int n = height.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        System.out.println(topDown(n-1,height));
        System.out.println(memo(n-1,height,dp));
    }
    // Top Down
    public static int topDown(int n, int[] height){
        if(n == 0){
            return 0;
        }

        int one_jump = topDown(n-1, height) + Math.abs(height[n-1]-height[n]);

        int two_jump = Integer.MAX_VALUE;

        if(n > 1){
            two_jump = topDown(n-2, height) + Math.abs(height[n-2]-height[n]);
        }

        return Math.min(one_jump, two_jump);
    }
    // Top Down + Memorization
    public static int memo(int n, int[] height, int dp[]){
        if(n == 0){
            return 0;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int one_jump = memo(n-1, height, dp) + Math.abs(height[n-1]-height[n]);
        int two_jump = Integer.MAX_VALUE;
        if(n > 1){
            two_jump = memo(n-2, height, dp) + Math.abs(height[n-2]-height[n]);
        }

        return dp[n] = Math.min(one_jump, two_jump);
    }
    // Tabulation
    public static int tabulation(int[] height){
        int[] dp = new int[height.length];
        int n = dp.length;
        dp[0] = 0;
        for(int ind = 1; ind < n; ind++){
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne= dp[ind-1] + Math.abs(height[ind]-height[ind-1]);
            if(ind>1)
                jumpTwo = dp[ind-2] + Math.abs(height[ind]-height[ind-2]);

            dp[ind]=Math.min(jumpOne, jumpTwo);
        }
        return (dp[n-1]);
    }

}
