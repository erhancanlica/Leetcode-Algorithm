package climbing_stairs;

public class Solution {
    public static void main(String[] args) {
        int res = climbStairs(5);
        System.out.println(res);
    }

    public static int climbStairs(int n) {
        if (n < 2)
            return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
