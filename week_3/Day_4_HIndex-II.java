//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/541/week-3-june-15th-june-21st/3364/
//  Time Complexity: O(log n)
//  Space Complexity: O(1)

//  Solved using simple Binary Search (on top of it, if some repeated character present then return upper bound)

public int hIndex(int[] citations) {
    int N = citations.length;
    int left = 0;
    int right = N - 1;
    int mid;
    while (left <= right) {
        mid = left + (right - left) / 2;
        if (citations[mid] == (N - mid))
            return citations[mid];
        else if (citations[mid] < N - mid)
            left = mid + 1;
        else
            right = mid - 1;
    }
    return N - left;
}