//  Question Link: https://leetcode.com/explore/featured/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3353/
//  Time Complexity: O(n * m); m = amount
//  Space Complexity: O(m); m = amount

//  Unbounded Knapsack Problem(Dynamic Programming)

public int change(int amount, int[] coins) {
    int n = coins.length;
    int dp[] = new int[amount + 1];
    dp[0] = 1;
    for(int i = 0; i < n; i++)
        for(int j = coins[i]; j <= amount; j++)
            dp[j] += dp[j - coins[i]];
    return dp[amount];
}