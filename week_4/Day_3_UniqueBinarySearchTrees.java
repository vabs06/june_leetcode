//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/542/week-4-june-22nd-june-28th/3370/

class Day_3_UniqueBinarySearchTrees {
    public int numTrees(int n) {
        // Recursive
        /*
         * if (n == 0 || n == 1) return 1; int sum = 0; for (int i = 1; i <= n; i++) {
         * sum += (numTrees(n - i) * numTrees(i - 1)); } return sum;
         */
        int dp[] = new int[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++)
            for (int j = 1; j <= i; j++)
                dp[i] += (dp[j - 1] * dp[i - j]);

        return dp[n];
    }
}