//  Question Link: https://leetcode.com/explore/featured/card/june-leetcoding-challenge/540/week-2-june-8th-june-14th/3360/
//  Time Complexity: O(n)
//  Space Complexity: O(n)

//  Solved using Heap Data Structure.

public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
    int dp [][] = new int[n][n];
    for(int val[]: flights)
        dp[val[0]][val[1]] = val[2];
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
    
    pq.offer(new int[] {0, src, K + 1});
    
    while(!pq.isEmpty()) {
        int []cur = pq.poll();
        int cost = cur[0];
        int dest = cur[1];
        int leftStop = cur[2];
        
        if(dest == dst)
            return cost;
        if(leftStop > 0) {
            for(int i = 0; i < n; i++) {
                if(dp[dest][i] > 0) {
                    pq.offer(new int[] {cost + dp[dest][i], i, leftStop - 1});
                }
            }
        }
    }
    return -1;
}