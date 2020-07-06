//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/543/week-5-june-29th-june-30th/3375/

class Day_1_UniquePaths {
    private int noOfPaths(int dp[][], int m, int n, int i, int j) {
        if (i == m || j == n)
            return 0;
        if (dp[i][j] != 0)
            return dp[i][j];

        return dp[i][j] = noOfPaths(dp, m, n, i + 1, j) + noOfPaths(dp, m, n, i, j + 1);
    }

    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        dp[m - 1][n - 1] = 1;
        return noOfPaths(dp, m, n, 0, 0);
    }
}