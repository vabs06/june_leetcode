// Question Link:
// https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3352/
// Time Complexity: O(n log n), in worst case O(n*n).

// Neither i am using any Heap/Merge sort to achieve (n log n).

public int[][] reconstructQueue(int[][] A) {
    int n = A.length;

    Arrays.sort(A, (a, b) -> {
        if (a[0] == b[0])
            return a[1] - b[1];
        return b[0] - a[0];
    });

    ArrayList<int[]> ans = new ArrayList<>();
    for (int i = 0; i < n; i++)
        ans.add(A[i][1], A[i]);

    int res[][] = new int[n][2];
    
    int i = 0;
    for (int a[] : ans) {
        res[i][0] = a[0];
        res[i][1] = a[1];
        i++;
    }
    return res;
}