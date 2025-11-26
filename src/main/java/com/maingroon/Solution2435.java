package com.maingroon;

public class Solution2435 {

    private static final int MOD = 1000000007;

    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int[][][] dp = new int[m + 1][n + 1][k];
        int firstNum = grid[0][0] % k;
        dp[1][1][firstNum] = 1;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int x = 0; x < k; x++) {
                    int sum = (grid[i - 1][j - 1] + x) % k;
                    int numPaths = (dp[i - 1][j][x] + dp[i][j - 1][x]) % MOD;
                    dp[i][j][sum] = (dp[i][j][sum] + numPaths) % MOD;
                }
            }
        }

        return dp[m][n][0];
    }

//    first try solution with Time Limit Exceeded exception on LeetCode
//    public int numberOfPaths(int[][] grid, int k) {
//        return calcPaths(grid, k, 0, 0, 0);
//    }
//
//    private int calcPaths(int[][] grid, int k, int m, int n, int rem) {
//        rem = (grid[m][n] + rem) % k;
//        if (m == grid.length - 1 && n == grid[m].length - 1) {
//            return rem == 0 ? 1 : 0;
//        }
//        int paths = 0;
//        if (m < grid.length - 1) {
//            paths += calcPaths(grid, k, m + 1, n, rem);
//        }
//        if (n < grid[m].length - 1) {
//            paths += calcPaths(grid, k, m, n + 1, rem);
//        }
//        return paths;
//    }
}
