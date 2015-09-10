/*
 * Given a positive integer n, find the least 
 * number of perfect square numbers (for example, 
 * 1, 4, 9, 16, ...) which sum to n.

 * For example, given n = 12, return 3 because
 *  12 = 4 + 4 + 4; given n = 13, return 2 because 
 *  13 = 4 + 9.
 */
public class PerfectSquares {

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i * i <= n; ++i) {
            dp[i * i] = 1;
        }
        for (int i = 2; i <= n; ++i) {
            if (dp[i] == 0) {
                dp[i] = Integer.MAX_VALUE;
                for (int j = 1; j <= i / 2; ++j) {
                    dp[i] = Math.min(dp[i], dp[j] + dp[i - j]);
                }
            }
        }
        return dp[n];
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; ++i) {
            if (i * i <= n)
                dp[i * i] = 1;
            if (dp[i] == 0) {
                dp[i] = Integer.MAX_VALUE;
                for (int j = 1; j <= i / 2; ++j) {
                    dp[i] = Math.min(dp[i], dp[j] + dp[i - j]);
                }
            }
        }
        return dp[n];




        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; ++i) {
            if (Math.pow((int) Math.sqrt(i), 2) == i)
                dp[i] = 1;
            else {
                dp[i] = Integer.MAX_VALUE;
                for (int j = 1; j <= i / 2; ++j) {
                    dp[i] = Math.min(dp[i], dp[j] + dp[i - j]);
                }
            }
        }
        return dp[n];
    }

}
