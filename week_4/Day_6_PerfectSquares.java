//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/542/week-4-june-22nd-june-28th/3373/

class Day_6_PerfectSquares {
    public int numSquares(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int minValue = Integer.MAX_VALUE;
            int j = 1;
            while (i - (j * j) >= 0) {
                minValue = Math.min(dp[i - (j * j)] + 1, minValue);
                j++;
            }
            dp[i] = minValue;
        }
        return dp[n];
    }
}