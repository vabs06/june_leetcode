//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/541/week-3-june-15th-june-21st/3367/

class Day_7_DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[] dp = new int[n + 1];
        dp[n] = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int min = 0;
                if (i == m - 1)
                    min = dp[j + 1] - dungeon[i][j];
                else if (j == n - 1)
                    min = dp[j] - dungeon[i][j];
                else
                    min = Math.min(dp[j + 1], dp[j]) - dungeon[i][j];
                dp[j] = min > 0 ? min : 1;
            }
        }
        return dp[0];
    }
}